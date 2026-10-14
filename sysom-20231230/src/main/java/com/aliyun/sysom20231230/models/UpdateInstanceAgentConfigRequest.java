// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateInstanceAgentConfigRequest extends TeaModel {
    /**
     * <p>The ID of the component whose configuration is to be updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The ID of the component configuration to be applied to the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f0078fbb-4213-11f0-a19b-00163e4ae208</p>
     */
    @NameInMap("configId")
    public String configId;

    /**
     * <p>The instance information.</p>
     */
    @NameInMap("instances")
    public java.util.List<UpdateInstanceAgentConfigRequestInstances> instances;

    public static UpdateInstanceAgentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAgentConfigRequest self = new UpdateInstanceAgentConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAgentConfigRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdateInstanceAgentConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public UpdateInstanceAgentConfigRequest setInstances(java.util.List<UpdateInstanceAgentConfigRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<UpdateInstanceAgentConfigRequestInstances> getInstances() {
        return this.instances;
    }

    public static class UpdateInstanceAgentConfigRequestInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9b9vucz1iubsz8sjqo</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        public static UpdateInstanceAgentConfigRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceAgentConfigRequestInstances self = new UpdateInstanceAgentConfigRequestInstances();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceAgentConfigRequestInstances setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public UpdateInstanceAgentConfigRequestInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
