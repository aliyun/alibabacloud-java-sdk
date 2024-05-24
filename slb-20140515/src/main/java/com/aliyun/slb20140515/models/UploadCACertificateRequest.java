// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadCACertificateRequest extends TeaModel {
    /**
     * <p>The name of this action.</p>
     * <br>
     * <p>Value: **UploadCACertificate**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CACertificate")
    public String CACertificate;

    /**
     * <p>The ID of the region to which the CA certificate belongs.</p>
     * <br>
     * <p>To query the region ID, call [DescribeRegions](https://help.aliyun.com/document_detail/27584.html).</p>
     */
    @NameInMap("CACertificateName")
    public String CACertificateName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region id.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The content of the CA certificate to be uploaded.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<UploadCACertificateRequestTag> tag;

    public static UploadCACertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCACertificateRequest self = new UploadCACertificateRequest();
        return TeaModel.build(map, self);
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

    public UploadCACertificateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UploadCACertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadCACertificateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadCACertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public UploadCACertificateRequest setTag(java.util.List<UploadCACertificateRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UploadCACertificateRequestTag> getTag() {
        return this.tag;
    }

    public static class UploadCACertificateRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can specify at most 20 tag keys.</p>
         * <br>
         * <p>The tag key cannot be an empty string. The tag key must be 1 to 64 characters in length and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: **1 to 20**. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. The tag value cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UploadCACertificateRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UploadCACertificateRequestTag self = new UploadCACertificateRequestTag();
            return TeaModel.build(map, self);
        }

        public UploadCACertificateRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UploadCACertificateRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
