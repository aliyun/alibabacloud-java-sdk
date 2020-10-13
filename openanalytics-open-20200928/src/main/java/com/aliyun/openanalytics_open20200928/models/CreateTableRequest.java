// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class CreateTableRequest extends TeaModel {
    // 创建表所在数据库的名称
    @NameInMap("DbName")
    public String dbName;

    // 创建表的名称
    @NameInMap("TableName")
    public String tableName;

    // 分区字段，可选
    @NameInMap("PartitionKeys")
    public java.util.List<CreateTableRequestPartitionKeys> partitionKeys;

    // 表属性
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    // storageDescriptorModel
    @NameInMap("StorageDescriptor")
    public CreateTableRequestStorageDescriptor storageDescriptor;

    // 视图的原始 SQL
    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    // 视图的展开 SQL
    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    // 表的类型
    @NameInMap("TableType")
    public String tableType;

    public static CreateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableRequest self = new CreateTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateTableRequest setPartitionKeys(java.util.List<CreateTableRequestPartitionKeys> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<CreateTableRequestPartitionKeys> getPartitionKeys() {
        return this.partitionKeys;
    }

    public CreateTableRequest setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public CreateTableRequest setStorageDescriptor(CreateTableRequestStorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }
    public CreateTableRequestStorageDescriptor getStorageDescriptor() {
        return this.storageDescriptor;
    }

    public CreateTableRequest setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    public CreateTableRequest setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    public CreateTableRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public static class CreateTableRequestPartitionKeys extends TeaModel {
        // 分区字段的注释
        @NameInMap("Comment")
        public String comment;

        // 分区字段的列名
        @NameInMap("Name")
        public String name;

        // 分区字段的类型
        @NameInMap("Type")
        public String type;

        public static CreateTableRequestPartitionKeys build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestPartitionKeys self = new CreateTableRequestPartitionKeys();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestPartitionKeys setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateTableRequestPartitionKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTableRequestPartitionKeys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateTableRequestStorageDescriptorCols extends TeaModel {
        // 列注释
        @NameInMap("Comment")
        public String comment;

        // 列名
        @NameInMap("Name")
        public String name;

        // 列类型
        @NameInMap("Type")
        public String type;

        public static CreateTableRequestStorageDescriptorCols build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestStorageDescriptorCols self = new CreateTableRequestStorageDescriptorCols();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestStorageDescriptorCols setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateTableRequestStorageDescriptorCols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTableRequestStorageDescriptorCols setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateTableRequestStorageDescriptorSerDeInfo extends TeaModel {
        // SerDe 的名字
        @NameInMap("Name")
        public String name;

        // SerDe 的属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerDe 的 serializationLib 信息
        @NameInMap("SerializationLib")
        public String serializationLib;

        public static CreateTableRequestStorageDescriptorSerDeInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestStorageDescriptorSerDeInfo self = new CreateTableRequestStorageDescriptorSerDeInfo();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestStorageDescriptorSerDeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTableRequestStorageDescriptorSerDeInfo setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public CreateTableRequestStorageDescriptorSerDeInfo setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

    }

    public static class CreateTableRequestStorageDescriptor extends TeaModel {
        // 表的列信息
        @NameInMap("Cols")
        public java.util.List<CreateTableRequestStorageDescriptorCols> cols;

        // 表的 inputFormat
        @NameInMap("InputFormat")
        public String inputFormat;

        // 表路径
        @NameInMap("Location")
        public String location;

        // 表的 outputFormat
        @NameInMap("OutputFormat")
        public String outputFormat;

        // StorageDescriptor 的属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // 表的 serDeInfo
        @NameInMap("SerDeInfo")
        public CreateTableRequestStorageDescriptorSerDeInfo serDeInfo;

        public static CreateTableRequestStorageDescriptor build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestStorageDescriptor self = new CreateTableRequestStorageDescriptor();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestStorageDescriptor setCols(java.util.List<CreateTableRequestStorageDescriptorCols> cols) {
            this.cols = cols;
            return this;
        }
        public java.util.List<CreateTableRequestStorageDescriptorCols> getCols() {
            return this.cols;
        }

        public CreateTableRequestStorageDescriptor setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public CreateTableRequestStorageDescriptor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public CreateTableRequestStorageDescriptor setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public CreateTableRequestStorageDescriptor setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public CreateTableRequestStorageDescriptor setSerDeInfo(CreateTableRequestStorageDescriptorSerDeInfo serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }
        public CreateTableRequestStorageDescriptorSerDeInfo getSerDeInfo() {
            return this.serDeInfo;
        }

    }

}
