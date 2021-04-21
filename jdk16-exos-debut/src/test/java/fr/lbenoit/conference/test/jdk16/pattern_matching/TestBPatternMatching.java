package fr.lbenoit.conference.test.jdk16.pattern_matching;

/*-
 * #%L
 * jdk16-nouveautes-exos
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestBPatternMatching {

	@Test
	public void testMettreEnMajusculeSiTailleSuperieurA5() {
		String hello = "Hello";
		String jug = "BordeauxJUG";

		assertNull(mettreEnMajusculeSiTailleSuperieurA5(new Object()));
		assertNull(mettreEnMajusculeSiTailleSuperieurA5(hello));
		assertEquals(jug.toUpperCase(), mettreEnMajusculeSiTailleSuperieurA5(jug));
	}

	private String mettreEnMajusculeSiTailleSuperieurA5(Object obj) {
		String result = null;
		if (obj instanceof String) {
			String str = (String) obj;
			if (str.length() > 5) {
				result = str.toUpperCase();
			}
		}
		return result;
	}
}
