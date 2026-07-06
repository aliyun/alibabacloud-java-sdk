// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallAgentWithTypeRequest extends TeaModel {
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
     * <p>ecs</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("instances")
    public java.util.List<UninstallAgentWithTypeRequestInstances> instances;

    public static UninstallAgentWithTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallAgentWithTypeRequest self = new UninstallAgentWithTypeRequest();
        return TeaModel.build(map, self);
    }

    public UninstallAgentWithTypeRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UninstallAgentWithTypeRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public UninstallAgentWithTypeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UninstallAgentWithTypeRequest setInstances(java.util.List<UninstallAgentWithTypeRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<UninstallAgentWithTypeRequestInstances> getInstances() {
        return this.instances;
    }

    public static class UninstallAgentWithTypeRequestInstances extends TeaModel {
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

        public static UninstallAgentWithTypeRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            UninstallAgentWithTypeRequestInstances self = new UninstallAgentWithTypeRequestInstances();
            return TeaModel.build(map, self);
        }

        public UninstallAgentWithTypeRequestInstances setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public UninstallAgentWithTypeRequestInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
