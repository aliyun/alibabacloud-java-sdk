// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class TriggerPatrolRequest extends TeaModel {
    /**
     * <p>The inspection scope configuration.</p>
     */
    @NameInMap("scopeConfig")
    public TriggerPatrolRequestScopeConfig scopeConfig;

    /**
     * <p>The inspection scope type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("scopeType")
    public String scopeType;

    public static TriggerPatrolRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerPatrolRequest self = new TriggerPatrolRequest();
        return TeaModel.build(map, self);
    }

    public TriggerPatrolRequest setScopeConfig(TriggerPatrolRequestScopeConfig scopeConfig) {
        this.scopeConfig = scopeConfig;
        return this;
    }
    public TriggerPatrolRequestScopeConfig getScopeConfig() {
        return this.scopeConfig;
    }

    public TriggerPatrolRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public static class TriggerPatrolRequestScopeConfig extends TeaModel {
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

        public static TriggerPatrolRequestScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            TriggerPatrolRequestScopeConfig self = new TriggerPatrolRequestScopeConfig();
            return TeaModel.build(map, self);
        }

        public TriggerPatrolRequestScopeConfig setDeploymentIds(java.util.List<String> deploymentIds) {
            this.deploymentIds = deploymentIds;
            return this;
        }
        public java.util.List<String> getDeploymentIds() {
            return this.deploymentIds;
        }

        public TriggerPatrolRequestScopeConfig setTags(java.util.Map<String, java.util.List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getTags() {
            return this.tags;
        }

    }

}
