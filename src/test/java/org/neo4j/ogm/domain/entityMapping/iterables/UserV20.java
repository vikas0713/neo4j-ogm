/*
 * Copyright (c) 2002-2015 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 *
 */

package org.neo4j.ogm.domain.entityMapping.iterables;


import java.util.List;

import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.domain.entityMapping.Entity;
import org.neo4j.ogm.domain.entityMapping.PlainUser;

/**
 * Two iterables with same relationship type and direction, outgoing. Fields annotated.
 * @author Luanne Misquitta
 */
public class UserV20 extends Entity {

	@Relationship(type = "KNOWS")
	public List<PlainUser> plainUsers;

	@Relationship(type = "KNOWS")
	public UserV20 user;

	public UserV20() {
	}
}