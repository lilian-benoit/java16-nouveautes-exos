package fr.lbenoit.conference.jdk16.records;

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


import java.io.Serializable;

//Bordeaux => var bordeaux = new Position(44.841225, -0.5800364);
public record Position(double latitude, double longitude) implements Serializable { 
	public Position {
		if (latitude > 90 || latitude < -90 || longitude > 90 || longitude < -90) {
			throw new IllegalArgumentException(String.format("latitude et longitude doivent être comprises entre -90 et 90. (latitude : %f, longitude : %f)", latitude, longitude));
		}
	}

}
