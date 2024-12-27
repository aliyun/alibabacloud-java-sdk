// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpgradeAgentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("agent_id")
    public String agentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("agent_version")
    public String agentVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("instances")
    public java.util.List<UpgradeAgentRequestInstances> instances;

    public static UpgradeAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAgentRequest self = new UpgradeAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpgradeAgentRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public UpgradeAgentRequest setInstances(java.util.List<UpgradeAgentRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<UpgradeAgentRequestInstances> getInstances() {
        return this.instances;
    }

    public static class UpgradeAgentRequestInstances extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9b9vucz1iubsz8sjqo</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        public static UpgradeAgentRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            UpgradeAgentRequestInstances self = new UpgradeAgentRequestInstances();
            return TeaModel.build(map, self);
        }

        public UpgradeAgentRequestInstances setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public UpgradeAgentRequestInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
