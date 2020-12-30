// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateConfigTemplateResponseBody extends TeaModel {
    @NameInMap("ConfigTemplate")
    public CreateConfigTemplateResponseBodyConfigTemplate configTemplate;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static CreateConfigTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigTemplateResponseBody self = new CreateConfigTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigTemplateResponseBody setConfigTemplate(CreateConfigTemplateResponseBodyConfigTemplate configTemplate) {
        this.configTemplate = configTemplate;
        return this;
    }
    public CreateConfigTemplateResponseBodyConfigTemplate getConfigTemplate() {
        return this.configTemplate;
    }

    public CreateConfigTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateConfigTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConfigTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateConfigTemplateResponseBodyConfigTemplate extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("TemplateType")
        public String templateType;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("PkgVersionId")
        public String pkgVersionId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateDescription")
        public String templateDescription;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("PkgVersionLabel")
        public String pkgVersionLabel;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("TemplateId")
        public String templateId;

        public static CreateConfigTemplateResponseBodyConfigTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateConfigTemplateResponseBodyConfigTemplate self = new CreateConfigTemplateResponseBodyConfigTemplate();
            return TeaModel.build(map, self);
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setPkgVersionId(String pkgVersionId) {
            this.pkgVersionId = pkgVersionId;
            return this;
        }
        public String getPkgVersionId() {
            return this.pkgVersionId;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setPkgVersionLabel(String pkgVersionLabel) {
            this.pkgVersionLabel = pkgVersionLabel;
            return this;
        }
        public String getPkgVersionLabel() {
            return this.pkgVersionLabel;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateConfigTemplateResponseBodyConfigTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
