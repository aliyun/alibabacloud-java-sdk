// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2075899A-585D-4A41-A9B2-28DF4F534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metadata of the template.</p>
     */
    @NameInMap("Template")
    public UpdateTemplateResponseBodyTemplate template;

    public static UpdateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateResponseBody self = new UpdateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTemplateResponseBody setTemplate(UpdateTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public UpdateTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class UpdateTemplateResponseBodyTemplate extends TeaModel {
        /**
         * <p>The user who created the template.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130920000)</p>
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
         * <p>Indicates whether the template is configured with a trigger.</p>
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
         * <p>The share type of the template. The share type of a user-created template is <strong>Private</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;k2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
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
         * <p>t-94753deed38</p>
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
         * <p>v2</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The user who last modified the information about the template.</p>
         * 
         * <strong>example:</strong>
         * <p>root(1309000)</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the information about the template was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static UpdateTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplate self = new UpdateTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplate setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public UpdateTemplateResponseBodyTemplate setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public UpdateTemplateResponseBodyTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateTemplateResponseBodyTemplate setHasTrigger(Boolean hasTrigger) {
            this.hasTrigger = hasTrigger;
            return this;
        }
        public Boolean getHasTrigger() {
            return this.hasTrigger;
        }

        public UpdateTemplateResponseBodyTemplate setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public UpdateTemplateResponseBodyTemplate setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateTemplateResponseBodyTemplate setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public UpdateTemplateResponseBodyTemplate setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public UpdateTemplateResponseBodyTemplate setTemplateFormat(String templateFormat) {
            this.templateFormat = templateFormat;
            return this;
        }
        public String getTemplateFormat() {
            return this.templateFormat;
        }

        public UpdateTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public UpdateTemplateResponseBodyTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public UpdateTemplateResponseBodyTemplate setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public UpdateTemplateResponseBodyTemplate setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public UpdateTemplateResponseBodyTemplate setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
