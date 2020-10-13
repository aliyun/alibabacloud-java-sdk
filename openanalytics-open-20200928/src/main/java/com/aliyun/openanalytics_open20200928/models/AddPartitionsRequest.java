// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class AddPartitionsRequest extends TeaModel {
    // 添加的分区
    @NameInMap("Partition")
    public java.util.List<AddPartitionsRequestPartition> partition;

    public static AddPartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPartitionsRequest self = new AddPartitionsRequest();
        return TeaModel.build(map, self);
    }

    public AddPartitionsRequest setPartition(java.util.List<AddPartitionsRequestPartition> partition) {
        this.partition = partition;
        return this;
    }
    public java.util.List<AddPartitionsRequestPartition> getPartition() {
        return this.partition;
    }

    public static class AddPartitionsRequestPartitionStorageDescriptorCol extends TeaModel {
        // 列注释
        @NameInMap("Comment")
        public String comment;

        // 列名
        @NameInMap("Name")
        public String name;

        // 列类型
        @NameInMap("Type")
        public String type;

        public static AddPartitionsRequestPartitionStorageDescriptorCol build(java.util.Map<String, ?> map) throws Exception {
            AddPartitionsRequestPartitionStorageDescriptorCol self = new AddPartitionsRequestPartitionStorageDescriptorCol();
            return TeaModel.build(map, self);
        }

        public AddPartitionsRequestPartitionStorageDescriptorCol setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public AddPartitionsRequestPartitionStorageDescriptorCol setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddPartitionsRequestPartitionStorageDescriptorCol setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AddPartitionsRequestPartitionStorageDescriptorSerDeInfo extends TeaModel {
        // SerDe 的名字
        @NameInMap("Name")
        public String name;

        // SerDe 的
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerDe 的 serializationLib 信息
        @NameInMap("SerializationLib")
        public String serializationLib;

        public static AddPartitionsRequestPartitionStorageDescriptorSerDeInfo build(java.util.Map<String, ?> map) throws Exception {
            AddPartitionsRequestPartitionStorageDescriptorSerDeInfo self = new AddPartitionsRequestPartitionStorageDescriptorSerDeInfo();
            return TeaModel.build(map, self);
        }

        public AddPartitionsRequestPartitionStorageDescriptorSerDeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddPartitionsRequestPartitionStorageDescriptorSerDeInfo setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public AddPartitionsRequestPartitionStorageDescriptorSerDeInfo setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

    }

    public static class AddPartitionsRequestPartitionStorageDescriptor extends TeaModel {
        // 表的列信息
        @NameInMap("Col")
        public java.util.List<AddPartitionsRequestPartitionStorageDescriptorCol> col;

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
        public AddPartitionsRequestPartitionStorageDescriptorSerDeInfo serDeInfo;

        public static AddPartitionsRequestPartitionStorageDescriptor build(java.util.Map<String, ?> map) throws Exception {
            AddPartitionsRequestPartitionStorageDescriptor self = new AddPartitionsRequestPartitionStorageDescriptor();
            return TeaModel.build(map, self);
        }

        public AddPartitionsRequestPartitionStorageDescriptor setCol(java.util.List<AddPartitionsRequestPartitionStorageDescriptorCol> col) {
            this.col = col;
            return this;
        }
        public java.util.List<AddPartitionsRequestPartitionStorageDescriptorCol> getCol() {
            return this.col;
        }

        public AddPartitionsRequestPartitionStorageDescriptor setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public AddPartitionsRequestPartitionStorageDescriptor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public AddPartitionsRequestPartitionStorageDescriptor setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public AddPartitionsRequestPartitionStorageDescriptor setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public AddPartitionsRequestPartitionStorageDescriptor setSerDeInfo(AddPartitionsRequestPartitionStorageDescriptorSerDeInfo serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }
        public AddPartitionsRequestPartitionStorageDescriptorSerDeInfo getSerDeInfo() {
            return this.serDeInfo;
        }

    }

    public static class AddPartitionsRequestPartition extends TeaModel {
        // 数据库名称
        @NameInMap("DbName")
        public String dbName;

        // 分区属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // 分区的 StorageDescriptor 
        @NameInMap("StorageDescriptor")
        public AddPartitionsRequestPartitionStorageDescriptor storageDescriptor;

        // 表名
        @NameInMap("TableName")
        public String tableName;

        // 需要添加的分区
        @NameInMap("Values")
        public java.util.List<String> values;

        public static AddPartitionsRequestPartition build(java.util.Map<String, ?> map) throws Exception {
            AddPartitionsRequestPartition self = new AddPartitionsRequestPartition();
            return TeaModel.build(map, self);
        }

        public AddPartitionsRequestPartition setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public AddPartitionsRequestPartition setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public AddPartitionsRequestPartition setStorageDescriptor(AddPartitionsRequestPartitionStorageDescriptor storageDescriptor) {
            this.storageDescriptor = storageDescriptor;
            return this;
        }
        public AddPartitionsRequestPartitionStorageDescriptor getStorageDescriptor() {
            return this.storageDescriptor;
        }

        public AddPartitionsRequestPartition setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public AddPartitionsRequestPartition setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
