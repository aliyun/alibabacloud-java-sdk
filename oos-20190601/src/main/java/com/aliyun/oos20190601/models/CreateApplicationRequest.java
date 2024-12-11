// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The configurations of application alerts.</p>
     */
    @NameInMap("AlarmConfig")
    public CreateApplicationRequestAlarmConfig alarmConfig;

    @NameInMap("ApplicationSource")
    public String applicationSource;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>TF-CreateApplication-1647587475-84104b89-eba5-47a8-b2fd-807b8b7d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyApplication</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID. Set the value to cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>service-79538e30e44541b699d8</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAlarmConfig(CreateApplicationRequestAlarmConfig alarmConfig) {
        this.alarmConfig = alarmConfig;
        return this;
    }
    public CreateApplicationRequestAlarmConfig getAlarmConfig() {
        return this.alarmConfig;
    }

    public CreateApplicationRequest setApplicationSource(String applicationSource) {
        this.applicationSource = applicationSource;
        return this;
    }
    public String getApplicationSource() {
        return this.applicationSource;
    }

    public CreateApplicationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateApplicationRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateApplicationRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static class CreateApplicationRequestAlarmConfig extends TeaModel {
        /**
         * <p>The alert contact groups.</p>
         */
        @NameInMap("ContactGroups")
        public java.util.List<String> contactGroups;

        /**
         * <p>The health check URL of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthcheck/tcp50122</p>
         */
        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        /**
         * <p>The alert templates.</p>
         */
        @NameInMap("TemplateIds")
        public java.util.List<String> templateIds;

        public static CreateApplicationRequestAlarmConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestAlarmConfig self = new CreateApplicationRequestAlarmConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestAlarmConfig setContactGroups(java.util.List<String> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public java.util.List<String> getContactGroups() {
            return this.contactGroups;
        }

        public CreateApplicationRequestAlarmConfig setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public CreateApplicationRequestAlarmConfig setTemplateIds(java.util.List<String> templateIds) {
            this.templateIds = templateIds;
            return this;
        }
        public java.util.List<String> getTemplateIds() {
            return this.templateIds;
        }

    }

}
