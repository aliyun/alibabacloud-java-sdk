// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTagResourcesForExpressConnectResponseBody extends TeaModel {
    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If the return value of **NextToken** is empty, no next query is to be sent.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about the tag.</p>
     */
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
        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource. The value is set to **PHYSICALCONNECTION**, which indicates the Express Connect circuit.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The key of the tag that is added to the resource.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag that is added to the resource.</p>
         */
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
