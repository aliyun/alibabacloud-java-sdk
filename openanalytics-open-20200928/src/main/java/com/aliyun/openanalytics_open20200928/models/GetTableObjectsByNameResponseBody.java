// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetTableObjectsByNameResponseBody extends TeaModel {
    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // 查询到的所有表
    @NameInMap("Data")
    public java.util.List<GetTableObjectsByNameResponseBodyData> data;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 请求的 ID
    @NameInMap("RequestId")
    public String requestId;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetTableObjectsByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableObjectsByNameResponseBody self = new GetTableObjectsByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableObjectsByNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableObjectsByNameResponseBody setData(java.util.List<GetTableObjectsByNameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTableObjectsByNameResponseBodyData> getData() {
        return this.data;
    }

    public GetTableObjectsByNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableObjectsByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableObjectsByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTableObjectsByNameResponseBodyDataPartitionKeys extends TeaModel {
        // 分区注释
        @NameInMap("Comment")
        public String comment;

        // 分区名称
        @NameInMap("Name")
        public String name;

        // 分区类型
        @NameInMap("Type")
        public String type;

        public static GetTableObjectsByNameResponseBodyDataPartitionKeys build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsByNameResponseBodyDataPartitionKeys self = new GetTableObjectsByNameResponseBodyDataPartitionKeys();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsByNameResponseBodyDataPartitionKeys setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableObjectsByNameResponseBodyDataPartitionKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableObjectsByNameResponseBodyDataPartitionKeys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableObjectsByNameResponseBodyDataStorageDescriptorCols extends TeaModel {
        // 列注释
        @NameInMap("Comment")
        public String comment;

        // 列名称
        @NameInMap("Name")
        public String name;

        // 列类型
        @NameInMap("Type")
        public String type;

        public static GetTableObjectsByNameResponseBodyDataStorageDescriptorCols build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsByNameResponseBodyDataStorageDescriptorCols self = new GetTableObjectsByNameResponseBodyDataStorageDescriptorCols();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptorCols setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptorCols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptorCols setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableObjectsByNameResponseBodyDataStorageDescriptorSerDeInfo extends TeaModel {
        // SerDe 的名称
        @NameInMap("Name")
        public String name;

        // SerDe 的属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerDe 的 serializationLib
        @NameInMap("SerializationLib")
        public String serializationLib;

        public static GetTableObjectsByNameResponseBodyDataStorageDescriptorSerDeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsByNameResponseBodyDataStorageDescriptorSerDeInfo self = new GetTableObjectsByNameResponseBodyDataStorageDescriptorSerDeInfo();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptorSerDeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptorSerDeInfo setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptorSerDeInfo setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

    }

    public static class GetTableObjectsByNameResponseBodyDataStorageDescriptor extends TeaModel {
        // 表的列信息
        @NameInMap("Cols")
        public java.util.List<GetTableObjectsByNameResponseBodyDataStorageDescriptorCols> cols;

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
        public GetTableObjectsByNameResponseBodyDataStorageDescriptorSerDeInfo serDeInfo;

        public static GetTableObjectsByNameResponseBodyDataStorageDescriptor build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsByNameResponseBodyDataStorageDescriptor self = new GetTableObjectsByNameResponseBodyDataStorageDescriptor();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptor setCols(java.util.List<GetTableObjectsByNameResponseBodyDataStorageDescriptorCols> cols) {
            this.cols = cols;
            return this;
        }
        public java.util.List<GetTableObjectsByNameResponseBodyDataStorageDescriptorCols> getCols() {
            return this.cols;
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptor setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptor setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptor setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public GetTableObjectsByNameResponseBodyDataStorageDescriptor setSerDeInfo(GetTableObjectsByNameResponseBodyDataStorageDescriptorSerDeInfo serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }
        public GetTableObjectsByNameResponseBodyDataStorageDescriptorSerDeInfo getSerDeInfo() {
            return this.serDeInfo;
        }

    }

    public static class GetTableObjectsByNameResponseBodyData extends TeaModel {
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
        public java.util.List<GetTableObjectsByNameResponseBodyDataPartitionKeys> partitionKeys;

        // 表的 sd 信息
        @NameInMap("StorageDescriptor")
        public GetTableObjectsByNameResponseBodyDataStorageDescriptor storageDescriptor;

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

        public static GetTableObjectsByNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTableObjectsByNameResponseBodyData self = new GetTableObjectsByNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTableObjectsByNameResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTableObjectsByNameResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetTableObjectsByNameResponseBodyData setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetTableObjectsByNameResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTableObjectsByNameResponseBodyData setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetTableObjectsByNameResponseBodyData setPartitionKeys(java.util.List<GetTableObjectsByNameResponseBodyDataPartitionKeys> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public java.util.List<GetTableObjectsByNameResponseBodyDataPartitionKeys> getPartitionKeys() {
            return this.partitionKeys;
        }

        public GetTableObjectsByNameResponseBodyData setStorageDescriptor(GetTableObjectsByNameResponseBodyDataStorageDescriptor storageDescriptor) {
            this.storageDescriptor = storageDescriptor;
            return this;
        }
        public GetTableObjectsByNameResponseBodyDataStorageDescriptor getStorageDescriptor() {
            return this.storageDescriptor;
        }

        public GetTableObjectsByNameResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetTableObjectsByNameResponseBodyData setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

        public GetTableObjectsByNameResponseBodyData setViewExpandedText(String viewExpandedText) {
            this.viewExpandedText = viewExpandedText;
            return this;
        }
        public String getViewExpandedText() {
            return this.viewExpandedText;
        }

        public GetTableObjectsByNameResponseBodyData setViewOriginalText(String viewOriginalText) {
            this.viewOriginalText = viewOriginalText;
            return this;
        }
        public String getViewOriginalText() {
            return this.viewOriginalText;
        }

        public GetTableObjectsByNameResponseBodyData setTblId(Long tblId) {
            this.tblId = tblId;
            return this;
        }
        public Long getTblId() {
            return this.tblId;
        }

        public GetTableObjectsByNameResponseBodyData setDBId(Long DBId) {
            this.DBId = DBId;
            return this;
        }
        public Long getDBId() {
            return this.DBId;
        }

    }

}
