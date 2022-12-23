// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAITemplateResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the AI templates.
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
        // The time when the AI template was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // Indicates whether the template is the default AI template. Valid values:
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

        // The type of the AI template. Valid values:
        // 
        // *   **AIMediaAudit**: automated review
        // *   **AIImage**: smart thumbnail
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
