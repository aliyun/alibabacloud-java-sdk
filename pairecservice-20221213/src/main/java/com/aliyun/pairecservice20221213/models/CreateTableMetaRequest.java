// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTableMetaRequest extends TeaModel {
    /**
     * <p>The description of the data table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test table</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of fields.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<CreateTableMetaRequestFields> fields;

    /**
     * <p>The instance ID. To get this ID, call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The module to which the data table belongs.</p>
     * <ul>
     * <li><p>ABTest: The data table for A/B testing.</p>
     * </li>
     * <li><p>ExperimentTool: The data table for the experiment tool.</p>
     * </li>
     * <li><p>DataDiagnosis: The data table for data diagnosis.</p>
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
     * <p>The resource ID. To get this ID, call the ListInstanceResources operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reso-2s416t146ffjc3yefx</p>
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
        /**
         * <p>The logical data type of the field.</p>
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
         * <p>The business definition of the field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>this is gender of people</p>
         */
        @NameInMap("Meaning")
        public String meaning;

        /**
         * <p>The name of the field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gender</p>
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
