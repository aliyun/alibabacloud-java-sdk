// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class ColumnMetadata extends TeaModel {
    @NameInMap("ArrayBaseColumnType")
    public Integer arrayBaseColumnType;

    @NameInMap("IsAutoIncrement")
    public Boolean isAutoIncrement;

    @NameInMap("IsCaseSensitive")
    public Boolean isCaseSensitive;

    @NameInMap("IsCurrency")
    public Boolean isCurrency;

    @NameInMap("IsSigned")
    public Boolean isSigned;

    @NameInMap("Label")
    public String label;

    @NameInMap("Name")
    public String name;

    @NameInMap("Nullable")
    public Integer nullable;

    @NameInMap("Precision")
    public Integer precision;

    @NameInMap("Scale")
    public Integer scale;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("TypeName")
    public String typeName;

    public static ColumnMetadata build(java.util.Map<String, ?> map) throws Exception {
        ColumnMetadata self = new ColumnMetadata();
        return TeaModel.build(map, self);
    }

    public ColumnMetadata setArrayBaseColumnType(Integer arrayBaseColumnType) {
        this.arrayBaseColumnType = arrayBaseColumnType;
        return this;
    }
    public Integer getArrayBaseColumnType() {
        return this.arrayBaseColumnType;
    }

    public ColumnMetadata setIsAutoIncrement(Boolean isAutoIncrement) {
        this.isAutoIncrement = isAutoIncrement;
        return this;
    }
    public Boolean getIsAutoIncrement() {
        return this.isAutoIncrement;
    }

    public ColumnMetadata setIsCaseSensitive(Boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
        return this;
    }
    public Boolean getIsCaseSensitive() {
        return this.isCaseSensitive;
    }

    public ColumnMetadata setIsCurrency(Boolean isCurrency) {
        this.isCurrency = isCurrency;
        return this;
    }
    public Boolean getIsCurrency() {
        return this.isCurrency;
    }

    public ColumnMetadata setIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
        return this;
    }
    public Boolean getIsSigned() {
        return this.isSigned;
    }

    public ColumnMetadata setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ColumnMetadata setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ColumnMetadata setNullable(Integer nullable) {
        this.nullable = nullable;
        return this;
    }
    public Integer getNullable() {
        return this.nullable;
    }

    public ColumnMetadata setPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }
    public Integer getPrecision() {
        return this.precision;
    }

    public ColumnMetadata setScale(Integer scale) {
        this.scale = scale;
        return this;
    }
    public Integer getScale() {
        return this.scale;
    }

    public ColumnMetadata setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ColumnMetadata setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ColumnMetadata setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ColumnMetadata setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

}
