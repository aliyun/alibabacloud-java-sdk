// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatIpAttributeRequest extends TeaModel {
    /**
     * <p>Client Token, used to ensure the idempotence of requests. Generate a unique value for this parameter from your client, ensuring that it is unique across different requests. ClientToken only supports ASCII characters. If not specified, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong> identifier. The <strong>RequestId</strong> may differ for each API request.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Indicates whether to perform a dry run of the request. Values:</p>
     * <ul>
     * <li><strong>true</strong>: Sends a check request without querying NAT IP address information. The checks include whether the AccessKey is valid, the RAM user\&quot;s authorization status, and if all required parameters are filled out. If any check fails, the corresponding error is returned. If all checks pass, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): Sends a normal request. After passing the checks, it returns an HTTP 2xx status code and queries the NAT IP address information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the NAT IP address instance to be queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcnatip-gw8y7q3cpk3fggs87****</p>
     */
    @NameInMap("NatIpId")
    public String natIpId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the NAT gateway instance to which the NAT IP address to be queried belongs. You can obtain the region ID by calling the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eu-central-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetNatIpAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNatIpAttributeRequest self = new GetNatIpAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetNatIpAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetNatIpAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public GetNatIpAttributeRequest setNatIpId(String natIpId) {
        this.natIpId = natIpId;
        return this;
    }
    public String getNatIpId() {
        return this.natIpId;
    }

    public GetNatIpAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetNatIpAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetNatIpAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetNatIpAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetNatIpAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
