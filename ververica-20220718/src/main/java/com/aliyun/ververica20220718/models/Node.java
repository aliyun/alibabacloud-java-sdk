// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Node extends TeaModel {
    /**
     * <p>The name of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>paimon</p>
     */
    @NameInMap("catalogName")
    public String catalogName;

    /**
     * <p>The name of the connector.</p>
     * 
     * <strong>example:</strong>
     * <p>paimon</p>
     */
    @NameInMap("connector")
    public String connector;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>paimon-ods</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    /**
     * <p>The ID of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>97383</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>Specifies whether the table is a temporary table.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isTemporary")
    public Boolean isTemporary;

    /**
     * <p>The information about the table.</p>
     */
    @NameInMap("tables")
    public java.util.List<LineageTable> tables;

    public static Node build(java.util.Map<String, ?> map) throws Exception {
        Node self = new Node();
        return TeaModel.build(map, self);
    }

    public Node setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public Node setConnector(String connector) {
        this.connector = connector;
        return this;
    }
    public String getConnector() {
        return this.connector;
    }

    public Node setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public Node setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Node setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
        return this;
    }
    public Boolean getIsTemporary() {
        return this.isTemporary;
    }

    public Node setTables(java.util.List<LineageTable> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<LineageTable> getTables() {
        return this.tables;
    }

}
