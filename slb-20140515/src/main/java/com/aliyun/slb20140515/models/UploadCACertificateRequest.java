// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadCACertificateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("access_key_id")
    public String accessKeyId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("CACertificate")
    public String CACertificate;

    @NameInMap("CACertificateName")
    public String CACertificateName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StandardType")
    public String standardType;

    public static UploadCACertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCACertificateRequest self = new UploadCACertificateRequest();
        return TeaModel.build(map, self);
    }

    public UploadCACertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadCACertificateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UploadCACertificateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UploadCACertificateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UploadCACertificateRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public UploadCACertificateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadCACertificateRequest setCACertificate(String CACertificate) {
        this.CACertificate = CACertificate;
        return this;
    }
    public String getCACertificate() {
        return this.CACertificate;
    }

    public UploadCACertificateRequest setCACertificateName(String CACertificateName) {
        this.CACertificateName = CACertificateName;
        return this;
    }
    public String getCACertificateName() {
        return this.CACertificateName;
    }

    public UploadCACertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UploadCACertificateRequest setStandardType(String standardType) {
        this.standardType = standardType;
        return this;
    }
    public String getStandardType() {
        return this.standardType;
    }

}
