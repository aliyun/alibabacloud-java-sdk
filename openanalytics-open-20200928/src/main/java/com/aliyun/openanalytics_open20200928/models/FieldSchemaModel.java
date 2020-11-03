// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class FieldSchemaModel extends TeaModel {
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
    @NameInMap(" PkPosition")
    public Integer PkPosition;

    // 是否为分区字段
    @NameInMap("IsPartitionKey")
    public Boolean isPartitionKey;

    public static FieldSchemaModel build(java.util.Map<String, ?> map) throws Exception {
        FieldSchemaModel self = new FieldSchemaModel();
        return TeaModel.build(map, self);
    }

    public FieldSchemaModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FieldSchemaModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FieldSchemaModel setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public FieldSchemaModel setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public FieldSchemaModel setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public FieldSchemaModel setMappedName(String mappedName) {
        this.mappedName = mappedName;
        return this;
    }
    public String getMappedName() {
        return this.mappedName;
    }

    public FieldSchemaModel setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public FieldSchemaModel setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
        return this;
    }
    public Boolean getIsPrimaryKey() {
        return this.isPrimaryKey;
    }

    public FieldSchemaModel setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public FieldSchemaModel setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public FieldSchemaModel setPkPosition(Integer PkPosition) {
        this.PkPosition = PkPosition;
        return this;
    }
    public Integer getPkPosition() {
        return this.PkPosition;
    }

    public FieldSchemaModel setIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
        return this;
    }
    public Boolean getIsPartitionKey() {
        return this.isPartitionKey;
    }

}
