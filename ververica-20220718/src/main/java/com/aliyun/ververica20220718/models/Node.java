// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Node extends TeaModel {
    @NameInMap("catalogName")
    public String catalogName;

    @NameInMap("connector")
    public String connector;

    @NameInMap("databaseName")
    public String databaseName;

    @NameInMap("id")
    public String id;

    @NameInMap("isTemporary")
    public Boolean isTemporary;

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
