// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("InstanceDescription")
    public String instanceDescription;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Network")
    public String network;

    @NameInMap("NetworkSourceACL")
    public java.util.List<String> networkSourceACL;

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
