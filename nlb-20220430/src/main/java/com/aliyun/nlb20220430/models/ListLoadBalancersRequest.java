// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListLoadBalancersRequest extends TeaModel {
    /**
     * <p>The protocol version. Valid values:</p>
     * <ul>
     * <li><strong>ipv4</strong>: IPv4.</li>
     * <li><strong>DualStack</strong>: dual-stack.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The IPv4 address type of the NLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: The load balancing instance has a public IP address. The DNS domain name is resolved to the public IP address. Therefore, the instance is accessible over the Internet.</li>
     * <li><strong>Intranet</strong>: The load balancing instance has only a private IP address. The DNS domain name is resolved to the private IP address. Therefore, the instance is accessible only within the internal network environment of the VPC where the load balancing instance is deployed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The DNS domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-wb7r6dlwetvt5j****.cn-hangzhou.nlb.aliyuncs.com</p>
     */
    @NameInMap("DNSName")
    public String DNSName;

    /**
     * <p>The IPv6 address type of the NLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: The load balancing instance has a public IP address. The DNS domain name is resolved to the public IP address. Therefore, the instance is accessible over the Internet.</li>
     * <li><strong>Intranet</strong>: The load balancing instance has only a private IP address. The DNS domain name is resolved to the private IP address. Therefore, the instance is accessible only within the internal network environment of the VPC where the load balancing instance is deployed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("Ipv6AddressType")
    public String ipv6AddressType;

    /**
     * <p>The business status of the NLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Abnormal</strong>: The instance is in an abnormal state.</li>
     * <li><strong>Normal</strong>: The instance is in a normal state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("LoadBalancerBusinessStatus")
    public String loadBalancerBusinessStatus;

    /**
     * <p>The IDs of the NLB instances. You can query up to 20 instances at a time.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The names of the NLB instances. You can query up to 20 instance names at a time.</p>
     */
    @NameInMap("LoadBalancerNames")
    public java.util.List<String> loadBalancerNames;

    /**
     * <p>The status of the NLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Inactive</strong>: The instance is stopped. Listeners of the instance no longer forward traffic.</li>
     * <li><strong>Active</strong>: The instance is running.</li>
     * <li><strong>Provisioning</strong>: The instance is being created.</li>
     * <li><strong>Configuring</strong>: Upgrade/Downgrade in progress.</li>
     * <li><strong>Deleting</strong>: The instance is being deleted.</li>
     * <li><strong>Deleted</strong>: The instance is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The type of load balancing. Only <strong>network</strong> is returned, which indicates Network Load Balancer (NLB).</p>
     * 
     * <strong>example:</strong>
     * <p>network</p>
     */
    @NameInMap("LoadBalancerType")
    public String loadBalancerType;

    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If this is the first request or no next request exists, you do not need to specify this parameter.</li>
     * <li>If a next request exists, set the value to the NextToken value returned in the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the NLB instance. </p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The labels of the NLB instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListLoadBalancersRequestTag> tag;

    /**
     * <p>The VPC ID of the NLB instance. You can query up to 10 VPC IDs at a time.</p>
     */
    @NameInMap("VpcIds")
    public java.util.List<String> vpcIds;

    /**
     * <p>The zone name. You can call the <a href="https://help.aliyun.com/document_detail/443890.html">DescribeZones</a> operation to query zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ListLoadBalancersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancersRequest self = new ListLoadBalancersRequest();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancersRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public ListLoadBalancersRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public ListLoadBalancersRequest setDNSName(String DNSName) {
        this.DNSName = DNSName;
        return this;
    }
    public String getDNSName() {
        return this.DNSName;
    }

    public ListLoadBalancersRequest setIpv6AddressType(String ipv6AddressType) {
        this.ipv6AddressType = ipv6AddressType;
        return this;
    }
    public String getIpv6AddressType() {
        return this.ipv6AddressType;
    }

    public ListLoadBalancersRequest setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
        this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
        return this;
    }
    public String getLoadBalancerBusinessStatus() {
        return this.loadBalancerBusinessStatus;
    }

    public ListLoadBalancersRequest setLoadBalancerIds(java.util.List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public java.util.List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public ListLoadBalancersRequest setLoadBalancerNames(java.util.List<String> loadBalancerNames) {
        this.loadBalancerNames = loadBalancerNames;
        return this;
    }
    public java.util.List<String> getLoadBalancerNames() {
        return this.loadBalancerNames;
    }

    public ListLoadBalancersRequest setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public ListLoadBalancersRequest setLoadBalancerType(String loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    public ListLoadBalancersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLoadBalancersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLoadBalancersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListLoadBalancersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListLoadBalancersRequest setTag(java.util.List<ListLoadBalancersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListLoadBalancersRequestTag> getTag() {
        return this.tag;
    }

    public ListLoadBalancersRequest setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    public ListLoadBalancersRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class ListLoadBalancersRequestTag extends TeaModel {
        /**
         * <p>The tag key of the instance. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ValueTest</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListLoadBalancersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersRequestTag self = new ListLoadBalancersRequestTag();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLoadBalancersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
