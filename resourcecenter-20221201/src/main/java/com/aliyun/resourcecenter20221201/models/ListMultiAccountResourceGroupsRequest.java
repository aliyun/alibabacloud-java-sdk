// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountResourceGroupsRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

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
