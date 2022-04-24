// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class RejectVpcPeerConnectionRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static RejectVpcPeerConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectVpcPeerConnectionRequest self = new RejectVpcPeerConnectionRequest();
        return TeaModel.build(map, self);
    }

    public RejectVpcPeerConnectionRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public RejectVpcPeerConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RejectVpcPeerConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RejectVpcPeerConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RejectVpcPeerConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
