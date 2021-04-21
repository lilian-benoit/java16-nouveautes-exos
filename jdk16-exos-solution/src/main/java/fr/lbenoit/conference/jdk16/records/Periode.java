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


import java.time.LocalDate;

public record Periode(LocalDate debut, LocalDate fin) {

	public Periode {
		if ((debut == null || fin == null) || debut.isAfter(fin)) {
			throw new IllegalArgumentException(
					String.format("la date de début doit être antérieure à la date de fin ( debut : %s, fin :%s",
							debut, fin));
		}
	}
}
