// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDefaultAITemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A017F1DE-3DC3-4441-6755-37E81113****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the AI template.</p>
     */
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
        /**
         * <p>The time when the AI template was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-08T06:50:45Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the template is the default AI template. Valid values:</p>
         * <ul>
         * <li><strong>Default</strong></li>
         * <li><strong>NotDefault</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The time when the AI template was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-08T06:58:45Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The source of the AI template. Valid values:</p>
         * <ul>
         * <li><strong>System</strong></li>
         * <li><strong>Custom</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The detailed configurations of the AI template. The value is a JSON string. For more information, see <a href="~~89863#title-vd3-499-o36~~">AITemplateConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AuditRange&quot;:[&quot;text-title&quot;,&quot;video&quot;],&quot;AuditContent&quot;:[&quot;screen&quot;],&quot;AuditItem&quot;:[&quot;terrorism&quot;,&quot;porn&quot;],&quot;AuditAutoBlock&quot;:&quot;yes&quot;}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <p>The ID of the AI template.</p>
         * 
         * <strong>example:</strong>
         * <p>1706a0063dd733f6a823ef32e0a5****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the AI template.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoAITemplate</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type of the AI template. The value is <strong>AIMediaAudit</strong>, which indicates automated review.</p>
         * 
         * <strong>example:</strong>
         * <p>AIMediaAudit</p>
         */
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
