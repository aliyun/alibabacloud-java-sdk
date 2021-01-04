// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeCloudConnectNetworksRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("CcnId")
    public String ccnId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Tag")
    public java.util.List<DescribeCloudConnectNetworksRequestTag> tag;

    public static DescribeCloudConnectNetworksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudConnectNetworksRequest self = new DescribeCloudConnectNetworksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudConnectNetworksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCloudConnectNetworksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCloudConnectNetworksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCloudConnectNetworksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCloudConnectNetworksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudConnectNetworksRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCloudConnectNetworksRequest setCcnId(String ccnId) {
        this.ccnId = ccnId;
        return this;
    }
    public String getCcnId() {
        return this.ccnId;
    }

    public DescribeCloudConnectNetworksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudConnectNetworksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudConnectNetworksRequest setTag(java.util.List<DescribeCloudConnectNetworksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCloudConnectNetworksRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeCloudConnectNetworksRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeCloudConnectNetworksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudConnectNetworksRequestTag self = new DescribeCloudConnectNetworksRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeCloudConnectNetworksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCloudConnectNetworksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
