package fr.lbenoit.conference.test.jdk16.records;

/*-
 * #%L
 * jdk16-nouveautes
 * %%
 * Copyright (C) 2021 Lilian BENOIT
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Test;

import fr.lbenoit.conference.jdk16.records.Position;
import fr.lbenoit.conference.jdk16.records.serialisation.PositionClass;

public class TestESerialisationCasErreur {

	@Test
	public void Serialiser() throws Exception {
		try (FileOutputStream fos = new FileOutputStream("target/position.serial");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(new PositionClass(250d, 2.352221)); // latitude incorrecte
			oos.writeObject(new Position(245, -0.5800364)); // latitude incorrecte
		}
		Files.copy(Path.of("target/position.serial"), Path.of("target/position2.serial"));
	}

	@Test
	public void Deserialiser() throws Exception {
		try (FileInputStream fis = new FileInputStream("target/position.serial");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
		}
	}

}
