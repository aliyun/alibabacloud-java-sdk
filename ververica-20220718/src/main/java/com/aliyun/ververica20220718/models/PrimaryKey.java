// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class PrimaryKey extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("columns")
    public java.util.List<String> columns;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("constraintName")
    public String constraintName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("constraintType")
    public String constraintType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("enforced")
    public Boolean enforced;

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

    public PrimaryKey setConstraintType(String constraintType) {
        this.constraintType = constraintType;
        return this;
    }
    public String getConstraintType() {
        return this.constraintType;
    }

    public PrimaryKey setEnforced(Boolean enforced) {
        this.enforced = enforced;
        return this;
    }
    public Boolean getEnforced() {
        return this.enforced;
    }

}
