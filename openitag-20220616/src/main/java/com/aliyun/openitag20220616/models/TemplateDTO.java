// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TemplateDTO extends TeaModel {
    @NameInMap("Classify")
    public String classify;

    @NameInMap("Description")
    public String description;

    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QuestionConfigs")
    public java.util.List<QuestionPlugin> questionConfigs;

    @NameInMap("RobotConfigs")
    public java.util.List<java.util.Map<String, ?>> robotConfigs;

    @NameInMap("SharedMode")
    public String sharedMode;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ViewConfigs")
    public TemplateDTOViewConfigs viewConfigs;

    public static TemplateDTO build(java.util.Map<String, ?> map) throws Exception {
        TemplateDTO self = new TemplateDTO();
        return TeaModel.build(map, self);
    }

    public TemplateDTO setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public TemplateDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TemplateDTO setExif(java.util.Map<String, ?> exif) {
        this.exif = exif;
        return this;
    }
    public java.util.Map<String, ?> getExif() {
        return this.exif;
    }

    public TemplateDTO setQuestionConfigs(java.util.List<QuestionPlugin> questionConfigs) {
        this.questionConfigs = questionConfigs;
        return this;
    }
    public java.util.List<QuestionPlugin> getQuestionConfigs() {
        return this.questionConfigs;
    }

    public TemplateDTO setRobotConfigs(java.util.List<java.util.Map<String, ?>> robotConfigs) {
        this.robotConfigs = robotConfigs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getRobotConfigs() {
        return this.robotConfigs;
    }

    public TemplateDTO setSharedMode(String sharedMode) {
        this.sharedMode = sharedMode;
        return this;
    }
    public String getSharedMode() {
        return this.sharedMode;
    }

    public TemplateDTO setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public TemplateDTO setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public TemplateDTO setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public TemplateDTO setViewConfigs(TemplateDTOViewConfigs viewConfigs) {
        this.viewConfigs = viewConfigs;
        return this;
    }
    public TemplateDTOViewConfigs getViewConfigs() {
        return this.viewConfigs;
    }

    public static class TemplateDTOViewConfigs extends TeaModel {
        @NameInMap("ViewPlugins")
        public java.util.List<ViewPlugin> viewPlugins;

        public static TemplateDTOViewConfigs build(java.util.Map<String, ?> map) throws Exception {
            TemplateDTOViewConfigs self = new TemplateDTOViewConfigs();
            return TeaModel.build(map, self);
        }

        public TemplateDTOViewConfigs setViewPlugins(java.util.List<ViewPlugin> viewPlugins) {
            this.viewPlugins = viewPlugins;
            return this;
        }
        public java.util.List<ViewPlugin> getViewPlugins() {
            return this.viewPlugins;
        }

    }

}
