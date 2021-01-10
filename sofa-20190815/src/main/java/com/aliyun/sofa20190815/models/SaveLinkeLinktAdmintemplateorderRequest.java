// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktAdmintemplateorderRequest extends TeaModel {
    @NameInMap("Stamp")
    public String stamp;

    @NameInMap("Templates")
    public java.util.List<SaveLinkeLinktAdmintemplateorderRequestTemplates> templates;

    public static SaveLinkeLinktAdmintemplateorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktAdmintemplateorderRequest self = new SaveLinkeLinktAdmintemplateorderRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktAdmintemplateorderRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public SaveLinkeLinktAdmintemplateorderRequest setTemplates(java.util.List<SaveLinkeLinktAdmintemplateorderRequestTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<SaveLinkeLinktAdmintemplateorderRequestTemplates> getTemplates() {
        return this.templates;
    }

    public static class SaveLinkeLinktAdmintemplateorderRequestTemplates extends TeaModel {
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

        public static SaveLinkeLinktAdmintemplateorderRequestTemplates build(java.util.Map<String, ?> map) throws Exception {
            SaveLinkeLinktAdmintemplateorderRequestTemplates self = new SaveLinkeLinktAdmintemplateorderRequestTemplates();
            return TeaModel.build(map, self);
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setDefaultContent(String defaultContent) {
            this.defaultContent = defaultContent;
            return this;
        }
        public String getDefaultContent() {
            return this.defaultContent;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setTemplateLabel(String templateLabel) {
            this.templateLabel = templateLabel;
            return this;
        }
        public String getTemplateLabel() {
            return this.templateLabel;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public SaveLinkeLinktAdmintemplateorderRequestTemplates setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

}
