// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationRequest extends TeaModel {
    /**
     * <p>The configurations of application alerts.</p>
     */
    @NameInMap("AlarmConfig")
    public UpdateApplicationRequestAlarmConfig alarmConfig;

    /**
     * <p>Specifies whether to delete existing alert rules before applying the alert template. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteAlarmRulesBeforeUpdate")
    public Boolean deleteAlarmRulesBeforeUpdate;

    /**
     * <p>The description to be updated for the application.</p>
     * 
     * <strong>example:</strong>
     * <p>test application</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My-Application</p>
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
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    public static UpdateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationRequest self = new UpdateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationRequest setAlarmConfig(UpdateApplicationRequestAlarmConfig alarmConfig) {
        this.alarmConfig = alarmConfig;
        return this;
    }
    public UpdateApplicationRequestAlarmConfig getAlarmConfig() {
        return this.alarmConfig;
    }

    public UpdateApplicationRequest setDeleteAlarmRulesBeforeUpdate(Boolean deleteAlarmRulesBeforeUpdate) {
        this.deleteAlarmRulesBeforeUpdate = deleteAlarmRulesBeforeUpdate;
        return this;
    }
    public Boolean getDeleteAlarmRulesBeforeUpdate() {
        return this.deleteAlarmRulesBeforeUpdate;
    }

    public UpdateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateApplicationRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static class UpdateApplicationRequestAlarmConfig extends TeaModel {
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

        public static UpdateApplicationRequestAlarmConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationRequestAlarmConfig self = new UpdateApplicationRequestAlarmConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationRequestAlarmConfig setContactGroups(java.util.List<String> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public java.util.List<String> getContactGroups() {
            return this.contactGroups;
        }

        public UpdateApplicationRequestAlarmConfig setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public UpdateApplicationRequestAlarmConfig setTemplateIds(java.util.List<String> templateIds) {
            this.templateIds = templateIds;
            return this;
        }
        public java.util.List<String> getTemplateIds() {
            return this.templateIds;
        }

    }

}
