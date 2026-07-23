// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementTableRequest extends TeaModel {
    /**
     * <p>Additional settings for the table.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;&quot;:&quot;&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The data source.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxcomputeAndApiApi</p>
     */
    @NameInMap("DataSource")
    public String dataSource;

    /**
     * <p><strong>The description of the table.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>this is a test table</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Whether to enable the data size fluctuation threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDataSizeFluctuationThreshold")
    public Boolean enableDataSizeFluctuationThreshold;

    /**
     * <p>Whether to enable the row count fluctuation threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRowCountFluctuationThreshold")
    public Boolean enableRowCountFluctuationThreshold;

    /**
     * <p>The list of fields.</p>
     */
    @NameInMap("Fields")
    public java.util.List<CreateRecallManagementTableRequestFields> fields;

    /**
     * <p><strong>The instance ID.</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum data size fluctuation threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxDataSizeFluctuationThreshold")
    public Long maxDataSizeFluctuationThreshold;

    /**
     * <p>The maximum row count fluctuation threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxRowCountFluctuationThreshold")
    public Long maxRowCountFluctuationThreshold;

    /**
     * <p>The MaxCompute project.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("MaxcomputeProjectName")
    public String maxcomputeProjectName;

    /**
     * <p><strong>The schema in MaxCompute.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("MaxcomputeSchema")
    public String maxcomputeSchema;

    /**
     * <p>The name of the table in MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>table-1</p>
     */
    @NameInMap("MaxcomputeTableName")
    public String maxcomputeTableName;

    /**
     * <p>The minimum data size fluctuation threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinDataSizeFluctuationThreshold")
    public Long minDataSizeFluctuationThreshold;

    /**
     * <p>The minimum row count fluctuation threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinRowCountFluctuationThreshold")
    public Long minRowCountFluctuationThreshold;

    /**
     * <p><strong>The name of the table.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>table-123</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The recall type of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>X2I</p>
     */
    @NameInMap("RecallType")
    public String recallType;

    /**
     * <p><strong>The table type.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>Recall</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateRecallManagementTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementTableRequest self = new CreateRecallManagementTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementTableRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateRecallManagementTableRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public CreateRecallManagementTableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRecallManagementTableRequest setEnableDataSizeFluctuationThreshold(Boolean enableDataSizeFluctuationThreshold) {
        this.enableDataSizeFluctuationThreshold = enableDataSizeFluctuationThreshold;
        return this;
    }
    public Boolean getEnableDataSizeFluctuationThreshold() {
        return this.enableDataSizeFluctuationThreshold;
    }

    public CreateRecallManagementTableRequest setEnableRowCountFluctuationThreshold(Boolean enableRowCountFluctuationThreshold) {
        this.enableRowCountFluctuationThreshold = enableRowCountFluctuationThreshold;
        return this;
    }
    public Boolean getEnableRowCountFluctuationThreshold() {
        return this.enableRowCountFluctuationThreshold;
    }

    public CreateRecallManagementTableRequest setFields(java.util.List<CreateRecallManagementTableRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<CreateRecallManagementTableRequestFields> getFields() {
        return this.fields;
    }

    public CreateRecallManagementTableRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRecallManagementTableRequest setMaxDataSizeFluctuationThreshold(Long maxDataSizeFluctuationThreshold) {
        this.maxDataSizeFluctuationThreshold = maxDataSizeFluctuationThreshold;
        return this;
    }
    public Long getMaxDataSizeFluctuationThreshold() {
        return this.maxDataSizeFluctuationThreshold;
    }

    public CreateRecallManagementTableRequest setMaxRowCountFluctuationThreshold(Long maxRowCountFluctuationThreshold) {
        this.maxRowCountFluctuationThreshold = maxRowCountFluctuationThreshold;
        return this;
    }
    public Long getMaxRowCountFluctuationThreshold() {
        return this.maxRowCountFluctuationThreshold;
    }

    public CreateRecallManagementTableRequest setMaxcomputeProjectName(String maxcomputeProjectName) {
        this.maxcomputeProjectName = maxcomputeProjectName;
        return this;
    }
    public String getMaxcomputeProjectName() {
        return this.maxcomputeProjectName;
    }

    public CreateRecallManagementTableRequest setMaxcomputeSchema(String maxcomputeSchema) {
        this.maxcomputeSchema = maxcomputeSchema;
        return this;
    }
    public String getMaxcomputeSchema() {
        return this.maxcomputeSchema;
    }

    public CreateRecallManagementTableRequest setMaxcomputeTableName(String maxcomputeTableName) {
        this.maxcomputeTableName = maxcomputeTableName;
        return this;
    }
    public String getMaxcomputeTableName() {
        return this.maxcomputeTableName;
    }

    public CreateRecallManagementTableRequest setMinDataSizeFluctuationThreshold(Long minDataSizeFluctuationThreshold) {
        this.minDataSizeFluctuationThreshold = minDataSizeFluctuationThreshold;
        return this;
    }
    public Long getMinDataSizeFluctuationThreshold() {
        return this.minDataSizeFluctuationThreshold;
    }

    public CreateRecallManagementTableRequest setMinRowCountFluctuationThreshold(Long minRowCountFluctuationThreshold) {
        this.minRowCountFluctuationThreshold = minRowCountFluctuationThreshold;
        return this;
    }
    public Long getMinRowCountFluctuationThreshold() {
        return this.minRowCountFluctuationThreshold;
    }

    public CreateRecallManagementTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRecallManagementTableRequest setRecallType(String recallType) {
        this.recallType = recallType;
        return this;
    }
    public String getRecallType() {
        return this.recallType;
    }

    public CreateRecallManagementTableRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateRecallManagementTableRequestFields extends TeaModel {
        /**
         * <p>The attributes of the field. Valid values:</p>
         * <ul>
         * <li><p><code>Primary</code>: The primary key field.</p>
         * </li>
         * <li><p><code>Item</code>: The item field.</p>
         * </li>
         * <li><p><code>Score</code>: The recall score field.</p>
         * </li>
         * <li><p><code>Vector</code>: The vector field.</p>
         * </li>
         * <li><p><code>Index</code>: The index field.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING(全大写)</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The vector dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("VectorDimension")
        public Integer vectorDimension;

        /**
         * <p>The vector metric type.</p>
         * 
         * <strong>example:</strong>
         * <p>L2</p>
         */
        @NameInMap("VectorMetricType")
        public String vectorMetricType;

        public static CreateRecallManagementTableRequestFields build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementTableRequestFields self = new CreateRecallManagementTableRequestFields();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementTableRequestFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public CreateRecallManagementTableRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRecallManagementTableRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateRecallManagementTableRequestFields setVectorDimension(Integer vectorDimension) {
            this.vectorDimension = vectorDimension;
            return this;
        }
        public Integer getVectorDimension() {
            return this.vectorDimension;
        }

        public CreateRecallManagementTableRequestFields setVectorMetricType(String vectorMetricType) {
            this.vectorMetricType = vectorMetricType;
            return this;
        }
        public String getVectorMetricType() {
            return this.vectorMetricType;
        }

    }

}
