// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TemplateDetail extends TeaModel {
    @NameInMap("AbandonReasons")
    public java.util.List<String> abandonReasons;

    @NameInMap("Classify")
    public String classify;

    @NameInMap("Creator")
    public SimpleUser creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Modifier")
    public SimpleUser modifier;

    @NameInMap("QuestionConfigs")
    public java.util.List<QuestionPlugin> questionConfigs;

    @NameInMap("SharedMode")
    public String sharedMode;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

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
