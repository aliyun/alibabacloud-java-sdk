// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeCACertificatesRequest extends TeaModel {
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

    @NameInMap("CACertificateId")
    public String CACertificateId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<DescribeCACertificatesRequestTag> tag;

    public static DescribeCACertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificatesRequest self = new DescribeCACertificatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificatesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCACertificatesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCACertificatesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCACertificatesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCACertificatesRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public DescribeCACertificatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCACertificatesRequest setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
        return this;
    }
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    public DescribeCACertificatesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCACertificatesRequest setTag(java.util.List<DescribeCACertificatesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCACertificatesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeCACertificatesRequestTag extends TeaModel {
        public static DescribeCACertificatesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCACertificatesRequestTag self = new DescribeCACertificatesRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
