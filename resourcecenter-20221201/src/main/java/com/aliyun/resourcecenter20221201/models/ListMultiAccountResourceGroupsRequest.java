// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountResourceGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the management account or member of the resource directory.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 100. Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The IDs of resource groups.</p>
     */
    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    public static ListMultiAccountResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountResourceGroupsRequest self = new ListMultiAccountResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountResourceGroupsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ListMultiAccountResourceGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMultiAccountResourceGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiAccountResourceGroupsRequest setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

}
