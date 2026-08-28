// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdatePatrolConfigRequest extends TeaModel {
    /**
     * <p>The cron expression that defines the inspection scheduling time.</p>
     * 
     * <strong>example:</strong>
     * <p>0 2 * * *</p>
     */
    @NameInMap("cron")
    public String cron;

    /**
     * <p>Specifies whether to enable the inspection.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The inspection scope configuration.</p>
     */
    @NameInMap("scopeConfig")
    public UpdatePatrolConfigRequestScopeConfig scopeConfig;

    /**
     * <p>The inspection scope type.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("scopeType")
    public String scopeType;

    /**
     * <p>The time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timezone")
    public String timezone;

    public static UpdatePatrolConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePatrolConfigRequest self = new UpdatePatrolConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePatrolConfigRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public UpdatePatrolConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdatePatrolConfigRequest setScopeConfig(UpdatePatrolConfigRequestScopeConfig scopeConfig) {
        this.scopeConfig = scopeConfig;
        return this;
    }
    public UpdatePatrolConfigRequestScopeConfig getScopeConfig() {
        return this.scopeConfig;
    }

    public UpdatePatrolConfigRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public UpdatePatrolConfigRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public static class UpdatePatrolConfigRequestScopeConfig extends TeaModel {
        /**
         * <p>The list of deployment IDs. This parameter is valid only when scopeType is set to DEPLOYMENTS.</p>
         */
        @NameInMap("deploymentIds")
        public java.util.List<String> deploymentIds;

        /**
         * <p>The tag mapping. This parameter is valid only when scopeType is set to TAGS. The key is the tag name, and the value is a list of tag values.</p>
         */
        @NameInMap("tags")
        public java.util.Map<String, java.util.List<String>> tags;

        public static UpdatePatrolConfigRequestScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdatePatrolConfigRequestScopeConfig self = new UpdatePatrolConfigRequestScopeConfig();
            return TeaModel.build(map, self);
        }

        public UpdatePatrolConfigRequestScopeConfig setDeploymentIds(java.util.List<String> deploymentIds) {
            this.deploymentIds = deploymentIds;
            return this;
        }
        public java.util.List<String> getDeploymentIds() {
            return this.deploymentIds;
        }

        public UpdatePatrolConfigRequestScopeConfig setTags(java.util.Map<String, java.util.List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getTags() {
            return this.tags;
        }

    }

}
