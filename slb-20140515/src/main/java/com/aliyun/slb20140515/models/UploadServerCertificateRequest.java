// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadServerCertificateRequest extends TeaModel {
    /**
     * <p>AliCloud certificate ID.</p>
     */
    @NameInMap("AliCloudCertificateId")
    public String aliCloudCertificateId;

    /**
     * <p>AliCloud certificate name.</p>
     */
    @NameInMap("AliCloudCertificateName")
    public String aliCloudCertificateName;

    /**
     * <p>The region ID of AliCloud certificate.</p>
     */
    @NameInMap("AliCloudCertificateRegionId")
    public String aliCloudCertificateRegionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private key of the certificate.</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The region ID of the CLB instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/27584.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The server certificate to be uploaded.</p>
     */
    @NameInMap("ServerCertificate")
    public String serverCertificate;

    /**
     * <p>The name of the server certificate.</p>
     * <br>
     * <p>The name must be 1 to 80 characters in length. It must start with an English letter. It can contain letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("ServerCertificateName")
    public String serverCertificateName;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<UploadServerCertificateRequestTag> tag;

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

    public UploadServerCertificateRequest setTag(java.util.List<UploadServerCertificateRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UploadServerCertificateRequestTag> getTag() {
        return this.tag;
    }

    public static class UploadServerCertificateRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. Valid values of N: **1 to 20**. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length, and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: **1 to 20**. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` and `acs:`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UploadServerCertificateRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UploadServerCertificateRequestTag self = new UploadServerCertificateRequestTag();
            return TeaModel.build(map, self);
        }

        public UploadServerCertificateRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UploadServerCertificateRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
