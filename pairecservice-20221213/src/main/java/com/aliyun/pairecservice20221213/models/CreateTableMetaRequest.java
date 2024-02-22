// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTableMetaRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Fields")
    public java.util.List<CreateTableMetaRequestFields> fields;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Module")
    public String module;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("TableName")
    public String tableName;

    public static CreateTableMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableMetaRequest self = new CreateTableMetaRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableMetaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTableMetaRequest setFields(java.util.List<CreateTableMetaRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<CreateTableMetaRequestFields> getFields() {
        return this.fields;
    }

    public CreateTableMetaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTableMetaRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public CreateTableMetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTableMetaRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateTableMetaRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class CreateTableMetaRequestFields extends TeaModel {
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("IsDimensionField")
        public Boolean isDimensionField;

        @NameInMap("IsPartitionField")
        public String isPartitionField;

        @NameInMap("Meaning")
        public String meaning;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static CreateTableMetaRequestFields build(java.util.Map<String, ?> map) throws Exception {
            CreateTableMetaRequestFields self = new CreateTableMetaRequestFields();
            return TeaModel.build(map, self);
        }

        public CreateTableMetaRequestFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTableMetaRequestFields setIsDimensionField(Boolean isDimensionField) {
            this.isDimensionField = isDimensionField;
            return this;
        }
        public Boolean getIsDimensionField() {
            return this.isDimensionField;
        }

        public CreateTableMetaRequestFields setIsPartitionField(String isPartitionField) {
            this.isPartitionField = isPartitionField;
            return this;
        }
        public String getIsPartitionField() {
            return this.isPartitionField;
        }

        public CreateTableMetaRequestFields setMeaning(String meaning) {
            this.meaning = meaning;
            return this;
        }
        public String getMeaning() {
            return this.meaning;
        }

        public CreateTableMetaRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTableMetaRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
