// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateAgentStorageRequest extends TeaModel {
    /**
     * <p>agent storage description</p>
     * 
     * <strong>example:</strong>
     * <p>description for agent storage</p>
     */
    @NameInMap("AgentStorageDescription")
    public String agentStorageDescription;

    /**
     * <p>agent storage name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-test</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    /**
     * <p>The alias of the agent storage.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-test</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>(Deprecated) The network type of the agent storage. Valid values: NORMAL and VPC_CONSOLE. Default value: NORMAL.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The list of network sources allowed for the agent storage. All sources are allowed by default. Valid values:</p>
     * <ul>
     * <li>TRUST_PROXY: console.</li>
     * </ul>
     */
    @NameInMap("NetworkSourceACL")
    public java.util.List<String> networkSourceACL;

    /**
     * <p>The list of network types allowed for the agent storage. All types are allowed by default. Valid values:</p>
     * <ul>
     * <li>CLASSIC: classic network.</li>
     * <li>INTERNET: public network.</li>
     * <li>VPC: VPC network.</li>
     * </ul>
     */
    @NameInMap("NetworkTypeACL")
    public java.util.List<String> networkTypeACL;

    public static UpdateAgentStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentStorageRequest self = new UpdateAgentStorageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentStorageRequest setAgentStorageDescription(String agentStorageDescription) {
        this.agentStorageDescription = agentStorageDescription;
        return this;
    }
    public String getAgentStorageDescription() {
        return this.agentStorageDescription;
    }

    public UpdateAgentStorageRequest setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public UpdateAgentStorageRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdateAgentStorageRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public UpdateAgentStorageRequest setNetworkSourceACL(java.util.List<String> networkSourceACL) {
        this.networkSourceACL = networkSourceACL;
        return this;
    }
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    public UpdateAgentStorageRequest setNetworkTypeACL(java.util.List<String> networkTypeACL) {
        this.networkTypeACL = networkTypeACL;
        return this;
    }
    public java.util.List<String> getNetworkTypeACL() {
        return this.networkTypeACL;
    }

}
