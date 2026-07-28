// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolsRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without querying available IP address pool information. The system checks whether the required parameters are specified, whether the request format is valid, and whether business restrictions are met. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the check succeeds, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The line type. Valid values:</p>
     * <ul>
     * <li><p><strong>BGP</strong> (default): BGP (multi-ISP) line.</p>
     * </li>
     * <li><p><strong>BGP_PRO</strong>: BGP (multi-ISP) Pro line.</p>
     * </li>
     * </ul>
     * <p>For more information about BGP (multi-ISP) lines and BGP (multi-ISP) Pro lines, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
     * <p>If you are a whitelist user of single-ISP bandwidth, you can also select the following types:</p>
     * <ul>
     * <li><strong>ChinaTelecom</strong>: China Telecom</li>
     * <li><strong>ChinaUnicom</strong>: China Unicom</li>
     * <li><strong>ChinaMobile</strong>: China Mobile</li>
     * <li><strong>ChinaTelecom_L2</strong>: China Telecom L2</li>
     * <li><strong>ChinaUnicom_L2</strong>: China Unicom L2</li>
     * <li><strong>ChinaMobile_L2</strong>: China Mobile L2</li>
     * </ul>
     * <p>If you are a China (Hangzhou) Finance Cloud user, this field is required. Set the value to <strong>BGP_FinanceCloud</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The maximum number of entries to return in this request. Valid values: <strong>10</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the IP address pool instance.</p>
     * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>AddressPoolName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request or if no subsequent request is to be sent.</li>
     * <li>If a subsequent request is to be sent, set the value to the NextToken value returned in the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The list of IP address pool instance IDs.</p>
     * <p>You can specify up to 100 IP address pool instance IDs.</p>
     */
    @NameInMap("PublicIpAddressPoolIds")
    public java.util.List<String> publicIpAddressPoolIds;

    /**
     * <p>The region ID of the IP address pool that you want to query.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the IP address pool belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4pcdvf****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable Anti-DDoS (Enhanced). Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: disabled.</li>
     * <li><strong>true</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SecurityProtectionEnabled")
    public Boolean securityProtectionEnabled;

    /**
     * <p>The instance status of the IPAM pool. Valid values:</p>
     * <ul>
     * <li><strong>Created</strong>: active.</li>
     * <li><strong>Deleting</strong>: being deleted.</li>
     * <li><strong>Modifying</strong>: being modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Created</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListPublicIpAddressPoolsRequestTags> tags;

    public static ListPublicIpAddressPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicIpAddressPoolsRequest self = new ListPublicIpAddressPoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicIpAddressPoolsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListPublicIpAddressPoolsRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public ListPublicIpAddressPoolsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicIpAddressPoolsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPublicIpAddressPoolsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicIpAddressPoolsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListPublicIpAddressPoolsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListPublicIpAddressPoolsRequest setPublicIpAddressPoolIds(java.util.List<String> publicIpAddressPoolIds) {
        this.publicIpAddressPoolIds = publicIpAddressPoolIds;
        return this;
    }
    public java.util.List<String> getPublicIpAddressPoolIds() {
        return this.publicIpAddressPoolIds;
    }

    public ListPublicIpAddressPoolsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPublicIpAddressPoolsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListPublicIpAddressPoolsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListPublicIpAddressPoolsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListPublicIpAddressPoolsRequest setSecurityProtectionEnabled(Boolean securityProtectionEnabled) {
        this.securityProtectionEnabled = securityProtectionEnabled;
        return this;
    }
    public Boolean getSecurityProtectionEnabled() {
        return this.securityProtectionEnabled;
    }

    public ListPublicIpAddressPoolsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListPublicIpAddressPoolsRequest setTags(java.util.List<ListPublicIpAddressPoolsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListPublicIpAddressPoolsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListPublicIpAddressPoolsRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListPublicIpAddressPoolsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListPublicIpAddressPoolsRequestTags self = new ListPublicIpAddressPoolsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListPublicIpAddressPoolsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPublicIpAddressPoolsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
