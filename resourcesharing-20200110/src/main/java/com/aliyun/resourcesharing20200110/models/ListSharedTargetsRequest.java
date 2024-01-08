// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedTargetsRequest extends TeaModel {
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

    /**
     * <p>The ID of the shared resource.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The owner of the resource share.</p>
     * <br>
     * <p>*   Self: your account. If you set the value to Self, the principals that are associated with your resource shares are queried.</p>
     * <p>*   OtherAccounts: another account. If you set the value to OtherAccounts, the resource shares with which your account is associated and the owners of the resource shares are queried.</p>
     */
    @NameInMap("ResourceOwner")
    public String resourceOwner;

    /**
     * <p>The ID of a resource share.</p>
     */
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
     * <p>The ID of a principal.</p>
     */
    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static ListSharedTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSharedTargetsRequest self = new ListSharedTargetsRequest();
        return TeaModel.build(map, self);
    }

    public ListSharedTargetsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSharedTargetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSharedTargetsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListSharedTargetsRequest setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    public ListSharedTargetsRequest setResourceShareIds(java.util.List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }
    public java.util.List<String> getResourceShareIds() {
        return this.resourceShareIds;
    }

    public ListSharedTargetsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListSharedTargetsRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

}
