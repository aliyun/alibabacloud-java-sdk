// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallAgentRequest extends TeaModel {
    /**
     * <p>ID of the widget to uninstall</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("agent_id")
    public String agentId;

    /**
     * <p>Version of the widget to uninstall</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3.4.0-1</p>
     */
    @NameInMap("agent_version")
    public String agentVersion;

    /**
     * <p>List of instances from which to uninstall the widget</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("instances")
    public java.util.List<UninstallAgentRequestInstances> instances;

    public static UninstallAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallAgentRequest self = new UninstallAgentRequest();
        return TeaModel.build(map, self);
    }

    public UninstallAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UninstallAgentRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public UninstallAgentRequest setInstances(java.util.List<UninstallAgentRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<UninstallAgentRequestInstances> getInstances() {
        return this.instances;
    }

    public static class UninstallAgentRequestInstances extends TeaModel {
        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9b9vucz1iubsz8sjqo</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>Region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        public static UninstallAgentRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            UninstallAgentRequestInstances self = new UninstallAgentRequestInstances();
            return TeaModel.build(map, self);
        }

        public UninstallAgentRequestInstances setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public UninstallAgentRequestInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
