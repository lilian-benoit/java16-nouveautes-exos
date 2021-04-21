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


import java.time.LocalDate;

import org.junit.Test;

import fr.lbenoit.conference.jdk16.records.Periode;

public class TestBPeriode {

	@Test(expected = IllegalArgumentException.class)
	public void TestPeriodeCasErreurDateInverse() {
		Periode nouvellePeriode = new Periode(LocalDate.of(2021, 01, 31), LocalDate.of(2021, 01, 01));
		System.out.println(nouvellePeriode);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestPeriodeCasErreurAvecDateNulle() {
		Periode nouvellePeriode = new Periode(null, LocalDate.of(2021, 01, 01));
		System.out.println(nouvellePeriode);
	}
}
