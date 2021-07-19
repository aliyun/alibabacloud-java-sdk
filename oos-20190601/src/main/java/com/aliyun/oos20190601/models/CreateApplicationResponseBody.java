// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Application")
    public CreateApplicationResponseBodyApplication application;

    public static CreateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponseBody self = new CreateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationResponseBody setApplication(CreateApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public CreateApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public static class CreateApplicationResponseBodyApplicationCloudMonitorRule extends TeaModel {
        @NameInMap("EnableSubscribeEvent")
        public Boolean enableSubscribeEvent;

        @NameInMap("EnableInstallAgent")
        public Boolean enableInstallAgent;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ContactGroupList")
        public java.util.List<String> contactGroupList;

        @NameInMap("TemplateIdList")
        public java.util.List<Integer> templateIdList;

        public static CreateApplicationResponseBodyApplicationCloudMonitorRule build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyApplicationCloudMonitorRule self = new CreateApplicationResponseBodyApplicationCloudMonitorRule();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyApplicationCloudMonitorRule setEnableSubscribeEvent(Boolean enableSubscribeEvent) {
            this.enableSubscribeEvent = enableSubscribeEvent;
            return this;
        }
        public Boolean getEnableSubscribeEvent() {
            return this.enableSubscribeEvent;
        }

        public CreateApplicationResponseBodyApplicationCloudMonitorRule setEnableInstallAgent(Boolean enableInstallAgent) {
            this.enableInstallAgent = enableInstallAgent;
            return this;
        }
        public Boolean getEnableInstallAgent() {
            return this.enableInstallAgent;
        }

        public CreateApplicationResponseBodyApplicationCloudMonitorRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateApplicationResponseBodyApplicationCloudMonitorRule setContactGroupList(java.util.List<String> contactGroupList) {
            this.contactGroupList = contactGroupList;
            return this;
        }
        public java.util.List<String> getContactGroupList() {
            return this.contactGroupList;
        }

        public CreateApplicationResponseBodyApplicationCloudMonitorRule setTemplateIdList(java.util.List<Integer> templateIdList) {
            this.templateIdList = templateIdList;
            return this;
        }
        public java.util.List<Integer> getTemplateIdList() {
            return this.templateIdList;
        }

    }

    public static class CreateApplicationResponseBodyApplication extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("IsSystem")
        public Boolean isSystem;

        @NameInMap("Description")
        public String description;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("CloudMonitorRule")
        public CreateApplicationResponseBodyApplicationCloudMonitorRule cloudMonitorRule;

        public static CreateApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyApplication self = new CreateApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyApplication setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateApplicationResponseBodyApplication setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public Boolean getIsSystem() {
            return this.isSystem;
        }

        public CreateApplicationResponseBodyApplication setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApplicationResponseBodyApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public CreateApplicationResponseBodyApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApplicationResponseBodyApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateApplicationResponseBodyApplication setCloudMonitorRule(CreateApplicationResponseBodyApplicationCloudMonitorRule cloudMonitorRule) {
            this.cloudMonitorRule = cloudMonitorRule;
            return this;
        }
        public CreateApplicationResponseBodyApplicationCloudMonitorRule getCloudMonitorRule() {
            return this.cloudMonitorRule;
        }

    }

}
