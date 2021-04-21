package fr.lbenoit.conference.jdk16.records_sealed;

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


public sealed interface Noeud
	permits Noeud.Feuille, Noeud.Multiplication, Noeud.Addition {
	
	public double eval();

	public record Feuille(double val) implements Noeud { 
		public double eval() {
			return val;
		}
	}
	public record Multiplication(Noeud gauche, Noeud droite) implements Noeud {
		public double eval() {
			return gauche.eval() * droite.eval();
		}
	}
	public record Addition(Noeud gauche, Noeud droite) implements Noeud {
		public double eval() {
			return gauche.eval() + droite.eval();
		}
	}
}
