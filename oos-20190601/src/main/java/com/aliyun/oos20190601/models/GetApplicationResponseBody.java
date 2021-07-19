// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Application")
    public GetApplicationResponseBodyApplication application;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplicationResponseBody setApplication(GetApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public GetApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public static class GetApplicationResponseBodyApplicationCloudMonitorRule extends TeaModel {
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

        public static GetApplicationResponseBodyApplicationCloudMonitorRule build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplicationCloudMonitorRule self = new GetApplicationResponseBodyApplicationCloudMonitorRule();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplicationCloudMonitorRule setEnableSubscribeEvent(Boolean enableSubscribeEvent) {
            this.enableSubscribeEvent = enableSubscribeEvent;
            return this;
        }
        public Boolean getEnableSubscribeEvent() {
            return this.enableSubscribeEvent;
        }

        public GetApplicationResponseBodyApplicationCloudMonitorRule setEnableInstallAgent(Boolean enableInstallAgent) {
            this.enableInstallAgent = enableInstallAgent;
            return this;
        }
        public Boolean getEnableInstallAgent() {
            return this.enableInstallAgent;
        }

        public GetApplicationResponseBodyApplicationCloudMonitorRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetApplicationResponseBodyApplicationCloudMonitorRule setContactGroupList(java.util.List<String> contactGroupList) {
            this.contactGroupList = contactGroupList;
            return this;
        }
        public java.util.List<String> getContactGroupList() {
            return this.contactGroupList;
        }

        public GetApplicationResponseBodyApplicationCloudMonitorRule setTemplateIdList(java.util.List<Integer> templateIdList) {
            this.templateIdList = templateIdList;
            return this;
        }
        public java.util.List<Integer> getTemplateIdList() {
            return this.templateIdList;
        }

    }

    public static class GetApplicationResponseBodyApplication extends TeaModel {
        @NameInMap("IsSystem")
        public String isSystem;

        @NameInMap("Description")
        public String description;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("CloudMonitorRule")
        public GetApplicationResponseBodyApplicationCloudMonitorRule cloudMonitorRule;

        public static GetApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplication self = new GetApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplication setIsSystem(String isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public String getIsSystem() {
            return this.isSystem;
        }

        public GetApplicationResponseBodyApplication setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyApplication setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetApplicationResponseBodyApplication setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetApplicationResponseBodyApplication setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetApplicationResponseBodyApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationResponseBodyApplication setCloudMonitorRule(GetApplicationResponseBodyApplicationCloudMonitorRule cloudMonitorRule) {
            this.cloudMonitorRule = cloudMonitorRule;
            return this;
        }
        public GetApplicationResponseBodyApplicationCloudMonitorRule getCloudMonitorRule() {
            return this.cloudMonitorRule;
        }

    }

}
