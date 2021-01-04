// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetExecutionTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public String content;

    @NameInMap("Template")
    public GetExecutionTemplateResponseBodyTemplate template;

    public static GetExecutionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExecutionTemplateResponseBody self = new GetExecutionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExecutionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExecutionTemplateResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetExecutionTemplateResponseBody setTemplate(GetExecutionTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public GetExecutionTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class GetExecutionTemplateResponseBodyTemplate extends TeaModel {
        @NameInMap("Hash")
        public String hash;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("TemplateFormat")
        public String templateFormat;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("ShareType")
        public String shareType;

        public static GetExecutionTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetExecutionTemplateResponseBodyTemplate self = new GetExecutionTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public GetExecutionTemplateResponseBodyTemplate setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public GetExecutionTemplateResponseBodyTemplate setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetExecutionTemplateResponseBodyTemplate setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetExecutionTemplateResponseBodyTemplate setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetExecutionTemplateResponseBodyTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetExecutionTemplateResponseBodyTemplate setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public GetExecutionTemplateResponseBodyTemplate setTemplateFormat(String templateFormat) {
            this.templateFormat = templateFormat;
            return this;
        }
        public String getTemplateFormat() {
            return this.templateFormat;
        }

        public GetExecutionTemplateResponseBodyTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetExecutionTemplateResponseBodyTemplate setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetExecutionTemplateResponseBodyTemplate setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetExecutionTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetExecutionTemplateResponseBodyTemplate setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

    }

}
