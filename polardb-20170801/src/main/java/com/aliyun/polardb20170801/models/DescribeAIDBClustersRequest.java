// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClustersRequest extends TeaModel {
    /**
     * <p>The node type. You can specify multiple types separated by commas (,). Valid values:</p>
     * <ul>
     * <li>vnode: managed by Kubernetes.</li>
     * <li>container: logon-enabled container.</li>
     * <li>maas: model service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vnode,container</p>
     */
    @NameInMap("AiNodeType")
    public String aiNodeType;

    /**
     * <p>The description of the cluster. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The cluster IDs. Separate multiple cluster IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***************</p>
     */
    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    /**
     * <p>The status of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: The cluster is being created.</li>
     * <li><strong>Running</strong>: The cluster is running.</li>
     * <li><strong>Deleting</strong>: The cluster is being released.</li>
     * <li><strong>Rebooting</strong>: The cluster is being restarted.</li>
     * <li><strong>DBNodeCreating</strong>: Nodes are being increased.</li>
     * <li><strong>DBNodeDeleting</strong>: Nodes are being deleted.</li>
     * <li><strong>ClassChanging</strong>: The node specifications are being changed.</li>
     * <li><strong>NetAddressCreating</strong>: The network connectivity is being created.</li>
     * <li><strong>NetAddressDeleting</strong>: The network connectivity is being deleted.</li>
     * <li><strong>NetAddressModifying</strong>: The network connectivity is being modified. </li>
     * <li><strong>Deleted</strong>: The cluster is released.</li>
     * <li><strong>ClassChanged</strong>: Resources are being revoked after you upgrade or decrease the quota.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method. Valid values: </p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeAIDBClustersRequestTag> tag;

    public static DescribeAIDBClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClustersRequest self = new DescribeAIDBClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClustersRequest setAiNodeType(String aiNodeType) {
        this.aiNodeType = aiNodeType;
        return this;
    }
    public String getAiNodeType() {
        return this.aiNodeType;
    }

    public DescribeAIDBClustersRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeAIDBClustersRequest setDBClusterIds(String DBClusterIds) {
        this.DBClusterIds = DBClusterIds;
        return this;
    }
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    public DescribeAIDBClustersRequest setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeAIDBClustersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAIDBClustersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAIDBClustersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAIDBClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAIDBClustersRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeAIDBClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAIDBClustersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAIDBClustersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAIDBClustersRequest setTag(java.util.List<DescribeAIDBClustersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeAIDBClustersRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeAIDBClustersRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can filter clusters by tag. You can specify up to 20 tag key-value pairs. The number n in each tag pair must be unique and must be a consecutive integer starting from 1. The value of Tag.n.Key is Tag.n.Value.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that corresponds to the tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testValueData</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAIDBClustersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClustersRequestTag self = new DescribeAIDBClustersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClustersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAIDBClustersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
