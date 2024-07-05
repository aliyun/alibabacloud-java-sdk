// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAITemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>75B7BC67-FB8C-4653-4788-F4B01ED2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the AI templates.</p>
     */
    @NameInMap("TemplateInfoList")
    public java.util.List<ListAITemplateResponseBodyTemplateInfoList> templateInfoList;

    public static ListAITemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAITemplateResponseBody self = new ListAITemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAITemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAITemplateResponseBody setTemplateInfoList(java.util.List<ListAITemplateResponseBodyTemplateInfoList> templateInfoList) {
        this.templateInfoList = templateInfoList;
        return this;
    }
    public java.util.List<ListAITemplateResponseBodyTemplateInfoList> getTemplateInfoList() {
        return this.templateInfoList;
    }

    public static class ListAITemplateResponseBodyTemplateInfoList extends TeaModel {
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
         * <p>NoDefault</p>
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
         * <p>The type of the AI template. Valid values:</p>
         * <ul>
         * <li><strong>AIMediaAudit</strong>: automated review</li>
         * <li><strong>AIImage</strong>: smart thumbnail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AIMediaAudit</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static ListAITemplateResponseBodyTemplateInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAITemplateResponseBodyTemplateInfoList self = new ListAITemplateResponseBodyTemplateInfoList();
            return TeaModel.build(map, self);
        }

        public ListAITemplateResponseBodyTemplateInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAITemplateResponseBodyTemplateInfoList setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public ListAITemplateResponseBodyTemplateInfoList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAITemplateResponseBodyTemplateInfoList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAITemplateResponseBodyTemplateInfoList setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public ListAITemplateResponseBodyTemplateInfoList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListAITemplateResponseBodyTemplateInfoList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListAITemplateResponseBodyTemplateInfoList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
