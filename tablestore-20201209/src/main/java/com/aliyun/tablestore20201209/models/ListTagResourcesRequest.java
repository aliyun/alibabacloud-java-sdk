// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tags")
    public java.util.List<ListTagResourcesRequestTags> tags;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTags(java.util.List<ListTagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListTagResourcesRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListTagResourcesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTags self = new ListTagResourcesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
