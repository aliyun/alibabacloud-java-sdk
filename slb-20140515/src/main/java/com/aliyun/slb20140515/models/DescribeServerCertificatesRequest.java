// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeServerCertificatesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("access_key_id")
    public String accessKeyId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<DescribeServerCertificatesRequestTag> tag;

    public static DescribeServerCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerCertificatesRequest self = new DescribeServerCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServerCertificatesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeServerCertificatesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeServerCertificatesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeServerCertificatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeServerCertificatesRequest setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public DescribeServerCertificatesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeServerCertificatesRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public DescribeServerCertificatesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DescribeServerCertificatesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeServerCertificatesRequest setTag(java.util.List<DescribeServerCertificatesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeServerCertificatesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeServerCertificatesRequestTag extends TeaModel {
        public static DescribeServerCertificatesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerCertificatesRequestTag self = new DescribeServerCertificatesRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
