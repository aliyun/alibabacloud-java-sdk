// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of IPv6 Translation Service. This parameter is empty by default. It must be 2 to 100 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It cannot start with http:// or [https://](https://。).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the IPv6 Translation Service instance.</p>
     */
    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

    /**
     * <p>The name of the IPv6 Translation Service instance. The default name is the instance ID. It must be 2 to 100 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It cannot start with http:// or [https://](https://。).</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region of the IPv6 Translation Service instance. You can call the **DescribeRegions** operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyIPv6TranslatorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAttributeRequest self = new ModifyIPv6TranslatorAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyIPv6TranslatorAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyIPv6TranslatorAttributeRequest setIpv6TranslatorId(String ipv6TranslatorId) {
        this.ipv6TranslatorId = ipv6TranslatorId;
        return this;
    }
    public String getIpv6TranslatorId() {
        return this.ipv6TranslatorId;
    }

    public ModifyIPv6TranslatorAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyIPv6TranslatorAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyIPv6TranslatorAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyIPv6TranslatorAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyIPv6TranslatorAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyIPv6TranslatorAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
