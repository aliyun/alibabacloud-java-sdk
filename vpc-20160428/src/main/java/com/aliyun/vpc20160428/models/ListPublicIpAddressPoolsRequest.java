// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolsRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The line type. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default): BGP (Multi-ISP) line</p>
     * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro line</p>
     * <br>
     * <p>For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see the "Line types" section of [What is EIP?](https://help.aliyun.com/document_detail/32321.html)</p>
     * <br>
     * <p>If you are allowed to use single-ISP bandwidth, you can also choose one of the following values:</p>
     * <br>
     * <p>*   **ChinaTelecom**</p>
     * <p>*   **ChinaUnicom**</p>
     * <p>*   **ChinaMobile**</p>
     * <p>*   **ChinaTelecom_L2**</p>
     * <p>*   **ChinaUnicom_L2**</p>
     * <p>*   **ChinaMobile_L2**</p>
     * <br>
     * <p>If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to **BGP_FinanceCloud**.</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The maximum number of entries to return. Valid values: **10** to **100**. Default value: **10**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the IP address pool.</p>
     * <br>
     * <p>If you enter a name, the name must be 1 to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IDs of the IP address pool.</p>
     * <br>
     * <p>You can enter up to 100 IDs.</p>
     */
    @NameInMap("PublicIpAddressPoolIds")
    public java.util.List<String> publicIpAddressPoolIds;

    /**
     * <p>The ID of the region in which the IP address pool that you want to query resides.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the IP address pool belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable Anti-DDoS Pro/Premium. Valid values:</p>
     * <br>
     * <p>*   **false**</p>
     * <p>*   **true**</p>
     */
    @NameInMap("SecurityProtectionEnabled")
    public Boolean securityProtectionEnabled;

    /**
     * <p>The status of the IP address pool. Valid values:</p>
     * <br>
     * <p>*   **Created**</p>
     * <p>*   **Deleting**</p>
     * <p>*   **Modifying**</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags to add to the resource.</p>
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
         * <p>The tag key to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length. It cannot start with `aliyun` or `acs:` and cannot contain `http://` or `https://`.</p>
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
