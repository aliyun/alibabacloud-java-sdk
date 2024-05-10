// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatIpAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request.</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the name and description of the NAT IP address are modified.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The description of the NAT IP address that you want to modify.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length and start with a letter. The description cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("NatIpDescription")
    public String natIpDescription;

    /**
     * <p>The ID of the NAT IP address that you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatIpId")
    public String natIpId;

    /**
     * <p>The name of the NAT IP address that you want to modify.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. The name must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("NatIpName")
    public String natIpName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the NAT gateway to which the NAT IP address that you want to modify belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyNatIpAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatIpAttributeRequest self = new ModifyNatIpAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNatIpAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyNatIpAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyNatIpAttributeRequest setNatIpDescription(String natIpDescription) {
        this.natIpDescription = natIpDescription;
        return this;
    }
    public String getNatIpDescription() {
        return this.natIpDescription;
    }

    public ModifyNatIpAttributeRequest setNatIpId(String natIpId) {
        this.natIpId = natIpId;
        return this;
    }
    public String getNatIpId() {
        return this.natIpId;
    }

    public ModifyNatIpAttributeRequest setNatIpName(String natIpName) {
        this.natIpName = natIpName;
        return this;
    }
    public String getNatIpName() {
        return this.natIpName;
    }

    public ModifyNatIpAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyNatIpAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNatIpAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNatIpAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNatIpAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
