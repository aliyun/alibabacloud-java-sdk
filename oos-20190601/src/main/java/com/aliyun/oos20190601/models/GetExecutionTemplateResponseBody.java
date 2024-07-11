// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetExecutionTemplateResponseBody extends TeaModel {
    /**
     * <p>The content of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\n \&quot;FormatVersion\&quot;: \&quot;OOS-2019-06-01\&quot;,\n \&quot;Parameters\&quot;: {\n \&quot;Status\&quot;: {\n \&quot;Type\&quot;: \&quot;String\&quot;,\n \&quot;Description\&quot;: \&quot;(Required) The ID of the ECS instance.\&quot;\n }\n },\n \&quot;Tasks\&quot;: [\n {\n \&quot;Name\&quot;: \&quot;bar\&quot;,\n \&quot;Properties\&quot;: {\n \&quot;Parameters\&quot;: {\n \&quot;Status\&quot;: \&quot;{{ Status }}\&quot;\n },\n \&quot;API\&quot;: \&quot;DescribeInstances\&quot;,\n \&quot;Service\&quot;: \&quot;Ecs\&quot;\n },\n \&quot;Action\&quot;: \&quot;acs::ExecuteAPI\&quot;,\n \&quot;Outputs\&quot;: {\n \&quot;InstanceIds\&quot;, {\n \&quot;ValueSelector\&quot;: \&quot;.Instances.Instance[].InstanceId\&quot;,\n \&quot;Type\&quot;: \&quot;List\&quot;\n }\n }\n }\n ],\n \&quot;Outputs\&quot;: {\n \&quot;InstanceIds\&quot;: {\n \&quot;Value\&quot;: \&quot; {{ bar.InstanceIds }} \&quot;,\n \&quot;Type\&quot;: \&quot;List\&quot;\n }\n }\n}\n&quot;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>14A60-EBE7-47CA-9757-12C1D47A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metadata of the template.</p>
     */
    @NameInMap("Template")
    public GetExecutionTemplateResponseBodyTemplate template;

    public static GetExecutionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExecutionTemplateResponseBody self = new GetExecutionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExecutionTemplateResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetExecutionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExecutionTemplateResponseBody setTemplate(GetExecutionTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public GetExecutionTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class GetExecutionTemplateResponseBodyTemplate extends TeaModel {
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
         * <p>Get status of instances</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The SHA-256 value of the template content.</p>
         * 
         * <strong>example:</strong>
         * <p>4bc7d7a21b3e003434b9c223f6e6d2578b5ebfeb5be28c1fcf8a8a1b11907bb4</p>
         */
        @NameInMap("Hash")
        public String hash;

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
         * <p>t-94753d4d828d38</p>
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
         * <p>The user who last updated the template.</p>
         * 
         * <strong>example:</strong>
         * <p>root(13090000)</p>
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

        public static GetExecutionTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetExecutionTemplateResponseBodyTemplate self = new GetExecutionTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
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

        public GetExecutionTemplateResponseBodyTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetExecutionTemplateResponseBodyTemplate setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public GetExecutionTemplateResponseBodyTemplate setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public GetExecutionTemplateResponseBodyTemplate setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetExecutionTemplateResponseBodyTemplate setTemplateFormat(String templateFormat) {
            this.templateFormat = templateFormat;
            return this;
        }
        public String getTemplateFormat() {
            return this.templateFormat;
        }

        public GetExecutionTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
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

        public GetExecutionTemplateResponseBodyTemplate setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetExecutionTemplateResponseBodyTemplate setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
