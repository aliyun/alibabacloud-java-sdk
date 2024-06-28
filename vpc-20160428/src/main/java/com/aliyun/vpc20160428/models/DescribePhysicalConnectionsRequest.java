// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The filter keys.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribePhysicalConnectionsRequestFilter> filter;

    /**
     * <p>Specifies whether to return the data about pending orders. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

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
     * <p>The number of entries per page. Default value: <strong>10</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Express Connect circuit belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2yvwibxrmrkq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribePhysicalConnectionsRequestTags> tags;

    public static DescribePhysicalConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsRequest self = new DescribePhysicalConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribePhysicalConnectionsRequest setFilter(java.util.List<DescribePhysicalConnectionsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribePhysicalConnectionsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribePhysicalConnectionsRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribePhysicalConnectionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePhysicalConnectionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhysicalConnectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePhysicalConnectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePhysicalConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePhysicalConnectionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribePhysicalConnectionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhysicalConnectionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePhysicalConnectionsRequest setTags(java.util.List<DescribePhysicalConnectionsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribePhysicalConnectionsRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribePhysicalConnectionsRequestFilter extends TeaModel {
        /**
         * <p>The key of the filter. Valid values:</p>
         * <ul>
         * <li><p><strong>PhysicalConnectionId</strong>: the ID of the Express Connect circuit.</p>
         * </li>
         * <li><p><strong>AccessPointId</strong>: the ID of the access point.</p>
         * </li>
         * <li><p><strong>Type</strong>: the type of resource to which the Express Connect circuit is connected. You can set Type only to <strong>VPC</strong>.</p>
         * </li>
         * <li><p><strong>LineOperator</strong>: the connectivity provider of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>CT</strong>: China Telecom.</li>
         * <li><strong>CU</strong>: China Unicom.</li>
         * <li><strong>CM</strong>: China Mobile.</li>
         * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland.</li>
         * <li><strong>Equinix</strong>: Equinix.</li>
         * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland.</li>
         * </ul>
         * </li>
         * <li><p><strong>Spec</strong>: the specification of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>1G and below</strong></li>
         * <li><strong>10G</strong></li>
         * <li><strong>40G</strong></li>
         * <li><strong>100G</strong></li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> By default, you cannot set the value to <strong>40G</strong> or <strong>100G</strong>. To use these values, you must first contact your account manager.</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>Status</strong>: the status of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>Initial</strong>: The application is under review.</li>
         * <li><strong>Approved</strong>: The application is approved.</li>
         * <li><strong>Allocating</strong>: The system is allocating resources.</li>
         * <li><strong>Allocated</strong>: The Express Connect circuit is under construction.</li>
         * <li><strong>Confirmed</strong>: The Express Connect circuit is pending for user confirmation.</li>
         * <li><strong>Enabled</strong>: The Express Connect circuit is enabled.</li>
         * <li><strong>Rejected</strong>: The application is rejected.</li>
         * <li><strong>Canceled</strong>: The application is canceled.</li>
         * <li><strong>Allocation Failed</strong>: The system failed to allocate resources.</li>
         * <li><strong>Terminating</strong>: The Express Connect circuit is being disabled.</li>
         * <li><strong>Terminated</strong>: The Express Connect circuit is disabled.</li>
         * </ul>
         * </li>
         * <li><p><strong>Name</strong>: the name of the Express Connect circuit.</p>
         * </li>
         * <li><p><strong>ProductType</strong>: the type of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>VirtualPhysicalConnection</strong>: shared Express Connect circuit</li>
         * <li><strong>PhysicalConnection</strong>: dedicated Express Connect circuit.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>You can specify at most five filter conditions in each request. The logical relation among the filter conditions is <strong>AND</strong>. Therefore, an Express Connect circuit is returned only when all specified filter conditions are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter values.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribePhysicalConnectionsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsRequestFilter self = new DescribePhysicalConnectionsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePhysicalConnectionsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribePhysicalConnectionsRequestTags extends TeaModel {
        /**
         * <p>The key of tag N to add to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>It can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>It can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePhysicalConnectionsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsRequestTags self = new DescribePhysicalConnectionsRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePhysicalConnectionsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
