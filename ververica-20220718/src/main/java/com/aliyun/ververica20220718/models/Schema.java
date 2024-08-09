// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Schema extends TeaModel {
    @NameInMap("columns")
    public java.util.List<TableColumn> columns;

    @NameInMap("primaryKey")
    public java.util.List<PrimaryKey> primaryKey;

    @NameInMap("watermarkSpecs")
    public java.util.List<WatermarkSpec> watermarkSpecs;

    public static Schema build(java.util.Map<String, ?> map) throws Exception {
        Schema self = new Schema();
        return TeaModel.build(map, self);
    }

    public Schema setColumns(java.util.List<TableColumn> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<TableColumn> getColumns() {
        return this.columns;
    }

    public Schema setPrimaryKey(java.util.List<PrimaryKey> primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public java.util.List<PrimaryKey> getPrimaryKey() {
        return this.primaryKey;
    }

    public Schema setWatermarkSpecs(java.util.List<WatermarkSpec> watermarkSpecs) {
        this.watermarkSpecs = watermarkSpecs;
        return this;
    }
    public java.util.List<WatermarkSpec> getWatermarkSpecs() {
        return this.watermarkSpecs;
    }

}
