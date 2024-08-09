// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class PrimaryKey extends TeaModel {
    @NameInMap("columns")
    public java.util.List<String> columns;

    @NameInMap("constraintName")
    public String constraintName;

    public static PrimaryKey build(java.util.Map<String, ?> map) throws Exception {
        PrimaryKey self = new PrimaryKey();
        return TeaModel.build(map, self);
    }

    public PrimaryKey setColumns(java.util.List<String> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<String> getColumns() {
        return this.columns;
    }

    public PrimaryKey setConstraintName(String constraintName) {
        this.constraintName = constraintName;
        return this;
    }
    public String getConstraintName() {
        return this.constraintName;
    }

}
