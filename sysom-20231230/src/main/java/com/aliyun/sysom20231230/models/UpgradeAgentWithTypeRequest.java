// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpgradeAgentWithTypeRequest extends TeaModel {
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
    public java.util.List<UpgradeAgentWithTypeRequestInstances> instances;

    public static UpgradeAgentWithTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAgentWithTypeRequest self = new UpgradeAgentWithTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeAgentWithTypeRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpgradeAgentWithTypeRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public UpgradeAgentWithTypeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpgradeAgentWithTypeRequest setInstances(java.util.List<UpgradeAgentWithTypeRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<UpgradeAgentWithTypeRequestInstances> getInstances() {
        return this.instances;
    }

    public static class UpgradeAgentWithTypeRequestInstances extends TeaModel {
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

        public static UpgradeAgentWithTypeRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            UpgradeAgentWithTypeRequestInstances self = new UpgradeAgentWithTypeRequestInstances();
            return TeaModel.build(map, self);
        }

        public UpgradeAgentWithTypeRequestInstances setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public UpgradeAgentWithTypeRequestInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
