// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class GetVpcPeerConnectionAttributeRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestContent")
    public String requestContent;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static GetVpcPeerConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVpcPeerConnectionAttributeRequest self = new GetVpcPeerConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetVpcPeerConnectionAttributeRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetVpcPeerConnectionAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetVpcPeerConnectionAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public GetVpcPeerConnectionAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetVpcPeerConnectionAttributeRequest setRequestContent(String requestContent) {
        this.requestContent = requestContent;
        return this;
    }
    public String getRequestContent() {
        return this.requestContent;
    }

    public GetVpcPeerConnectionAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
