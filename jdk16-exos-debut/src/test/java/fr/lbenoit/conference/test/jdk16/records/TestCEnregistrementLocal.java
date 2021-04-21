package fr.lbenoit.conference.test.jdk16.records;

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
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import fr.lbenoit.conference.jdk16.records.local.Client;
import fr.lbenoit.conference.jdk16.records.local.ClientRepository;

public class TestCEnregistrementLocal {

	ClientRepository clientRepository = new ClientRepository();

	Client marie = new Client("Marie");
	Client paul = new Client("Paul");
	Client pierre = new Client("Pierre");

	@Test
	public void TestCasNominal() {
		List<Client> clients = List.of(marie, paul, pierre);
		
		// les 2 meilleurs clients de l'année 2020
		List<Client> topClients = clientRepository.findTopClient(2, clients, 2020);
		System.out.println(topClients);

		assertEquals(topClients.size(), 2);
		assertTrue("Pierre fait partie des top clients", topClients.contains(pierre));
		assertTrue("Marie fait partie des top clients", topClients.contains(marie));
	}

}
