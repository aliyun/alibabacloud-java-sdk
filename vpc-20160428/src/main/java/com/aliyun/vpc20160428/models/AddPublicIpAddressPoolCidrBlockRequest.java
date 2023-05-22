// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddPublicIpAddressPoolCidrBlockRequest extends TeaModel {
    /**
     * <p>The region ID of the IP address pool to which you want to add the CIDR block.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("CidrMask")
    public Integer cidrMask;

    /**
     * <p>The subnet mask of the CIDR block.</p>
     * <br>
     * <p>After you enter the subnet mask, the system automatically allocates IP addresses.</p>
     * <br>
     * <p>Valid values: **24** to **30**.</p>
     * <br>
     * <p>>  You cannot set the **CidrBlock** and **CidrMask** parameters at the same time. Set one of them.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("PublicIpAddressPoolId")
    public String publicIpAddressPoolId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddPublicIpAddressPoolCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPublicIpAddressPoolCidrBlockRequest self = new AddPublicIpAddressPoolCidrBlockRequest();
        return TeaModel.build(map, self);
    }

    public AddPublicIpAddressPoolCidrBlockRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public AddPublicIpAddressPoolCidrBlockRequest setCidrMask(Integer cidrMask) {
        this.cidrMask = cidrMask;
        return this;
    }
    public Integer getCidrMask() {
        return this.cidrMask;
    }

    public AddPublicIpAddressPoolCidrBlockRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddPublicIpAddressPoolCidrBlockRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddPublicIpAddressPoolCidrBlockRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddPublicIpAddressPoolCidrBlockRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddPublicIpAddressPoolCidrBlockRequest setPublicIpAddressPoolId(String publicIpAddressPoolId) {
        this.publicIpAddressPoolId = publicIpAddressPoolId;
        return this;
    }
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }

    public AddPublicIpAddressPoolCidrBlockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddPublicIpAddressPoolCidrBlockRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddPublicIpAddressPoolCidrBlockRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
