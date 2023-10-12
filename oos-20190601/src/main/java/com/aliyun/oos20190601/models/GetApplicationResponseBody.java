// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("Application")
    public GetApplicationResponseBodyApplication application;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setApplication(GetApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public GetApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationResponseBodyApplicationAlarmConfig extends TeaModel {
        @NameInMap("ContactGroups")
        public java.util.List<String> contactGroups;

        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        @NameInMap("TemplateIds")
        public java.util.List<String> templateIds;

        public static GetApplicationResponseBodyApplicationAlarmConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplicationAlarmConfig self = new GetApplicationResponseBodyApplicationAlarmConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplicationAlarmConfig setContactGroups(java.util.List<String> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public java.util.List<String> getContactGroups() {
            return this.contactGroups;
        }

        public GetApplicationResponseBodyApplicationAlarmConfig setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public GetApplicationResponseBodyApplicationAlarmConfig setTemplateIds(java.util.List<String> templateIds) {
            this.templateIds = templateIds;
            return this;
        }
        public java.util.List<String> getTemplateIds() {
            return this.templateIds;
        }

    }

    public static class GetApplicationResponseBodyApplication extends TeaModel {
        @NameInMap("AlarmConfig")
        public GetApplicationResponseBodyApplicationAlarmConfig alarmConfig;

        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>The time when the application was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The application name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The time when the application was updated.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplication self = new GetApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplication setAlarmConfig(GetApplicationResponseBodyApplicationAlarmConfig alarmConfig) {
            this.alarmConfig = alarmConfig;
            return this;
        }
        public GetApplicationResponseBodyApplicationAlarmConfig getAlarmConfig() {
            return this.alarmConfig;
        }

        public GetApplicationResponseBodyApplication setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public GetApplicationResponseBodyApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetApplicationResponseBodyApplication setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationResponseBodyApplication setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetApplicationResponseBodyApplication setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetApplicationResponseBodyApplication setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetApplicationResponseBodyApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
