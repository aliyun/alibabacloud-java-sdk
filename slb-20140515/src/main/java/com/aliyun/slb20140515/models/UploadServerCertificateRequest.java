// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadServerCertificateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AliCloudCertificateId")
    public String aliCloudCertificateId;

    @NameInMap("AliCloudCertificateName")
    public String aliCloudCertificateName;

    @NameInMap("AliCloudCertificateRegionId")
    public String aliCloudCertificateRegionId;

    @NameInMap("ServerCertificate")
    public String serverCertificate;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("ServerCertificateName")
    public String serverCertificateName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static UploadServerCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadServerCertificateRequest self = new UploadServerCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UploadServerCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadServerCertificateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UploadServerCertificateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UploadServerCertificateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadServerCertificateRequest setAliCloudCertificateId(String aliCloudCertificateId) {
        this.aliCloudCertificateId = aliCloudCertificateId;
        return this;
    }
    public String getAliCloudCertificateId() {
        return this.aliCloudCertificateId;
    }

    public UploadServerCertificateRequest setAliCloudCertificateName(String aliCloudCertificateName) {
        this.aliCloudCertificateName = aliCloudCertificateName;
        return this;
    }
    public String getAliCloudCertificateName() {
        return this.aliCloudCertificateName;
    }

    public UploadServerCertificateRequest setAliCloudCertificateRegionId(String aliCloudCertificateRegionId) {
        this.aliCloudCertificateRegionId = aliCloudCertificateRegionId;
        return this;
    }
    public String getAliCloudCertificateRegionId() {
        return this.aliCloudCertificateRegionId;
    }

    public UploadServerCertificateRequest setServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    public UploadServerCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public UploadServerCertificateRequest setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
        return this;
    }
    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    public UploadServerCertificateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UploadServerCertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
