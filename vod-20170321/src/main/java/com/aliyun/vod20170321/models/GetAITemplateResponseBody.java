// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAITemplateResponseBody extends TeaModel {
    /**
     * <p>The information about the AI template.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the AI template.</p>
     */
    @NameInMap("TemplateInfo")
    public GetAITemplateResponseBodyTemplateInfo templateInfo;

    public static GetAITemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAITemplateResponseBody self = new GetAITemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAITemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAITemplateResponseBody setTemplateInfo(GetAITemplateResponseBodyTemplateInfo templateInfo) {
        this.templateInfo = templateInfo;
        return this;
    }
    public GetAITemplateResponseBodyTemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public static class GetAITemplateResponseBodyTemplateInfo extends TeaModel {
        /**
         * <p>The type of the AI template. Valid values:</p>
         * <br>
         * <p>*   **AIMediaAudit**: automated review</p>
         * <p>*   **AIImage**: smart thumbnail</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The time when the AI template was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>Queries the details of an AI template.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The time when the AI template was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>Indicates whether the template is the default AI template. Valid values:</p>
         * <br>
         * <p>*   **Default**</p>
         * <p>*   **NotDefault**</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static GetAITemplateResponseBodyTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAITemplateResponseBodyTemplateInfo self = new GetAITemplateResponseBodyTemplateInfo();
            return TeaModel.build(map, self);
        }

        public GetAITemplateResponseBodyTemplateInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAITemplateResponseBodyTemplateInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetAITemplateResponseBodyTemplateInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetAITemplateResponseBodyTemplateInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAITemplateResponseBodyTemplateInfo setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetAITemplateResponseBodyTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetAITemplateResponseBodyTemplateInfo setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetAITemplateResponseBodyTemplateInfo setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
