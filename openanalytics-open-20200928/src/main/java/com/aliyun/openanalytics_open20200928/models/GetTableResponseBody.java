// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetTableResponseBody extends TeaModel {
    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 请求的 ID
    @NameInMap("RequestId")
    public String requestId;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    // 获取的表信息
    @NameInMap("Table")
    public GetTableResponseBodyTable table;

    public static GetTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableResponseBody self = new GetTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTableResponseBody setTable(GetTableResponseBodyTable table) {
        this.table = table;
        return this;
    }
    public GetTableResponseBodyTable getTable() {
        return this.table;
    }

    public static class GetTableResponseBodyTablePartitionKeys extends TeaModel {
        // 分区注释
        @NameInMap("Comment")
        public String comment;

        // 分区名称
        @NameInMap("Name")
        public String name;

        // 分区类型
        @NameInMap("Type")
        public String type;

        public static GetTableResponseBodyTablePartitionKeys build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyTablePartitionKeys self = new GetTableResponseBodyTablePartitionKeys();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyTablePartitionKeys setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableResponseBodyTablePartitionKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableResponseBodyTablePartitionKeys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableResponseBodyTableStorageDescriptorCols extends TeaModel {
        // 列注释
        @NameInMap("Comment")
        public String comment;

        // 列名称
        @NameInMap("Name")
        public String name;

        // 列类型
        @NameInMap("Type")
        public String type;

        public static GetTableResponseBodyTableStorageDescriptorCols build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyTableStorageDescriptorCols self = new GetTableResponseBodyTableStorageDescriptorCols();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyTableStorageDescriptorCols setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableResponseBodyTableStorageDescriptorCols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableResponseBodyTableStorageDescriptorCols setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableResponseBodyTableStorageDescriptorSerDeInfo extends TeaModel {
        // SerDe 的名称
        @NameInMap("Name")
        public String name;

        // SerDe 的属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerDe 的 serializationLib
        @NameInMap("SerializationLib")
        public String serializationLib;

        public static GetTableResponseBodyTableStorageDescriptorSerDeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyTableStorageDescriptorSerDeInfo self = new GetTableResponseBodyTableStorageDescriptorSerDeInfo();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyTableStorageDescriptorSerDeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableResponseBodyTableStorageDescriptorSerDeInfo setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetTableResponseBodyTableStorageDescriptorSerDeInfo setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

    }

    public static class GetTableResponseBodyTableStorageDescriptor extends TeaModel {
        // 表的列信息
        @NameInMap("Cols")
        public java.util.List<GetTableResponseBodyTableStorageDescriptorCols> cols;

        // 表的 inputFormat
        @NameInMap("InputFormat")
        public String inputFormat;

        // 表路径
        @NameInMap("Location")
        public String location;

        // 表的 outputFormat
        @NameInMap("OutputFormat")
        public String outputFormat;

        // SD 的属性
        @NameInMap("Parameters")
        public java.util.Map<String, ?> parameters;

        // 表的 SerDe 信息
        @NameInMap("SerDeInfo")
        public GetTableResponseBodyTableStorageDescriptorSerDeInfo serDeInfo;

        public static GetTableResponseBodyTableStorageDescriptor build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyTableStorageDescriptor self = new GetTableResponseBodyTableStorageDescriptor();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyTableStorageDescriptor setCols(java.util.List<GetTableResponseBodyTableStorageDescriptorCols> cols) {
            this.cols = cols;
            return this;
        }
        public java.util.List<GetTableResponseBodyTableStorageDescriptorCols> getCols() {
            return this.cols;
        }

        public GetTableResponseBodyTableStorageDescriptor setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public GetTableResponseBodyTableStorageDescriptor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetTableResponseBodyTableStorageDescriptor setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public GetTableResponseBodyTableStorageDescriptor setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public GetTableResponseBodyTableStorageDescriptor setSerDeInfo(GetTableResponseBodyTableStorageDescriptorSerDeInfo serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }
        public GetTableResponseBodyTableStorageDescriptorSerDeInfo getSerDeInfo() {
            return this.serDeInfo;
        }

    }

    public static class GetTableResponseBodyTable extends TeaModel {
        // 表的创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 数据库名称
        @NameInMap("DbName")
        public String dbName;

        // 最后一次访问时间
        @NameInMap("LastAccessTime")
        public Long lastAccessTime;

        // 表的所属用户
        @NameInMap("Owner")
        public String owner;

        // 表属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // 分区信息
        @NameInMap("PartitionKeys")
        public java.util.List<GetTableResponseBodyTablePartitionKeys> partitionKeys;

        // 表的 sd 信息
        @NameInMap("StorageDescriptor")
        public GetTableResponseBodyTableStorageDescriptor storageDescriptor;

        // 表的名称
        @NameInMap("TableName")
        public String tableName;

        // 表的类型
        @NameInMap("TableType")
        public String tableType;

        // 如果表是视图，则存储扩展视图SQL
        @NameInMap("ViewExpandedText")
        public String viewExpandedText;

        // 如果表是视图，则存储原生视图SQL
        @NameInMap("ViewOriginalText")
        public String viewOriginalText;

        public static GetTableResponseBodyTable build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyTable self = new GetTableResponseBodyTable();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyTable setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTableResponseBodyTable setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetTableResponseBodyTable setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetTableResponseBodyTable setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTableResponseBodyTable setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetTableResponseBodyTable setPartitionKeys(java.util.List<GetTableResponseBodyTablePartitionKeys> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public java.util.List<GetTableResponseBodyTablePartitionKeys> getPartitionKeys() {
            return this.partitionKeys;
        }

        public GetTableResponseBodyTable setStorageDescriptor(GetTableResponseBodyTableStorageDescriptor storageDescriptor) {
            this.storageDescriptor = storageDescriptor;
            return this;
        }
        public GetTableResponseBodyTableStorageDescriptor getStorageDescriptor() {
            return this.storageDescriptor;
        }

        public GetTableResponseBodyTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetTableResponseBodyTable setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

        public GetTableResponseBodyTable setViewExpandedText(String viewExpandedText) {
            this.viewExpandedText = viewExpandedText;
            return this;
        }
        public String getViewExpandedText() {
            return this.viewExpandedText;
        }

        public GetTableResponseBodyTable setViewOriginalText(String viewOriginalText) {
            this.viewOriginalText = viewOriginalText;
            return this;
        }
        public String getViewOriginalText() {
            return this.viewOriginalText;
        }

    }

}
