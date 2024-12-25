// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class UploadCACertificateRequest extends TeaModel {
    /**
     * <p>The information about the CA certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CACertificate")
    public String CACertificate;

    /**
     * <p>The CA certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>mycacert01</p>
     */
    @NameInMap("CACertificateName")
    public String CACertificateName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region of the CA certificates.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401682.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rto*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>UploadCACertificate</p>
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
         * <p>The key of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string. The tag key can be up to 128 characters in length, and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: <strong>1 to 20</strong>. The tag value can be an empty string. The tag value must be 1 to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
