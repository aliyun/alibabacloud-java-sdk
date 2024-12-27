// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallAgentRequest extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>InstallAndUpgrade</p>
     */
    @NameInMap("install_type")
    public String installType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("instances")
    public java.util.List<InstallAgentRequestInstances> instances;

    public static InstallAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentRequest self = new InstallAgentRequest();
        return TeaModel.build(map, self);
    }

    public InstallAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public InstallAgentRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public InstallAgentRequest setInstallType(String installType) {
        this.installType = installType;
        return this;
    }
    public String getInstallType() {
        return this.installType;
    }

    public InstallAgentRequest setInstances(java.util.List<InstallAgentRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<InstallAgentRequestInstances> getInstances() {
        return this.instances;
    }

    public static class InstallAgentRequestInstances extends TeaModel {
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

        public static InstallAgentRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            InstallAgentRequestInstances self = new InstallAgentRequestInstances();
            return TeaModel.build(map, self);
        }

        public InstallAgentRequestInstances setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public InstallAgentRequestInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
