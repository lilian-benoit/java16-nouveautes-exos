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

import org.junit.Assert;
import org.junit.Test;

import fr.lbenoit.conference.jdk16.records.Periode;

public class TestAPeriode {

	@Test
	public void TestPeriodeCasNominal() {
		Periode nouvellePeriode = new Periode(LocalDate.of(2021, 01, 01), LocalDate.of(2021, 01, 31));
		System.out.println(nouvellePeriode);
		Assert.assertEquals("La période n'a pas bien était construite", "Periode[debut=2021-01-01, fin=2021-01-31]", nouvellePeriode.toString());
	}
	
}
