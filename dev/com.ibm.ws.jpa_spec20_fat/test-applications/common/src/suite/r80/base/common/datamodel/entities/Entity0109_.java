/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package suite.r80.base.common.datamodel.entities;

import java.sql.Timestamp;

import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel(value = suite.r80.base.common.datamodel.entities.Entity0109.class)
public class Entity0109_ {
    public static volatile SingularAttribute<Entity0109, Float> entity0109_id1;
    public static volatile SingularAttribute<Entity0109, Float> entity0109_id2;
    public static volatile SingularAttribute<Entity0109, String> entity0109_string01;
    public static volatile SingularAttribute<Entity0109, String> entity0109_string02;
    public static volatile SingularAttribute<Entity0109, String> entity0109_string03;
    public static volatile SingularAttribute<Entity0109, Timestamp> entity0109_version;
}
