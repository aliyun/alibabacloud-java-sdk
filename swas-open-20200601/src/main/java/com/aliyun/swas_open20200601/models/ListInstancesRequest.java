// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The billing method of the simple application servers. Set the value to PrePaid, which indicates the subscription billing method.</p>
     * <p>Default value: PrePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The IDs of the simple application servers. The value can be a JSON array that consists of up to 100 simple application server IDs. Separate multiple server IDs with commas (,).</p>
     * <blockquote>
     * <p>If you specify both <code>InstanceIds</code> and <code>PublicIpAddresses</code>, make sure that the specified IDs and the specified public IP addresses belong to the same simple application servers. Otherwise, an empty result is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;2ad1ae67295445f598017499dc****&quot;, &quot;2ad1ae67295445f598017123dc****&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The name of the simple application server. Fuzzy search with the asterisk (\*) wildcard is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The page number.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlanType")
    public String planType;

    /**
     * <p>The public IP addresses of the simple application servers. The value can be a JSON array that consists of up to 100 IP addresses. Separate multiple IP addresses with commas (,).</p>
     * <blockquote>
     * <p>If you specify both <code>InstanceIds</code> and <code>PublicIpAddresses</code>, make sure that the specified IDs and the specified public IP addresses belong to the same simple application servers. Otherwise, an empty result is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<code>42.1.**.**</code>&quot;, &quot;<code>42.2.**.**</code>&quot;]</p>
     */
    @NameInMap("PublicIpAddresses")
    public String publicIpAddresses;

    /**
     * <p>The region ID of the simple application servers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the simple application servers belong.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2bti7cf7****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the simple application servers. Valid values:</p>
     * <ul>
     * <li>Pending</li>
     * <li>Starting</li>
     * <li>Running</li>
     * <li>Stopping</li>
     * <li>Stopped</li>
     * <li>Resetting</li>
     * <li>Upgrading</li>
     * <li>Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags that are added to the simple application servers.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListInstancesRequestTag> tag;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ListInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ListInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public ListInstancesRequest setPublicIpAddresses(String publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
        return this;
    }
    public String getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    public ListInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListInstancesRequest setTag(java.util.List<ListInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key of the simple application servers. A tag key can be 1 to 64 characters in length. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the simple application servers. A tag value can be 1 to 64 characters in length. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesRequestTag self = new ListInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
