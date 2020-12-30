// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class UpdateConfigTemplateResponseBody extends TeaModel {
    @NameInMap("ConfigTemplate")
    public UpdateConfigTemplateResponseBodyConfigTemplate configTemplate;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static UpdateConfigTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigTemplateResponseBody self = new UpdateConfigTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigTemplateResponseBody setConfigTemplate(UpdateConfigTemplateResponseBodyConfigTemplate configTemplate) {
        this.configTemplate = configTemplate;
        return this;
    }
    public UpdateConfigTemplateResponseBodyConfigTemplate getConfigTemplate() {
        return this.configTemplate;
    }

    public UpdateConfigTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateConfigTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateConfigTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class UpdateConfigTemplateResponseBodyConfigTemplate extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateId")
        public String templateId;

        public static UpdateConfigTemplateResponseBodyConfigTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigTemplateResponseBodyConfigTemplate self = new UpdateConfigTemplateResponseBodyConfigTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateConfigTemplateResponseBodyConfigTemplate setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateConfigTemplateResponseBodyConfigTemplate setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public UpdateConfigTemplateResponseBodyConfigTemplate setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public UpdateConfigTemplateResponseBodyConfigTemplate setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateConfigTemplateResponseBodyConfigTemplate setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateConfigTemplateResponseBodyConfigTemplate setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public UpdateConfigTemplateResponseBodyConfigTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public UpdateConfigTemplateResponseBodyConfigTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
