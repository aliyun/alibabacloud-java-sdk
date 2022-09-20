// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTagResourcesForExpressConnectResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagResources")
    public ListTagResourcesForExpressConnectResponseBodyTagResources tagResources;

    public static ListTagResourcesForExpressConnectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesForExpressConnectResponseBody self = new ListTagResourcesForExpressConnectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesForExpressConnectResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesForExpressConnectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesForExpressConnectResponseBody setTagResources(ListTagResourcesForExpressConnectResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public ListTagResourcesForExpressConnectResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource self = new ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesForExpressConnectResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource> tagResource;

        public static ListTagResourcesForExpressConnectResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesForExpressConnectResponseBodyTagResources self = new ListTagResourcesForExpressConnectResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesForExpressConnectResponseBodyTagResources setTagResource(java.util.List<ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<ListTagResourcesForExpressConnectResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
