package fr.lbenoit.conference.jdk16.records.local;

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


import java.util.List;
import java.util.stream.Collectors;

public class ClientRepository {
	
	public List<Client> findTopClient(int nbMax, List<Client> clients, int annee ) {
		// enregistrement local
		record ClientAchat(Client client, double montant) { };
		
		return clients.stream()
				.map(c -> new ClientAchat(c, Calculateur.calculMontantAchats(c, annee)))
				.sorted((r1, r2) -> Double.compare(r1.montant(), r2.montant()) * -1)
				.map(ClientAchat::client)
				.limit(nbMax)
				.collect(Collectors.toList());
		
	}
	
}
