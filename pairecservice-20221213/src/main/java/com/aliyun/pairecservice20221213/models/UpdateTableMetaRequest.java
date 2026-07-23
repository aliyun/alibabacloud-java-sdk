// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTableMetaRequest extends TeaModel {
    /**
     * <p>The description of the data table.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test table</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The fields of the data table.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<UpdateTableMetaRequestFields> fields;

    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The module to which the data table belongs.</p>
     * <ul>
     * <li><p>ABTest: a data table for A/B testing.</p>
     * </li>
     * <li><p>ExperimentTool: a data table for experiment tools.</p>
     * </li>
     * <li><p>DataDiagnosis: a data table for data diagnosis.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ABTest</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The name of the data table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The resource ID. You can call the <a href="https://help.aliyun.com/document_detail/2672886.html">ListInstanceResource</a> operation to obtain the resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reso-2s416t***</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the table in the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table_mysql</p>
     */
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
        /**
         * <p>The data type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>primary_key</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>Indicates whether the field is a dimension field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDimensionField")
        public Boolean isDimensionField;

        /**
         * <p>Indicates whether the field is a partition field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPartitionField")
        public String isPartitionField;

        /**
         * <p>The business meaning of the field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>名称字段</p>
         */
        @NameInMap("Meaning")
        public String meaning;

        /**
         * <p>The field name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data type of the field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
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
