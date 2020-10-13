// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class CreateTableShrinkRequest extends TeaModel {
    // 创建表所在数据库的名称
    @NameInMap("DbName")
    public String dbName;

    // 创建表的名称
    @NameInMap("TableName")
    public String tableName;

    // 分区字段，可选
    @NameInMap("PartitionKeys")
    public String partitionKeysShrink;

    // 表属性
    @NameInMap("Parameters")
    public String parametersShrink;

    // storageDescriptorModel
    @NameInMap("StorageDescriptor")
    public String storageDescriptorShrink;

    // 视图的原始 SQL
    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    // 视图的展开 SQL
    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    // 表的类型
    @NameInMap("TableType")
    public String tableType;

    public static CreateTableShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableShrinkRequest self = new CreateTableShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateTableShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateTableShrinkRequest setPartitionKeysShrink(String partitionKeysShrink) {
        this.partitionKeysShrink = partitionKeysShrink;
        return this;
    }
    public String getPartitionKeysShrink() {
        return this.partitionKeysShrink;
    }

    public CreateTableShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public CreateTableShrinkRequest setStorageDescriptorShrink(String storageDescriptorShrink) {
        this.storageDescriptorShrink = storageDescriptorShrink;
        return this;
    }
    public String getStorageDescriptorShrink() {
        return this.storageDescriptorShrink;
    }

    public CreateTableShrinkRequest setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    public CreateTableShrinkRequest setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    public CreateTableShrinkRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
