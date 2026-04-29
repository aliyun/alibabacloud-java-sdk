// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementTableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDataSizeFluctuationThreshold")
    public Boolean enableDataSizeFluctuationThreshold;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRowCountFluctuationThreshold")
    public Boolean enableRowCountFluctuationThreshold;

    @NameInMap("Fields")
    public UpdateRecallManagementTableRequestFields fields;

    /**
     * <strong>example:</strong>
     * <p>20250701</p>
     */
    @NameInMap("IndexVersionId")
    public String indexVersionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxDataSizeFluctuationThreshold")
    public Integer maxDataSizeFluctuationThreshold;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxRowCountFluctuationThreshold")
    public Integer maxRowCountFluctuationThreshold;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinDataSizeFluctuationThreshold")
    public Integer minDataSizeFluctuationThreshold;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinRowCountFluctuationThreshold")
    public Integer minRowCountFluctuationThreshold;

    public static UpdateRecallManagementTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementTableRequest self = new UpdateRecallManagementTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementTableRequest setEnableDataSizeFluctuationThreshold(Boolean enableDataSizeFluctuationThreshold) {
        this.enableDataSizeFluctuationThreshold = enableDataSizeFluctuationThreshold;
        return this;
    }
    public Boolean getEnableDataSizeFluctuationThreshold() {
        return this.enableDataSizeFluctuationThreshold;
    }

    public UpdateRecallManagementTableRequest setEnableRowCountFluctuationThreshold(Boolean enableRowCountFluctuationThreshold) {
        this.enableRowCountFluctuationThreshold = enableRowCountFluctuationThreshold;
        return this;
    }
    public Boolean getEnableRowCountFluctuationThreshold() {
        return this.enableRowCountFluctuationThreshold;
    }

    public UpdateRecallManagementTableRequest setFields(UpdateRecallManagementTableRequestFields fields) {
        this.fields = fields;
        return this;
    }
    public UpdateRecallManagementTableRequestFields getFields() {
        return this.fields;
    }

    public UpdateRecallManagementTableRequest setIndexVersionId(String indexVersionId) {
        this.indexVersionId = indexVersionId;
        return this;
    }
    public String getIndexVersionId() {
        return this.indexVersionId;
    }

    public UpdateRecallManagementTableRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRecallManagementTableRequest setMaxDataSizeFluctuationThreshold(Integer maxDataSizeFluctuationThreshold) {
        this.maxDataSizeFluctuationThreshold = maxDataSizeFluctuationThreshold;
        return this;
    }
    public Integer getMaxDataSizeFluctuationThreshold() {
        return this.maxDataSizeFluctuationThreshold;
    }

    public UpdateRecallManagementTableRequest setMaxRowCountFluctuationThreshold(Integer maxRowCountFluctuationThreshold) {
        this.maxRowCountFluctuationThreshold = maxRowCountFluctuationThreshold;
        return this;
    }
    public Integer getMaxRowCountFluctuationThreshold() {
        return this.maxRowCountFluctuationThreshold;
    }

    public UpdateRecallManagementTableRequest setMinDataSizeFluctuationThreshold(Integer minDataSizeFluctuationThreshold) {
        this.minDataSizeFluctuationThreshold = minDataSizeFluctuationThreshold;
        return this;
    }
    public Integer getMinDataSizeFluctuationThreshold() {
        return this.minDataSizeFluctuationThreshold;
    }

    public UpdateRecallManagementTableRequest setMinRowCountFluctuationThreshold(Integer minRowCountFluctuationThreshold) {
        this.minRowCountFluctuationThreshold = minRowCountFluctuationThreshold;
        return this;
    }
    public Integer getMinRowCountFluctuationThreshold() {
        return this.minRowCountFluctuationThreshold;
    }

    public static class UpdateRecallManagementTableRequestFields extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("VectorDimension")
        public Integer vectorDimension;

        /**
         * <strong>example:</strong>
         * <p>L2</p>
         */
        @NameInMap("VectorMetricType")
        public String vectorMetricType;

        public static UpdateRecallManagementTableRequestFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecallManagementTableRequestFields self = new UpdateRecallManagementTableRequestFields();
            return TeaModel.build(map, self);
        }

        public UpdateRecallManagementTableRequestFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public UpdateRecallManagementTableRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateRecallManagementTableRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateRecallManagementTableRequestFields setVectorDimension(Integer vectorDimension) {
            this.vectorDimension = vectorDimension;
            return this;
        }
        public Integer getVectorDimension() {
            return this.vectorDimension;
        }

        public UpdateRecallManagementTableRequestFields setVectorMetricType(String vectorMetricType) {
            this.vectorMetricType = vectorMetricType;
            return this;
        }
        public String getVectorMetricType() {
            return this.vectorMetricType;
        }

    }

}
