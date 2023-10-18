// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6EgressOnlyRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the **client token**. The value of **RequestId** is different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the egress-only rule that you want to delete.</p>
     */
    @NameInMap("Ipv6EgressOnlyRuleId")
    public String ipv6EgressOnlyRuleId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the IPv6 gateway.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteIpv6EgressOnlyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6EgressOnlyRuleRequest self = new DeleteIpv6EgressOnlyRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpv6EgressOnlyRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteIpv6EgressOnlyRuleRequest setIpv6EgressOnlyRuleId(String ipv6EgressOnlyRuleId) {
        this.ipv6EgressOnlyRuleId = ipv6EgressOnlyRuleId;
        return this;
    }
    public String getIpv6EgressOnlyRuleId() {
        return this.ipv6EgressOnlyRuleId;
    }

    public DeleteIpv6EgressOnlyRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteIpv6EgressOnlyRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteIpv6EgressOnlyRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteIpv6EgressOnlyRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteIpv6EgressOnlyRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
