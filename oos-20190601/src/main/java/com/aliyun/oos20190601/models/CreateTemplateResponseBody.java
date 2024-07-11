// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metadata of the template.</p>
     */
    @NameInMap("Template")
    public CreateTemplateResponseBodyTemplate template;

    /**
     * <p>The type of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
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
        /**
         * <p>The creator of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>root(13090000)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Describe instances of given status</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the template was configured with a trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasTrigger")
        public Boolean hasTrigger;

        /**
         * <p>The SHA-256 value of the template content.</p>
         * 
         * <strong>example:</strong>
         * <p>4bc7d7a21b3e003434b9c223f6e6d2578b5ebfeb5be28c1fcf8a8a1b11907bb4</p>
         */
        @NameInMap("Hash")
        public String hash;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The share type of the template. The share type of the template that you create is Private.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tags of the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;k1&quot;:&quot;v1&quot;,     &quot;k2&quot;:&quot;v2&quot; }</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The format of the template. The system automatically determines whether the format is JSON or YAML.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("TemplateFormat")
        public String templateFormat;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>t-94753d38</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTemplate</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The version of the template. The name of the version consists of the letter v and a number. The number starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The Alibaba Cloud account that last modified the information about the template.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the template was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
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
