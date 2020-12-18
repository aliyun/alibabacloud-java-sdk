// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedTargetsRequest extends TeaModel {
    @NameInMap("ResourceOwner")
    @Validation(required = true)
    public String resourceOwner;

    @NameInMap("ResourceShareIds")
    public java.util.List<String> resourceShareIds;

    @NameInMap("Targets")
    public java.util.List<String> targets;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListSharedTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSharedTargetsRequest self = new ListSharedTargetsRequest();
        return TeaModel.build(map, self);
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

    public ListSharedTargetsRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public ListSharedTargetsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListSharedTargetsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
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

}
