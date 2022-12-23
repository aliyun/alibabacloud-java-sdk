// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDefaultAITemplateResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the AI template.
    @NameInMap("TemplateInfo")
    public GetDefaultAITemplateResponseBodyTemplateInfo templateInfo;

    public static GetDefaultAITemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAITemplateResponseBody self = new GetDefaultAITemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefaultAITemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDefaultAITemplateResponseBody setTemplateInfo(GetDefaultAITemplateResponseBodyTemplateInfo templateInfo) {
        this.templateInfo = templateInfo;
        return this;
    }
    public GetDefaultAITemplateResponseBodyTemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public static class GetDefaultAITemplateResponseBodyTemplateInfo extends TeaModel {
        // The time when the AI template was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // Indicates whether the template is the default template. Valid values:
        // 
        // *   **Default**
        // *   **NotDefault**
        @NameInMap("IsDefault")
        public String isDefault;

        // The time when the AI template was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModifyTime")
        public String modifyTime;

        // The source of the AI template. Valid values:
        // 
        // *   **System**
        // *   **Custom**
        @NameInMap("Source")
        public String source;

        // The detailed configurations of the AI template. The value is a JSON string.
        @NameInMap("TemplateConfig")
        public String templateConfig;

        // The ID of the AI template.
        @NameInMap("TemplateId")
        public String templateId;

        // The name of the AI template.
        @NameInMap("TemplateName")
        public String templateName;

        // The type of the AI template. The value is **AIMediaAudit**, which indicates intelligent review.
        @NameInMap("TemplateType")
        public String templateType;

        public static GetDefaultAITemplateResponseBodyTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultAITemplateResponseBodyTemplateInfo self = new GetDefaultAITemplateResponseBodyTemplateInfo();
            return TeaModel.build(map, self);
        }

        public GetDefaultAITemplateResponseBodyTemplateInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetDefaultAITemplateResponseBodyTemplateInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetDefaultAITemplateResponseBodyTemplateInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetDefaultAITemplateResponseBodyTemplateInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetDefaultAITemplateResponseBodyTemplateInfo setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetDefaultAITemplateResponseBodyTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetDefaultAITemplateResponseBodyTemplateInfo setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetDefaultAITemplateResponseBodyTemplateInfo setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
