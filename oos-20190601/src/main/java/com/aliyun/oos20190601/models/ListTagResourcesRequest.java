// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceIds")
    public java.util.Map<String, ?> resourceIds;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagResourcesRequest setResourceIds(java.util.Map<String, ?> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.Map<String, ?> getResourceIds() {
        return this.resourceIds;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
