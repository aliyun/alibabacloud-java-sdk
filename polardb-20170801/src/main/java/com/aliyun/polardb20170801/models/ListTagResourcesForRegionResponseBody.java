// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListTagResourcesForRegionResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagResources")
    public ListTagResourcesForRegionResponseBodyTagResources tagResources;

    public static ListTagResourcesForRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesForRegionResponseBody self = new ListTagResourcesForRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesForRegionResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesForRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesForRegionResponseBody setTagResources(ListTagResourcesForRegionResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public ListTagResourcesForRegionResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesForRegionResponseBodyTagResourcesTagResource extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesForRegionResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesForRegionResponseBodyTagResourcesTagResource self = new ListTagResourcesForRegionResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesForRegionResponseBodyTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesForRegionResponseBodyTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesForRegionResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesForRegionResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesForRegionResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<ListTagResourcesForRegionResponseBodyTagResourcesTagResource> tagResource;

        public static ListTagResourcesForRegionResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesForRegionResponseBodyTagResources self = new ListTagResourcesForRegionResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesForRegionResponseBodyTagResources setTagResource(java.util.List<ListTagResourcesForRegionResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<ListTagResourcesForRegionResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
