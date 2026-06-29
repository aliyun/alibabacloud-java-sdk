// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TemplateDetail extends TeaModel {
    /**
     * <p>Reasons for deprecation.</p>
     */
    @NameInMap("AbandonReasons")
    public java.util.List<String> abandonReasons;

    /**
     * <p>Template categorization.</p>
     * 
     * <strong>example:</strong>
     * <p>picture</p>
     */
    @NameInMap("Classify")
    public String classify;

    /**
     * <p>Creator.</p>
     */
    @NameInMap("Creator")
    public SimpleUser creator;

    /**
     * <p>Template description.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Additional template information.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    /**
     * <p>Creation Time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-07 16:09:20</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Updated At.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-07 16:09:20</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Modifier.</p>
     */
    @NameInMap("Modifier")
    public SimpleUser modifier;

    /**
     * <p>Question widget configuration.</p>
     */
    @NameInMap("QuestionConfigs")
    public java.util.List<QuestionPlugin> questionConfigs;

    /**
     * <p>Template shared mode.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SharedMode")
    public String sharedMode;

    /**
     * <p>Template status.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Label information.</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>Template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1529***48342353920</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Template Name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>Tenant where the template resides.</p>
     * 
     * <strong>example:</strong>
     * <p>GA***W134</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>Template type.</p>
     * 
     * <strong>example:</strong>
     * <p>picture</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>View layer configuration.</p>
     */
    @NameInMap("ViewConfigs")
    public TemplateDetailViewConfigs viewConfigs;

    public static TemplateDetail build(java.util.Map<String, ?> map) throws Exception {
        TemplateDetail self = new TemplateDetail();
        return TeaModel.build(map, self);
    }

    public TemplateDetail setAbandonReasons(java.util.List<String> abandonReasons) {
        this.abandonReasons = abandonReasons;
        return this;
    }
    public java.util.List<String> getAbandonReasons() {
        return this.abandonReasons;
    }

    public TemplateDetail setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public TemplateDetail setCreator(SimpleUser creator) {
        this.creator = creator;
        return this;
    }
    public SimpleUser getCreator() {
        return this.creator;
    }

    public TemplateDetail setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TemplateDetail setExif(java.util.Map<String, ?> exif) {
        this.exif = exif;
        return this;
    }
    public java.util.Map<String, ?> getExif() {
        return this.exif;
    }

    public TemplateDetail setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public TemplateDetail setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public TemplateDetail setModifier(SimpleUser modifier) {
        this.modifier = modifier;
        return this;
    }
    public SimpleUser getModifier() {
        return this.modifier;
    }

    public TemplateDetail setQuestionConfigs(java.util.List<QuestionPlugin> questionConfigs) {
        this.questionConfigs = questionConfigs;
        return this;
    }
    public java.util.List<QuestionPlugin> getQuestionConfigs() {
        return this.questionConfigs;
    }

    public TemplateDetail setSharedMode(String sharedMode) {
        this.sharedMode = sharedMode;
        return this;
    }
    public String getSharedMode() {
        return this.sharedMode;
    }

    public TemplateDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TemplateDetail setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public TemplateDetail setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public TemplateDetail setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public TemplateDetail setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public TemplateDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TemplateDetail setViewConfigs(TemplateDetailViewConfigs viewConfigs) {
        this.viewConfigs = viewConfigs;
        return this;
    }
    public TemplateDetailViewConfigs getViewConfigs() {
        return this.viewConfigs;
    }

    public static class TemplateDetailViewConfigs extends TeaModel {
        /**
         * <p>View widgets.</p>
         */
        @NameInMap("ViewPlugins")
        public java.util.List<ViewPlugin> viewPlugins;

        public static TemplateDetailViewConfigs build(java.util.Map<String, ?> map) throws Exception {
            TemplateDetailViewConfigs self = new TemplateDetailViewConfigs();
            return TeaModel.build(map, self);
        }

        public TemplateDetailViewConfigs setViewPlugins(java.util.List<ViewPlugin> viewPlugins) {
            this.viewPlugins = viewPlugins;
            return this;
        }
        public java.util.List<ViewPlugin> getViewPlugins() {
            return this.viewPlugins;
        }

    }

}
