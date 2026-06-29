// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TemplateDTO extends TeaModel {
    /**
     * <p>Template categorization</p>
     * 
     * <strong>example:</strong>
     * <p>picture</p>
     */
    @NameInMap("Classify")
    public String classify;

    /**
     * <p>Template description</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Template additional information</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    /**
     * <p>List of question widget configurations</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("QuestionConfigs")
    public java.util.List<QuestionPlugin> questionConfigs;

    /**
     * <p>List of assisted annotation configurations</p>
     */
    @NameInMap("RobotConfigs")
    public java.util.List<java.util.Map<String, ?>> robotConfigs;

    /**
     * <p>Template shared mode</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SharedMode")
    public String sharedMode;

    /**
     * <p>List of tag information</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>Template ID</p>
     * 
     * <strong>example:</strong>
     * <p>1529***48342353920</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Template Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>View layer configuration</p>
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
        /**
         * <p>List of view widgets</p>
         */
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
