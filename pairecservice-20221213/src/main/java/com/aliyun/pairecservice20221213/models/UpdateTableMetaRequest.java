// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTableMetaRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Fields")
    public java.util.List<UpdateTableMetaRequestFields> fields;

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

    public static UpdateTableMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableMetaRequest self = new UpdateTableMetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableMetaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTableMetaRequest setFields(java.util.List<UpdateTableMetaRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<UpdateTableMetaRequestFields> getFields() {
        return this.fields;
    }

    public UpdateTableMetaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTableMetaRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public UpdateTableMetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTableMetaRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateTableMetaRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class UpdateTableMetaRequestFields extends TeaModel {
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

        public static UpdateTableMetaRequestFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableMetaRequestFields self = new UpdateTableMetaRequestFields();
            return TeaModel.build(map, self);
        }

        public UpdateTableMetaRequestFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public UpdateTableMetaRequestFields setIsDimensionField(Boolean isDimensionField) {
            this.isDimensionField = isDimensionField;
            return this;
        }
        public Boolean getIsDimensionField() {
            return this.isDimensionField;
        }

        public UpdateTableMetaRequestFields setIsPartitionField(String isPartitionField) {
            this.isPartitionField = isPartitionField;
            return this;
        }
        public String getIsPartitionField() {
            return this.isPartitionField;
        }

        public UpdateTableMetaRequestFields setMeaning(String meaning) {
            this.meaning = meaning;
            return this;
        }
        public String getMeaning() {
            return this.meaning;
        }

        public UpdateTableMetaRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTableMetaRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
