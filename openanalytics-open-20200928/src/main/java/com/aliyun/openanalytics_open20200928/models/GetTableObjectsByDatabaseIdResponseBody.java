// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetTableObjectsByDatabaseIdResponseBody extends TeaModel {
    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // 查询到的所有表
    @NameInMap("Data")
    public java.util.List<GetTableObjectsByDatabaseIdResponseBodyData> data;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 请求的 ID
    @NameInMap("RequestId")
    public String requestId;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetTableObjectsByDatabaseIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableObjectsByDatabaseIdResponseBody self = new GetTableObjectsByDatabaseIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableObjectsByDatabaseIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableObjectsByDatabaseIdResponseBody setData(java.util.List<GetTableObjectsByDatabaseIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTableObjectsByDatabaseIdResponseBodyData> getData() {
        return this.data;
    }

    public GetTableObjectsByDatabaseIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableObjectsByDatabaseIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableObjectsByDatabaseIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTableObjectsByDatabaseIdResponseBodyDataPartitionKeys extends TeaModel {
        // 分区注释
        @NameInMap("Comment")
        public String comment;

        // 分区名称
        @NameInMap("Name")
        public String name;

        // 分区类型
        @NameInMap("Type")
        public String type;

        public static GetTableObjectsByDatabaseIdResponseBodyDataPartitionKeys build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsByDatabaseIdResponseBodyDataPartitionKeys self = new GetTableObjectsByDatabaseIdResponseBodyDataPartitionKeys();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataPartitionKeys setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataPartitionKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataPartitionKeys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorCols extends TeaModel {
        // 列注释
        @NameInMap("Comment")
        public String comment;

        // 列名称
        @NameInMap("Name")
        public String name;

        // 列类型
        @NameInMap("Type")
        public String type;

        public static GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorCols build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorCols self = new GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorCols();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorCols setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorCols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorCols setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorSerDeInfo extends TeaModel {
        // SerDe 的名称
        @NameInMap("Name")
        public String name;

        // SerDe 的属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerDe 的 serializationLib
        @NameInMap("SerializationLib")
        public String serializationLib;

        public static GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorSerDeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorSerDeInfo self = new GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorSerDeInfo();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorSerDeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorSerDeInfo setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorSerDeInfo setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

    }

    public static class GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor extends TeaModel {
        // 表的列信息
        @NameInMap("Cols")
        public java.util.List<GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorCols> cols;

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
        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorSerDeInfo serDeInfo;

        public static GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor self = new GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor setCols(java.util.List<GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorCols> cols) {
            this.cols = cols;
            return this;
        }
        public java.util.List<GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorCols> getCols() {
            return this.cols;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor setSerDeInfo(GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorSerDeInfo serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }
        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptorSerDeInfo getSerDeInfo() {
            return this.serDeInfo;
        }

    }

    public static class GetTableObjectsByDatabaseIdResponseBodyData extends TeaModel {
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
        public java.util.List<GetTableObjectsByDatabaseIdResponseBodyDataPartitionKeys> partitionKeys;

        // 表的 sd 信息
        @NameInMap("StorageDescriptor")
        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor storageDescriptor;

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

        // 表 ID
        @NameInMap("TblId")
        public Long tblId;

        // 数据库 ID
        @NameInMap("DBId")
        public Long DBId;

        public static GetTableObjectsByDatabaseIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsByDatabaseIdResponseBodyData self = new GetTableObjectsByDatabaseIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setPartitionKeys(java.util.List<GetTableObjectsByDatabaseIdResponseBodyDataPartitionKeys> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public java.util.List<GetTableObjectsByDatabaseIdResponseBodyDataPartitionKeys> getPartitionKeys() {
            return this.partitionKeys;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setStorageDescriptor(GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor storageDescriptor) {
            this.storageDescriptor = storageDescriptor;
            return this;
        }
        public GetTableObjectsByDatabaseIdResponseBodyDataStorageDescriptor getStorageDescriptor() {
            return this.storageDescriptor;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setViewExpandedText(String viewExpandedText) {
            this.viewExpandedText = viewExpandedText;
            return this;
        }
        public String getViewExpandedText() {
            return this.viewExpandedText;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setViewOriginalText(String viewOriginalText) {
            this.viewOriginalText = viewOriginalText;
            return this;
        }
        public String getViewOriginalText() {
            return this.viewOriginalText;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setTblId(Long tblId) {
            this.tblId = tblId;
            return this;
        }
        public Long getTblId() {
            return this.tblId;
        }

        public GetTableObjectsByDatabaseIdResponseBodyData setDBId(Long DBId) {
            this.DBId = DBId;
            return this;
        }
        public Long getDBId() {
            return this.DBId;
        }

    }

}
