// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDataProcessJobRequest extends TeaModel {
    /**
     * <p>The description of the data processing task.</p>
     * 
     * <strong>example:</strong>
     * <p>Image data processing task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The JSON string for the destination database connection configuration, including Account and Password.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Account&quot;:&quot;example_user&quot;,&quot;Password&quot;:&quot;example_password&quot;}</p>
     */
    @NameInMap("DestinationConfig")
    public String destinationConfig;

    /**
     * <p>The ID of the destination PolarDB cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-test123456</p>
     */
    @NameInMap("DestinationId")
    public String destinationId;

    /**
     * <p>The name of the destination database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DestinationPath")
    public String destinationPath;

    /**
     * <p>The type of the destination. Only PolarDB is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDB</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The name of the model used for feature extraction.</p>
     * 
     * <strong>example:</strong>
     * <p>model-v1</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The processing mode. Valid values: Full, Incremental, and Both.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Full</p>
     */
    @NameInMap("ProcessingMode")
    public String processingMode;

    /**
     * <p>The ID of the region where the task resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The additional configuration for the data source in JSON string format. This parameter can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("SourceConfig")
    public String sourceConfig;

    /**
     * <p>The ID of the PolarFS instance that serves as the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-123456</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source data path in PolarFS. An empty string indicates the default path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/images</p>
     */
    @NameInMap("SourcePath")
    public String sourcePath;

    /**
     * <p>The type of the data source. Only PolarFS is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarFS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the task template used to process data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl-123456</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateDataProcessJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataProcessJobRequest self = new CreateDataProcessJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataProcessJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataProcessJobRequest setDestinationConfig(String destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }
    public String getDestinationConfig() {
        return this.destinationConfig;
    }

    public CreateDataProcessJobRequest setDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public String getDestinationId() {
        return this.destinationId;
    }

    public CreateDataProcessJobRequest setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
        return this;
    }
    public String getDestinationPath() {
        return this.destinationPath;
    }

    public CreateDataProcessJobRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public CreateDataProcessJobRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateDataProcessJobRequest setProcessingMode(String processingMode) {
        this.processingMode = processingMode;
        return this;
    }
    public String getProcessingMode() {
        return this.processingMode;
    }

    public CreateDataProcessJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataProcessJobRequest setSourceConfig(String sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public String getSourceConfig() {
        return this.sourceConfig;
    }

    public CreateDataProcessJobRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateDataProcessJobRequest setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

    public CreateDataProcessJobRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateDataProcessJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
