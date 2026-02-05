// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CanDelete")
    public Boolean canDelete;

    /**
     * <strong>example:</strong>
     * <p>{&quot;item_id&quot;:&quot;&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>Api</p>
     */
    @NameInMap("DataSource")
    public String dataSource;

    /**
     * <strong>example:</strong>
     * <p>this is a test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
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
    public java.util.List<GetRecallManagementTableResponseBodyFields> fields;

    /**
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("IndexEffectiveTime")
    public String indexEffectiveTime;

    /**
     * <strong>example:</strong>
     * <p>20250701</p>
     */
    @NameInMap("IndexVersionId")
    public String indexVersionId;

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
     * <p>test</p>
     */
    @NameInMap("MaxcomputeProjectName")
    public String maxcomputeProjectName;

    /**
     * <p>maxcompute schema。</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("MaxcomputeSchema")
    public String maxcomputeSchema;

    /**
     * <strong>example:</strong>
     * <p>table-1</p>
     */
    @NameInMap("MaxcomputeTableName")
    public String maxcomputeTableName;

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

    /**
     * <strong>example:</strong>
     * <p>table-123</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>dt</p>
     */
    @NameInMap("PartitionFields")
    public String partitionFields;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RecallManagementTableId")
    public String recallManagementTableId;

    /**
     * <strong>example:</strong>
     * <p>X2I</p>
     */
    @NameInMap("RecallType")
    public String recallType;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Recall</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetRecallManagementTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementTableResponseBody self = new GetRecallManagementTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementTableResponseBody setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public GetRecallManagementTableResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetRecallManagementTableResponseBody setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public GetRecallManagementTableResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetRecallManagementTableResponseBody setEnableDataSizeFluctuationThreshold(Boolean enableDataSizeFluctuationThreshold) {
        this.enableDataSizeFluctuationThreshold = enableDataSizeFluctuationThreshold;
        return this;
    }
    public Boolean getEnableDataSizeFluctuationThreshold() {
        return this.enableDataSizeFluctuationThreshold;
    }

    public GetRecallManagementTableResponseBody setEnableRowCountFluctuationThreshold(Boolean enableRowCountFluctuationThreshold) {
        this.enableRowCountFluctuationThreshold = enableRowCountFluctuationThreshold;
        return this;
    }
    public Boolean getEnableRowCountFluctuationThreshold() {
        return this.enableRowCountFluctuationThreshold;
    }

    public GetRecallManagementTableResponseBody setFields(java.util.List<GetRecallManagementTableResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetRecallManagementTableResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetRecallManagementTableResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetRecallManagementTableResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetRecallManagementTableResponseBody setIndexEffectiveTime(String indexEffectiveTime) {
        this.indexEffectiveTime = indexEffectiveTime;
        return this;
    }
    public String getIndexEffectiveTime() {
        return this.indexEffectiveTime;
    }

    public GetRecallManagementTableResponseBody setIndexVersionId(String indexVersionId) {
        this.indexVersionId = indexVersionId;
        return this;
    }
    public String getIndexVersionId() {
        return this.indexVersionId;
    }

    public GetRecallManagementTableResponseBody setMaxDataSizeFluctuationThreshold(Integer maxDataSizeFluctuationThreshold) {
        this.maxDataSizeFluctuationThreshold = maxDataSizeFluctuationThreshold;
        return this;
    }
    public Integer getMaxDataSizeFluctuationThreshold() {
        return this.maxDataSizeFluctuationThreshold;
    }

    public GetRecallManagementTableResponseBody setMaxRowCountFluctuationThreshold(Integer maxRowCountFluctuationThreshold) {
        this.maxRowCountFluctuationThreshold = maxRowCountFluctuationThreshold;
        return this;
    }
    public Integer getMaxRowCountFluctuationThreshold() {
        return this.maxRowCountFluctuationThreshold;
    }

    public GetRecallManagementTableResponseBody setMaxcomputeProjectName(String maxcomputeProjectName) {
        this.maxcomputeProjectName = maxcomputeProjectName;
        return this;
    }
    public String getMaxcomputeProjectName() {
        return this.maxcomputeProjectName;
    }

    public GetRecallManagementTableResponseBody setMaxcomputeSchema(String maxcomputeSchema) {
        this.maxcomputeSchema = maxcomputeSchema;
        return this;
    }
    public String getMaxcomputeSchema() {
        return this.maxcomputeSchema;
    }

    public GetRecallManagementTableResponseBody setMaxcomputeTableName(String maxcomputeTableName) {
        this.maxcomputeTableName = maxcomputeTableName;
        return this;
    }
    public String getMaxcomputeTableName() {
        return this.maxcomputeTableName;
    }

    public GetRecallManagementTableResponseBody setMinDataSizeFluctuationThreshold(Integer minDataSizeFluctuationThreshold) {
        this.minDataSizeFluctuationThreshold = minDataSizeFluctuationThreshold;
        return this;
    }
    public Integer getMinDataSizeFluctuationThreshold() {
        return this.minDataSizeFluctuationThreshold;
    }

    public GetRecallManagementTableResponseBody setMinRowCountFluctuationThreshold(Integer minRowCountFluctuationThreshold) {
        this.minRowCountFluctuationThreshold = minRowCountFluctuationThreshold;
        return this;
    }
    public Integer getMinRowCountFluctuationThreshold() {
        return this.minRowCountFluctuationThreshold;
    }

    public GetRecallManagementTableResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRecallManagementTableResponseBody setPartitionFields(String partitionFields) {
        this.partitionFields = partitionFields;
        return this;
    }
    public String getPartitionFields() {
        return this.partitionFields;
    }

    public GetRecallManagementTableResponseBody setRecallManagementTableId(String recallManagementTableId) {
        this.recallManagementTableId = recallManagementTableId;
        return this;
    }
    public String getRecallManagementTableId() {
        return this.recallManagementTableId;
    }

    public GetRecallManagementTableResponseBody setRecallType(String recallType) {
        this.recallType = recallType;
        return this;
    }
    public String getRecallType() {
        return this.recallType;
    }

    public GetRecallManagementTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecallManagementTableResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class GetRecallManagementTableResponseBodyFields extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>STRING</p>
         */
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

        public static GetRecallManagementTableResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementTableResponseBodyFields self = new GetRecallManagementTableResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementTableResponseBodyFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public GetRecallManagementTableResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRecallManagementTableResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRecallManagementTableResponseBodyFields setVectorDimension(Integer vectorDimension) {
            this.vectorDimension = vectorDimension;
            return this;
        }
        public Integer getVectorDimension() {
            return this.vectorDimension;
        }

        public GetRecallManagementTableResponseBodyFields setVectorMetricType(String vectorMetricType) {
            this.vectorMetricType = vectorMetricType;
            return this;
        }
        public String getVectorMetricType() {
            return this.vectorMetricType;
        }

    }

}
