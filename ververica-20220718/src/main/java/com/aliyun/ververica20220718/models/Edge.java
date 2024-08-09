// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Edge extends TeaModel {
    @NameInMap("columnLineage")
    public java.util.List<Relation> columnLineage;

    @NameInMap("tableLineage")
    public java.util.List<Relation> tableLineage;

    public static Edge build(java.util.Map<String, ?> map) throws Exception {
        Edge self = new Edge();
        return TeaModel.build(map, self);
    }

    public Edge setColumnLineage(java.util.List<Relation> columnLineage) {
        this.columnLineage = columnLineage;
        return this;
    }
    public java.util.List<Relation> getColumnLineage() {
        return this.columnLineage;
    }

    public Edge setTableLineage(java.util.List<Relation> tableLineage) {
        this.tableLineage = tableLineage;
        return this;
    }
    public java.util.List<Relation> getTableLineage() {
        return this.tableLineage;
    }

}
