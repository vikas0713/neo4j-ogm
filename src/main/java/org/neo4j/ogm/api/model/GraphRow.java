package org.neo4j.ogm.api.model;

/**
 * @author vince
 */
public interface GraphRow {

    public Graph getGraph();

    public Object[] getRow();


}