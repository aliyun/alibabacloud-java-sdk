// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktTemplateorderRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Stamp")
    public String stamp;

    @NameInMap("Templates")
    public java.util.List<SaveLinkeLinktTemplateorderRequestTemplates> templates;

    public static SaveLinkeLinktTemplateorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktTemplateorderRequest self = new SaveLinkeLinktTemplateorderRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktTemplateorderRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public SaveLinkeLinktTemplateorderRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public SaveLinkeLinktTemplateorderRequest setTemplates(java.util.List<SaveLinkeLinktTemplateorderRequestTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<SaveLinkeLinktTemplateorderRequestTemplates> getTemplates() {
        return this.templates;
    }

    public static class SaveLinkeLinktTemplateorderRequestTemplates extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DefaultContent")
        public String defaultContent;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("TemplateLabel")
        public String templateLabel;

        @NameInMap("Type")
        public Long type;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static SaveLinkeLinktTemplateorderRequestTemplates build(java.util.Map<String, ?> map) throws Exception {
            SaveLinkeLinktTemplateorderRequestTemplates self = new SaveLinkeLinktTemplateorderRequestTemplates();
            return TeaModel.build(map, self);
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setDefaultContent(String defaultContent) {
            this.defaultContent = defaultContent;
            return this;
        }
        public String getDefaultContent() {
            return this.defaultContent;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setTemplateLabel(String templateLabel) {
            this.templateLabel = templateLabel;
            return this;
        }
        public String getTemplateLabel() {
            return this.templateLabel;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public SaveLinkeLinktTemplateorderRequestTemplates setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

}
