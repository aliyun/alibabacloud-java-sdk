// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetCACertificateNameRequest extends TeaModel {
    /**
     * <p>The ID of the CA certificate.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CACertificateId")
    public String CACertificateId;

    /**
     * <p>The name of the CA certificate.</p>
     * <br>
     * <p>The name must be 1 to 80 characters in length and start with an English letter or a Chinese character. It can contain numbers, underscores (_), periods (.), and hyphens (-).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CACertificateName")
    public String CACertificateName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region to which the CA certificate belongs.</p>
     * <br>
     * <p>To query the region ID, call [DescribeRegions](https://help.aliyun.com/document_detail/27584.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SetCACertificateNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCACertificateNameRequest self = new SetCACertificateNameRequest();
        return TeaModel.build(map, self);
    }

    public SetCACertificateNameRequest setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
        return this;
    }
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    public SetCACertificateNameRequest setCACertificateName(String CACertificateName) {
        this.CACertificateName = CACertificateName;
        return this;
    }
    public String getCACertificateName() {
        return this.CACertificateName;
    }

    public SetCACertificateNameRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetCACertificateNameRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCACertificateNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetCACertificateNameRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetCACertificateNameRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
