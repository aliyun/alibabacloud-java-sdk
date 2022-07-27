// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Template")
    public CreateTemplateResponseBodyTemplate template;

    @NameInMap("TemplateType")
    public String templateType;

    public static CreateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateResponseBody self = new CreateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTemplateResponseBody setTemplate(CreateTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public CreateTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public CreateTemplateResponseBody setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public static class CreateTemplateResponseBodyTemplate extends TeaModel {
        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("HasTrigger")
        public Boolean hasTrigger;

        @NameInMap("Hash")
        public String hash;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("TemplateFormat")
        public String templateFormat;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static CreateTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateResponseBodyTemplate self = new CreateTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public CreateTemplateResponseBodyTemplate setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public CreateTemplateResponseBodyTemplate setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public CreateTemplateResponseBodyTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTemplateResponseBodyTemplate setHasTrigger(Boolean hasTrigger) {
            this.hasTrigger = hasTrigger;
            return this;
        }
        public Boolean getHasTrigger() {
            return this.hasTrigger;
        }

        public CreateTemplateResponseBodyTemplate setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public CreateTemplateResponseBodyTemplate setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateTemplateResponseBodyTemplate setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public CreateTemplateResponseBodyTemplate setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public CreateTemplateResponseBodyTemplate setTemplateFormat(String templateFormat) {
            this.templateFormat = templateFormat;
            return this;
        }
        public String getTemplateFormat() {
            return this.templateFormat;
        }

        public CreateTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateTemplateResponseBodyTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public CreateTemplateResponseBodyTemplate setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public CreateTemplateResponseBodyTemplate setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public CreateTemplateResponseBodyTemplate setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
