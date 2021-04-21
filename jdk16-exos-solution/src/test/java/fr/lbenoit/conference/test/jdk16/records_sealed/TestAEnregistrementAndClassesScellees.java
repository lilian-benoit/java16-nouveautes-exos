package fr.lbenoit.conference.test.jdk16.records_sealed;

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


import org.junit.Assert;
import org.junit.Test;

import fr.lbenoit.conference.jdk16.records_sealed.Noeud;

public class TestAEnregistrementAndClassesScellees {

	@Test
	public void TestCasEvaluationArbre() {
		//            M(r)
		//         /        \
		//      M(n1)        F(n2)
		//    /      \
		//F(n3)       A(n4)
		//          /      \
		//      F(n5)       F(n6)
		Noeud n6 = new Noeud.Feuille(1.0);
		Noeud n5 = new Noeud.Feuille(3.0);
		Noeud n4 = new Noeud.Addition(n5, n6);
		Noeud n3 = new Noeud.Feuille(4.0);
		Noeud n2 = new Noeud.Feuille(2.0);
		Noeud n1 = new Noeud.Multiplication(n3, n4);
		Noeud r  = new Noeud.Multiplication(n1, n2);
		
		System.out.println(r.eval());
		Assert.assertEquals("L'évaluation de l'arbre a échouée", 32.0, r.eval(), 0);
	}
}
