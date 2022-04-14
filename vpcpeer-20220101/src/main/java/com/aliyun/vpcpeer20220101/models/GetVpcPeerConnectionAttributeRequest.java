// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class GetVpcPeerConnectionAttributeRequest extends TeaModel {
    @NameInMap("CallerBidLoginEmail")
    public String callerBidLoginEmail;

    @NameInMap("CallerUidLoginEmail")
    public String callerUidLoginEmail;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerIdLoginEmail")
    public String ownerIdLoginEmail;

    @NameInMap("RequestContent")
    public String requestContent;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static GetVpcPeerConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVpcPeerConnectionAttributeRequest self = new GetVpcPeerConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetVpcPeerConnectionAttributeRequest setCallerBidLoginEmail(String callerBidLoginEmail) {
        this.callerBidLoginEmail = callerBidLoginEmail;
        return this;
    }
    public String getCallerBidLoginEmail() {
        return this.callerBidLoginEmail;
    }

    public GetVpcPeerConnectionAttributeRequest setCallerUidLoginEmail(String callerUidLoginEmail) {
        this.callerUidLoginEmail = callerUidLoginEmail;
        return this;
    }
    public String getCallerUidLoginEmail() {
        return this.callerUidLoginEmail;
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

    public GetVpcPeerConnectionAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetVpcPeerConnectionAttributeRequest setOwnerIdLoginEmail(String ownerIdLoginEmail) {
        this.ownerIdLoginEmail = ownerIdLoginEmail;
        return this;
    }
    public String getOwnerIdLoginEmail() {
        return this.ownerIdLoginEmail;
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
