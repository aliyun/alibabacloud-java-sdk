// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListSystemSecurityPolicyRequest extends TeaModel {
    @NameInMap("CallerBidLoginEmail")
    public String callerBidLoginEmail;

    @NameInMap("CallerUidLoginEmail")
    public String callerUidLoginEmail;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerIdLoginEmail")
    public String ownerIdLoginEmail;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestContent")
    public String requestContent;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static ListSystemSecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemSecurityPolicyRequest self = new ListSystemSecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemSecurityPolicyRequest setCallerBidLoginEmail(String callerBidLoginEmail) {
        this.callerBidLoginEmail = callerBidLoginEmail;
        return this;
    }
    public String getCallerBidLoginEmail() {
        return this.callerBidLoginEmail;
    }

    public ListSystemSecurityPolicyRequest setCallerUidLoginEmail(String callerUidLoginEmail) {
        this.callerUidLoginEmail = callerUidLoginEmail;
        return this;
    }
    public String getCallerUidLoginEmail() {
        return this.callerUidLoginEmail;
    }

    public ListSystemSecurityPolicyRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ListSystemSecurityPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListSystemSecurityPolicyRequest setOwnerIdLoginEmail(String ownerIdLoginEmail) {
        this.ownerIdLoginEmail = ownerIdLoginEmail;
        return this;
    }
    public String getOwnerIdLoginEmail() {
        return this.ownerIdLoginEmail;
    }

    public ListSystemSecurityPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSystemSecurityPolicyRequest setRequestContent(String requestContent) {
        this.requestContent = requestContent;
        return this;
    }
    public String getRequestContent() {
        return this.requestContent;
    }

    public ListSystemSecurityPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
