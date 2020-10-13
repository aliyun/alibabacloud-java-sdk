// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetPartitionsResponseBody extends TeaModel {
    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 获取的分区
    @NameInMap("Partitions")
    public java.util.List<GetPartitionsResponseBodyPartitions> partitions;

    // 请求的 ID
    @NameInMap("RequestId")
    public String requestId;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetPartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionsResponseBody self = new GetPartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPartitionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPartitionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPartitionsResponseBody setPartitions(java.util.List<GetPartitionsResponseBodyPartitions> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.List<GetPartitionsResponseBodyPartitions> getPartitions() {
        return this.partitions;
    }

    public GetPartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPartitionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPartitionsResponseBodyPartitionsStorageDescriptorModelCols extends TeaModel {
        // 列注释
        @NameInMap("Comment")
        public String comment;

        // 列名
        @NameInMap("Name")
        public String name;

        // 列类型
        @NameInMap("Type")
        public String type;

        public static GetPartitionsResponseBodyPartitionsStorageDescriptorModelCols build(java.util.Map<String, ?> map) throws Exception {
            GetPartitionsResponseBodyPartitionsStorageDescriptorModelCols self = new GetPartitionsResponseBodyPartitionsStorageDescriptorModelCols();
            return TeaModel.build(map, self);
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModelCols setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModelCols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModelCols setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPartitionsResponseBodyPartitionsStorageDescriptorModelSerDeInfoModel extends TeaModel {
        // SerDe名称
        @NameInMap("Name")
        public String name;

        // SerDe属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerDe的serializationLib
        @NameInMap("SerializationLib")
        public String serializationLib;

        public static GetPartitionsResponseBodyPartitionsStorageDescriptorModelSerDeInfoModel build(java.util.Map<String, ?> map) throws Exception {
            GetPartitionsResponseBodyPartitionsStorageDescriptorModelSerDeInfoModel self = new GetPartitionsResponseBodyPartitionsStorageDescriptorModelSerDeInfoModel();
            return TeaModel.build(map, self);
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModelSerDeInfoModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModelSerDeInfoModel setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModelSerDeInfoModel setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

    }

    public static class GetPartitionsResponseBodyPartitionsStorageDescriptorModel extends TeaModel {
        // 表的列
        @NameInMap("Cols")
        public java.util.List<GetPartitionsResponseBodyPartitionsStorageDescriptorModelCols> cols;

        // 表的InputFormat
        @NameInMap("InputFormat")
        public String inputFormat;

        // 表的路径
        @NameInMap("Location")
        public String location;

        // 表的OutputFormat
        @NameInMap("OutputFormat")
        public String outputFormat;

        // 表属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // 表的 SerDe 信息
        @NameInMap("SerDeInfoModel")
        public GetPartitionsResponseBodyPartitionsStorageDescriptorModelSerDeInfoModel serDeInfoModel;

        public static GetPartitionsResponseBodyPartitionsStorageDescriptorModel build(java.util.Map<String, ?> map) throws Exception {
            GetPartitionsResponseBodyPartitionsStorageDescriptorModel self = new GetPartitionsResponseBodyPartitionsStorageDescriptorModel();
            return TeaModel.build(map, self);
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModel setCols(java.util.List<GetPartitionsResponseBodyPartitionsStorageDescriptorModelCols> cols) {
            this.cols = cols;
            return this;
        }
        public java.util.List<GetPartitionsResponseBodyPartitionsStorageDescriptorModelCols> getCols() {
            return this.cols;
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModel setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModel setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModel setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModel setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetPartitionsResponseBodyPartitionsStorageDescriptorModel setSerDeInfoModel(GetPartitionsResponseBodyPartitionsStorageDescriptorModelSerDeInfoModel serDeInfoModel) {
            this.serDeInfoModel = serDeInfoModel;
            return this;
        }
        public GetPartitionsResponseBodyPartitionsStorageDescriptorModelSerDeInfoModel getSerDeInfoModel() {
            return this.serDeInfoModel;
        }

    }

    public static class GetPartitionsResponseBodyPartitions extends TeaModel {
        // 分区创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 数据库名
        @NameInMap("DbName")
        public String dbName;

        // 分区属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // 分区的 SD 信息
        @NameInMap("StorageDescriptorModel")
        public GetPartitionsResponseBodyPartitionsStorageDescriptorModel storageDescriptorModel;

        // 表名
        @NameInMap("TableName")
        public String tableName;

        // 分区的值
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetPartitionsResponseBodyPartitions build(java.util.Map<String, ?> map) throws Exception {
            GetPartitionsResponseBodyPartitions self = new GetPartitionsResponseBodyPartitions();
            return TeaModel.build(map, self);
        }

        public GetPartitionsResponseBodyPartitions setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPartitionsResponseBodyPartitions setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetPartitionsResponseBodyPartitions setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetPartitionsResponseBodyPartitions setStorageDescriptorModel(GetPartitionsResponseBodyPartitionsStorageDescriptorModel storageDescriptorModel) {
            this.storageDescriptorModel = storageDescriptorModel;
            return this;
        }
        public GetPartitionsResponseBodyPartitionsStorageDescriptorModel getStorageDescriptorModel() {
            return this.storageDescriptorModel;
        }

        public GetPartitionsResponseBodyPartitions setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetPartitionsResponseBodyPartitions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
