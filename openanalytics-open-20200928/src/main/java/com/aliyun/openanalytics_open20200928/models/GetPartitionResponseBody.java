// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetPartitionResponseBody extends TeaModel {
    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 获取到的分区
    @NameInMap("PartitionModel")
    public GetPartitionResponseBodyPartitionModel partitionModel;

    // 请求的 ID
    @NameInMap("RequestId")
    public String requestId;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetPartitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionResponseBody self = new GetPartitionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPartitionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPartitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPartitionResponseBody setPartitionModel(GetPartitionResponseBodyPartitionModel partitionModel) {
        this.partitionModel = partitionModel;
        return this;
    }
    public GetPartitionResponseBodyPartitionModel getPartitionModel() {
        return this.partitionModel;
    }

    public GetPartitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPartitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPartitionResponseBodyPartitionModelStorageDescriptorModelCols extends TeaModel {
        // 列注释
        @NameInMap("Comment")
        public String comment;

        // 列名
        @NameInMap("Name")
        public String name;

        // 列类型
        @NameInMap("Type")
        public String type;

        public static GetPartitionResponseBodyPartitionModelStorageDescriptorModelCols build(java.util.Map<String, ?> map) throws Exception {
            GetPartitionResponseBodyPartitionModelStorageDescriptorModelCols self = new GetPartitionResponseBodyPartitionModelStorageDescriptorModelCols();
            return TeaModel.build(map, self);
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModelCols setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModelCols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModelCols setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPartitionResponseBodyPartitionModelStorageDescriptorModelSerDeInfoModel extends TeaModel {
        // SerDe 的名称
        @NameInMap("Name")
        public String name;

        // SerDe 的属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerDe 的 serializationLib
        @NameInMap("SerializationLib")
        public String serializationLib;

        public static GetPartitionResponseBodyPartitionModelStorageDescriptorModelSerDeInfoModel build(java.util.Map<String, ?> map) throws Exception {
            GetPartitionResponseBodyPartitionModelStorageDescriptorModelSerDeInfoModel self = new GetPartitionResponseBodyPartitionModelStorageDescriptorModelSerDeInfoModel();
            return TeaModel.build(map, self);
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModelSerDeInfoModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModelSerDeInfoModel setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModelSerDeInfoModel setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

    }

    public static class GetPartitionResponseBodyPartitionModelStorageDescriptorModel extends TeaModel {
        // 表的列信息
        @NameInMap("Cols")
        public java.util.List<GetPartitionResponseBodyPartitionModelStorageDescriptorModelCols> cols;

        // 表的InputFormat
        @NameInMap("InputFormat")
        public String inputFormat;

        // 表的路径
        @NameInMap("Location")
        public String location;

        // 表的OutputFormat
        @NameInMap("OutputFormat")
        public String outputFormat;

        // 表的属性
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // 表的 SerDe 信息
        @NameInMap("SerDeInfoModel")
        public GetPartitionResponseBodyPartitionModelStorageDescriptorModelSerDeInfoModel serDeInfoModel;

        public static GetPartitionResponseBodyPartitionModelStorageDescriptorModel build(java.util.Map<String, ?> map) throws Exception {
            GetPartitionResponseBodyPartitionModelStorageDescriptorModel self = new GetPartitionResponseBodyPartitionModelStorageDescriptorModel();
            return TeaModel.build(map, self);
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModel setCols(java.util.List<GetPartitionResponseBodyPartitionModelStorageDescriptorModelCols> cols) {
            this.cols = cols;
            return this;
        }
        public java.util.List<GetPartitionResponseBodyPartitionModelStorageDescriptorModelCols> getCols() {
            return this.cols;
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModel setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModel setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModel setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModel setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetPartitionResponseBodyPartitionModelStorageDescriptorModel setSerDeInfoModel(GetPartitionResponseBodyPartitionModelStorageDescriptorModelSerDeInfoModel serDeInfoModel) {
            this.serDeInfoModel = serDeInfoModel;
            return this;
        }
        public GetPartitionResponseBodyPartitionModelStorageDescriptorModelSerDeInfoModel getSerDeInfoModel() {
            return this.serDeInfoModel;
        }

    }

    public static class GetPartitionResponseBodyPartitionModel extends TeaModel {
        // 分区创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 数据库名称
        @NameInMap("DbName")
        public String dbName;

        // 分区参数
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // 分区 SD
        @NameInMap("StorageDescriptorModel")
        public GetPartitionResponseBodyPartitionModelStorageDescriptorModel storageDescriptorModel;

        // 表名
        @NameInMap("TableName")
        public String tableName;

        // 分区信息
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetPartitionResponseBodyPartitionModel build(java.util.Map<String, ?> map) throws Exception {
            GetPartitionResponseBodyPartitionModel self = new GetPartitionResponseBodyPartitionModel();
            return TeaModel.build(map, self);
        }

        public GetPartitionResponseBodyPartitionModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPartitionResponseBodyPartitionModel setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetPartitionResponseBodyPartitionModel setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetPartitionResponseBodyPartitionModel setStorageDescriptorModel(GetPartitionResponseBodyPartitionModelStorageDescriptorModel storageDescriptorModel) {
            this.storageDescriptorModel = storageDescriptorModel;
            return this;
        }
        public GetPartitionResponseBodyPartitionModelStorageDescriptorModel getStorageDescriptorModel() {
            return this.storageDescriptorModel;
        }

        public GetPartitionResponseBodyPartitionModel setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetPartitionResponseBodyPartitionModel setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
