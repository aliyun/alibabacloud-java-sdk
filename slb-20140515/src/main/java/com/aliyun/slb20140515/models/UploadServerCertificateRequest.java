// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadServerCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the server certificate that is provided by Alibaba Cloud Certificate Management Service.</p>
     * <br>
     * <p>>  This parameter is required if you use a server certificate from Alibaba Cloud Certificate Management Service.</p>
     */
    @NameInMap("AliCloudCertificateId")
    public String aliCloudCertificateId;

    /**
     * <p>The name of the server certificate that is provided by Alibaba Cloud Certificate Management Service.</p>
     * <br>
     * <p>>  This parameter is required if you use a server certificate from Alibaba Cloud Certificate Management Service.</p>
     */
    @NameInMap("AliCloudCertificateName")
    public String aliCloudCertificateName;

    /**
     * <p>The ID of the region where the server certificate from Alibaba Cloud Certificate Management Service is created.</p>
     */
    @NameInMap("AliCloudCertificateRegionId")
    public String aliCloudCertificateRegionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private key that you want to upload.</p>
     * <br>
     * <p>>  This parameter is required if you use a server certificate from a third-party service provider.</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The ID of the region where the server certificate is created.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~27584~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The public key certificate that you want to upload.</p>
     * <br>
     * <p>>  This parameter is required if you use a server certificate from a third-party service provider.</p>
     */
    @NameInMap("ServerCertificate")
    public String serverCertificate;

    /**
     * <p>The name of the server certificate that you want to upload. The name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("ServerCertificateName")
    public String serverCertificateName;

    public static UploadServerCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadServerCertificateRequest self = new UploadServerCertificateRequest();
        return TeaModel.build(map, self);
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

    public UploadServerCertificateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UploadServerCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadServerCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public UploadServerCertificateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadServerCertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public UploadServerCertificateRequest setServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    public UploadServerCertificateRequest setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
        return this;
    }
    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

}
