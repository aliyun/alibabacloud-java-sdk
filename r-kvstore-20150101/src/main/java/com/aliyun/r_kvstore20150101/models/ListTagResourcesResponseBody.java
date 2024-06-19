// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The token required to obtain more results. If a query does not return all results, in the next query, you can provide the token returned by the previous query to obtain more results.</p>
     * 
     * <strong>example:</strong>
     * <p>212db86sca4384811e0b5e8707ec2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>47A514A1-4B77-4E30-B4C5-2A880650****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the instances and tags.</p>
     */
    @NameInMap("TagResources")
    public ListTagResourcesResponseBodyTagResources tagResources;

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

    public ListTagResourcesResponseBody setTagResources(ListTagResourcesResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public ListTagResourcesResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesResponseBodyTagResourcesTagResource extends TeaModel {
        /**
         * <p>The resource ID, which is also the ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type. The return value is <strong>ALIYUN::KVSTORE::INSTANCE</strong>. This value indicates an ApsaraDB for Redis instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::KVSTORE::INSTANCE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The keys of the tags.</p>
         * 
         * <strong>example:</strong>
         * <p>demokey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The values of the tags.</p>
         * 
         * <strong>example:</strong>
         * <p>demovalue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResourcesTagResource self = new ListTagResourcesResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> tagResource;

        public static ListTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResources self = new ListTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResources setTagResource(java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
