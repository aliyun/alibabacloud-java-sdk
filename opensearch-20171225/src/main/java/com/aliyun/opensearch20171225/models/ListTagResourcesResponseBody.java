// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The token that is used to retrieve the next page.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resources.</p>
     */
    @NameInMap("result")
    public java.util.List<ListTagResourcesResponseBodyResult> result;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesResponseBody setResult(java.util.List<ListTagResourcesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListTagResourcesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListTagResourcesResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyResult self = new ListTagResourcesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyResult setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyResult setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyResult setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyResult setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
