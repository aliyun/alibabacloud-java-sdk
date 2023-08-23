// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeServerCertificatesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region where the CLB instances are deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~27584~~) operation to query the most recent region list.</p>
     * <br>
     * <p>>  If the endpoint of the region is slb.aliyuncs.com, you must specify the `RegionId` parameter.</p>
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
     * <p>The ID of the server certificate.</p>
     */
    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    @NameInMap("Tag")
    public java.util.List<DescribeServerCertificatesRequestTag> tag;

    public static DescribeServerCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerCertificatesRequest self = new DescribeServerCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServerCertificatesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeServerCertificatesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeServerCertificatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeServerCertificatesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public DescribeServerCertificatesRequest setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public DescribeServerCertificatesRequest setTag(java.util.List<DescribeServerCertificatesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeServerCertificatesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeServerCertificatesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeServerCertificatesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerCertificatesRequestTag self = new DescribeServerCertificatesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeServerCertificatesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeServerCertificatesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
