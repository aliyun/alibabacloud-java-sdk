// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAITemplateResponseBody extends TeaModel {
    @NameInMap("TemplateInfo")
    public GetAITemplateResponseBodyTemplateInfo templateInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAITemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAITemplateResponseBody self = new GetAITemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAITemplateResponseBody setTemplateInfo(GetAITemplateResponseBodyTemplateInfo templateInfo) {
        this.templateInfo = templateInfo;
        return this;
    }
    public GetAITemplateResponseBodyTemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public GetAITemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAITemplateResponseBodyTemplateInfo extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IsDefault")
        public String isDefault;

        @NameInMap("TemplateType")
        public String templateType;

        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Source")
        public String source;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("ModifyTime")
        public String modifyTime;

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

        public GetAITemplateResponseBodyTemplateInfo setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public GetAITemplateResponseBodyTemplateInfo setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetAITemplateResponseBodyTemplateInfo setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetAITemplateResponseBodyTemplateInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAITemplateResponseBodyTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetAITemplateResponseBodyTemplateInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
