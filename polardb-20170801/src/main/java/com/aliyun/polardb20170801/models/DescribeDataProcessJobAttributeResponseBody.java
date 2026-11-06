// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDataProcessJobAttributeResponseBody extends TeaModel {
    /**
     * <p>The time when the task was created, in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01T00:00:00Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The JSON string of the destination database connection configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Account&quot;:&quot;example_user&quot;,&quot;Password&quot;:&quot;example_password&quot;}</p>
     */
    @NameInMap("DestinationConfig")
    public String destinationConfig;

    /**
     * <p>The ID of the destination PolarDB cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-test123456</p>
     */
    @NameInMap("DestinationId")
    public String destinationId;

    /**
     * <p>The name of the destination database.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DestinationPath")
    public String destinationPath;

    /**
     * <p>The type of the destination. Currently, only PolarDB is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDB</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The ID of the data processing task.</p>
     * 
     * <strong>example:</strong>
     * <p>job-123456</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The name of the model used for feature extraction.</p>
     * 
     * <strong>example:</strong>
     * <p>model-v1</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The data processing mode. Valid values: Full, Incremental, and Both.</p>
     * 
     * <strong>example:</strong>
     * <p>Full</p>
     */
    @NameInMap("ProcessingMode")
    public String processingMode;

    /**
     * <p>The region ID of the region where the data processing task is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the source PolarFS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-123456</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source data path in PolarFS.</p>
     * 
     * <strong>example:</strong>
     * <p>/data/input</p>
     */
    @NameInMap("SourcePath")
    public String sourcePath;

    /**
     * <p>The type of the data source. Currently, only PolarFS is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarFS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The status of the data processing task.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the template used by the task.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl-123456</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The node templatetype. Currently, only image is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static DescribeDataProcessJobAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataProcessJobAttributeResponseBody self = new DescribeDataProcessJobAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataProcessJobAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeDataProcessJobAttributeResponseBody setDestinationConfig(String destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }
    public String getDestinationConfig() {
        return this.destinationConfig;
    }

    public DescribeDataProcessJobAttributeResponseBody setDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public String getDestinationId() {
        return this.destinationId;
    }

    public DescribeDataProcessJobAttributeResponseBody setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
        return this;
    }
    public String getDestinationPath() {
        return this.destinationPath;
    }

    public DescribeDataProcessJobAttributeResponseBody setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public DescribeDataProcessJobAttributeResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeDataProcessJobAttributeResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DescribeDataProcessJobAttributeResponseBody setProcessingMode(String processingMode) {
        this.processingMode = processingMode;
        return this;
    }
    public String getProcessingMode() {
        return this.processingMode;
    }

    public DescribeDataProcessJobAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDataProcessJobAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataProcessJobAttributeResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public DescribeDataProcessJobAttributeResponseBody setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

    public DescribeDataProcessJobAttributeResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeDataProcessJobAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDataProcessJobAttributeResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DescribeDataProcessJobAttributeResponseBody setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
