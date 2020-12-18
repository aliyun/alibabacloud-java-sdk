// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedResourcesRequest extends TeaModel {
    @NameInMap("ResourceOwner")
    @Validation(required = true)
    public String resourceOwner;

    @NameInMap("ResourceShareIds")
    public java.util.List<String> resourceShareIds;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("Target")
    public String target;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListSharedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSharedResourcesRequest self = new ListSharedResourcesRequest();
        return TeaModel.build(map, self);
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

    public ListSharedResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public ListSharedResourcesRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
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

}
