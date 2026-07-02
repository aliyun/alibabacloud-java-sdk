// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallAgentWithTypeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3.4.0-1</p>
     */
    @NameInMap("agentVersion")
    public String agentVersion;

    /**
     * <strong>example:</strong>
     * <p>f0078fbb-4213-11f0-a19b-00163e4ae208</p>
     */
    @NameInMap("configId")
    public String configId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("instances")
    public java.util.List<InstallAgentWithTypeRequestInstances> instances;

    public static InstallAgentWithTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentWithTypeRequest self = new InstallAgentWithTypeRequest();
        return TeaModel.build(map, self);
    }

    public InstallAgentWithTypeRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public InstallAgentWithTypeRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public InstallAgentWithTypeRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public InstallAgentWithTypeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public InstallAgentWithTypeRequest setInstances(java.util.List<InstallAgentWithTypeRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<InstallAgentWithTypeRequestInstances> getInstances() {
        return this.instances;
    }

    public static class InstallAgentWithTypeRequestInstances extends TeaModel {
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

        public static InstallAgentWithTypeRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            InstallAgentWithTypeRequestInstances self = new InstallAgentWithTypeRequestInstances();
            return TeaModel.build(map, self);
        }

        public InstallAgentWithTypeRequestInstances setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public InstallAgentWithTypeRequestInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
