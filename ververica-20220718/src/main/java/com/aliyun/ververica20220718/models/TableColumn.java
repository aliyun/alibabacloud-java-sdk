// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class TableColumn extends TeaModel {
    @NameInMap("expression")
    public String expression;

    @NameInMap("metadataInfo")
    public MetadataInfo metadataInfo;

    @NameInMap("name")
    public String name;

    @NameInMap("nullable")
    public Boolean nullable;

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
