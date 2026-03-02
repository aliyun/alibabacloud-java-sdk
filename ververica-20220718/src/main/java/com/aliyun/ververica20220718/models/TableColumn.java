// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class TableColumn extends TeaModel {
    /**
     * <p>The computed column.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("expression")
    public String expression;

    @NameInMap("logicalType")
    public String logicalType;

    /**
     * <p>The metadata information.</p>
     */
    @NameInMap("metadataInfo")
    public MetadataInfo metadataInfo;

    /**
     * <p>The column name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether the column can have a null value.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("nullable")
    public Boolean nullable;

    /**
     * <p>The data type of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("type")
    public String type;

    public static TableColumn build(java.util.Map<String, ?> map) throws Exception {
        TableColumn self = new TableColumn();
        return TeaModel.build(map, self);
    }

    public TableColumn setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public TableColumn setLogicalType(String logicalType) {
        this.logicalType = logicalType;
        return this;
    }
    public String getLogicalType() {
        return this.logicalType;
    }

    public TableColumn setMetadataInfo(MetadataInfo metadataInfo) {
        this.metadataInfo = metadataInfo;
        return this;
    }
    public MetadataInfo getMetadataInfo() {
        return this.metadataInfo;
    }

    public TableColumn setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TableColumn setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public TableColumn setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
