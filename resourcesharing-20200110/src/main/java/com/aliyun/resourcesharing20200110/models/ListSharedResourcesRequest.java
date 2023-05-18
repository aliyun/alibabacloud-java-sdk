// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedResourcesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 20.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The `token` that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The owner of the resource shares. Valid values:</p>
     * <br>
     * <p>*   Self: your account. If you set the value to Self, the resources you share with other accounts are queried.</p>
     * <p>*   OtherAccounts: another account. If you set the value to OtherAccounts, the resources other accounts share with you are queried.</p>
     */
    @NameInMap("ResourceOwner")
    public String resourceOwner;

    @NameInMap("ResourceShareIds")
    public java.util.List<String> resourceShareIds;

    /**
     * <p>The type of the shared resources.</p>
     * <br>
     * <p>For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the principal or resource owner.</p>
     * <br>
     * <p>*   If the value of `ResourceOwner` is `Self`, set this parameter to the ID of a principal.</p>
     * <p>*   If the value of `ResourceOwner` is `OtherAccounts`, set this parameter to the ID of a resource owner.</p>
     */
    @NameInMap("Target")
    public String target;

    public static ListSharedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSharedResourcesRequest self = new ListSharedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListSharedResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSharedResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSharedResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public ListSharedResourcesRequest setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    public ListSharedResourcesRequest setResourceShareIds(java.util.List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }
    public java.util.List<String> getResourceShareIds() {
        return this.resourceShareIds;
    }

    public ListSharedResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListSharedResourcesRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
