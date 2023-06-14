// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the `next query` is required.</p>
     * <br>
     * <p>*   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the `next query` is not required.</p>
     * <p>*   If the value of this parameter is not empty, the next query is required, and the value is the `token` used to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the tags that are added to the resources.</p>
     */
    @NameInMap("TagResources")
    public java.util.List<ListTagResourcesResponseBodyTagResources> tagResources;

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

    public ListTagResourcesResponseBody setTagResources(java.util.List<ListTagResourcesResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<ListTagResourcesResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesResponseBodyTagResourcesTags extends TeaModel {
        /**
         * <p>The type of the tag. Valid values:</p>
         * <br>
         * <p>*   Custom</p>
         * <p>*   System</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagResourcesResponseBodyTagResourcesTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResourcesTags self = new ListTagResourcesResponseBodyTagResourcesTags();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResourcesTags setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListTagResourcesResponseBodyTagResourcesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesResponseBodyTagResourcesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        /**
         * <p>The ARN of the resource.</p>
         */
        @NameInMap("ResourceARN")
        public String resourceARN;

        /**
         * <p>The information of the tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTags> tags;

        public static ListTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResources self = new ListTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResources setResourceARN(String resourceARN) {
            this.resourceARN = resourceARN;
            return this;
        }
        public String getResourceARN() {
            return this.resourceARN;
        }

        public ListTagResourcesResponseBodyTagResources setTags(java.util.List<ListTagResourcesResponseBodyTagResourcesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTags> getTags() {
            return this.tags;
        }

    }

}
