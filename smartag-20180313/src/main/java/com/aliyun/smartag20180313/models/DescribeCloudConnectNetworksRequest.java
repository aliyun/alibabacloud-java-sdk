// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeCloudConnectNetworksRequest extends TeaModel {
    /**
     * <p>The ID of the CCN.</p>
     * 
     * <strong>example:</strong>
     * <p>ccn-l9340rlu5enst*****</p>
     */
    @NameInMap("CcnId")
    public String ccnId;

    /**
     * <p>The name of the CCN.</p>
     * <p>The name must be 2 to 100 characters long, start with a letter or a Chinese character, and can contain digits, underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>ccnname</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>. Maximum value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the CCN is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags to filter CCN instances.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribeCloudConnectNetworks</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeCloudConnectNetworksRequestTag> tag;

    public static DescribeCloudConnectNetworksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudConnectNetworksRequest self = new DescribeCloudConnectNetworksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudConnectNetworksRequest setCcnId(String ccnId) {
        this.ccnId = ccnId;
        return this;
    }
    public String getCcnId() {
        return this.ccnId;
    }

    public DescribeCloudConnectNetworksRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public DescribeCloudConnectNetworksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudConnectNetworksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudConnectNetworksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeCloudConnectNetworksRequest setTag(java.util.List<DescribeCloudConnectNetworksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCloudConnectNetworksRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeCloudConnectNetworksRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
