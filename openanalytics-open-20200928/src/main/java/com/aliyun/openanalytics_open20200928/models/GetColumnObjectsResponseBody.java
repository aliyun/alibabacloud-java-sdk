// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetColumnObjectsResponseBody extends TeaModel {
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

    // 请求到的所有列
    @NameInMap("Data")
    public java.util.List<GetColumnObjectsResponseBodyData> data;

    public static GetColumnObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetColumnObjectsResponseBody self = new GetColumnObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetColumnObjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetColumnObjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetColumnObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetColumnObjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetColumnObjectsResponseBody setData(java.util.List<GetColumnObjectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetColumnObjectsResponseBodyData> getData() {
        return this.data;
    }

    public static class GetColumnObjectsResponseBodyData extends TeaModel {
        // 列名
        @NameInMap("Name")
        public String name;

        // 列的数据类型
        @NameInMap("Type")
        public String type;

        // 列的描述信息
        @NameInMap("Comment")
        public String comment;

        // 对应的数据库名
        @NameInMap("SchemaName")
        public String schemaName;

        // 对应的表名
        @NameInMap("TableName")
        public String tableName;

        // 映射名称
        @NameInMap("MappedName")
        public String mappedName;

        // 数据的类型
        @NameInMap("DataType")
        public String dataType;

        // 是否为主键
        @NameInMap("IsPrimaryKey")
        public Boolean isPrimaryKey;

        // 创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 更新时间
        @NameInMap("UpdateTime")
        public Long updateTime;

        // 主键位置
        @NameInMap("PkPosition")
        public Integer pkPosition;

        // 是否为分区字段
        @NameInMap("IsPartitionKey")
        public Boolean isPartitionKey;

        public static GetColumnObjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetColumnObjectsResponseBodyData self = new GetColumnObjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetColumnObjectsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetColumnObjectsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetColumnObjectsResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetColumnObjectsResponseBodyData setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetColumnObjectsResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetColumnObjectsResponseBodyData setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public GetColumnObjectsResponseBodyData setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetColumnObjectsResponseBodyData setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public GetColumnObjectsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetColumnObjectsResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetColumnObjectsResponseBodyData setPkPosition(Integer pkPosition) {
            this.pkPosition = pkPosition;
            return this;
        }
        public Integer getPkPosition() {
            return this.pkPosition;
        }

        public GetColumnObjectsResponseBodyData setIsPartitionKey(Boolean isPartitionKey) {
            this.isPartitionKey = isPartitionKey;
            return this;
        }
        public Boolean getIsPartitionKey() {
            return this.isPartitionKey;
        }

    }

}
