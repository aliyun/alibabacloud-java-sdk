// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The alias of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instance-test</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>the test instance</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The name of the instance whose information you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance-test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>(Deprecated) The network type of the instance. Valid values: NORMAL and VPC_CONSOLE. Default value: NORMAL.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The new sources of the network from which access is allowed. By default, all sources of networks are allowed. Valid value:</p>
     * <p>TRUST_PROXY: the console</p>
     */
    @NameInMap("NetworkSourceACL")
    public java.util.List<String> networkSourceACL;

    /**
     * <p>The new types of the network from which access is allowed. By default, all types of networks are allowed. Valid values:</p>
     * <ul>
     * <li>INTERNET: the Internet</li>
     * <li>VPC: VPCs</li>
     * <li>CLASSIC: the classic network</li>
     * </ul>
     */
    @NameInMap("NetworkTypeACL")
    public java.util.List<String> networkTypeACL;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdateInstanceRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public UpdateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateInstanceRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public UpdateInstanceRequest setNetworkSourceACL(java.util.List<String> networkSourceACL) {
        this.networkSourceACL = networkSourceACL;
        return this;
    }
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    public UpdateInstanceRequest setNetworkTypeACL(java.util.List<String> networkTypeACL) {
        this.networkTypeACL = networkTypeACL;
        return this;
    }
    public java.util.List<String> getNetworkTypeACL() {
        return this.networkTypeACL;
    }

}
