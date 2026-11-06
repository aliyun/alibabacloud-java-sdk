// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDataProcessJobTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to fetch the image summary or video synopsis. When Settings is true, CaptioningPrompt must be provided.</p>
     */
    @NameInMap("Captioning")
    public Boolean captioning;

    /**
     * <p>The prompt used for extracting captions. This parameter takes effect only when Captioning is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>Summarize the image content</p>
     */
    @NameInMap("CaptioningPrompt")
    public String captioningPrompt;

    /**
     * <p>Specifies whether to convert the content into vectors.</p>
     */
    @NameInMap("Embedding")
    public Boolean embedding;

    /**
     * <p>The output dimension of the vector. Valid values when Embedding is set to true: 512, 768, 1024, and 2048.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("EmbeddingDimension")
    public Integer embeddingDimension;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The JSON string for additional template configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ETL_TEMPLATE_STR&quot;:&quot;config&quot;}</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The name of the task template.</p>
     * 
     * <strong>example:</strong>
     * <p>template1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The templatetype of the node template. Valid value: image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static CreateDataProcessJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataProcessJobTemplateRequest self = new CreateDataProcessJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataProcessJobTemplateRequest setCaptioning(Boolean captioning) {
        this.captioning = captioning;
        return this;
    }
    public Boolean getCaptioning() {
        return this.captioning;
    }

    public CreateDataProcessJobTemplateRequest setCaptioningPrompt(String captioningPrompt) {
        this.captioningPrompt = captioningPrompt;
        return this;
    }
    public String getCaptioningPrompt() {
        return this.captioningPrompt;
    }

    public CreateDataProcessJobTemplateRequest setEmbedding(Boolean embedding) {
        this.embedding = embedding;
        return this;
    }
    public Boolean getEmbedding() {
        return this.embedding;
    }

    public CreateDataProcessJobTemplateRequest setEmbeddingDimension(Integer embeddingDimension) {
        this.embeddingDimension = embeddingDimension;
        return this;
    }
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    public CreateDataProcessJobTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataProcessJobTemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public CreateDataProcessJobTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateDataProcessJobTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
