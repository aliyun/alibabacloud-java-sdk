// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAITemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IsDefault")
        public String isDefault;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

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
