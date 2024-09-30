// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListResourcesByTagResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the <code>next query</code> is required.</p>
     * <ul>
     * <li>If the value of this parameter is empty (<code>&quot;NextToken&quot;: &quot;&quot;</code>), all results are returned, and the <code>next query</code> is not required.</li>
     * <li>If the value of this parameter is not empty, the next query is required, and the value is the <code>token</code> used to start the next query.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7D61FF74-61C2-5768-B01F-05FC97F24F35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<ListResourcesByTagResponseBodyResources> resources;

    public static ListResourcesByTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesByTagResponseBody self = new ListResourcesByTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesByTagResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourcesByTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcesByTagResponseBody setResources(java.util.List<ListResourcesByTagResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListResourcesByTagResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class ListResourcesByTagResponseBodyResourcesTags extends TeaModel {
        /**
         * <p>The type of the tag. Valid values:</p>
         * <ul>
         * <li>custom</li>
         * <li>system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListResourcesByTagResponseBodyResourcesTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesByTagResponseBodyResourcesTags self = new ListResourcesByTagResponseBodyResourcesTags();
            return TeaModel.build(map, self);
        }

        public ListResourcesByTagResponseBodyResourcesTags setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListResourcesByTagResponseBodyResourcesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourcesByTagResponseBodyResourcesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListResourcesByTagResponseBodyResources extends TeaModel {
        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9pifyuw26esxd05****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The information of the tags.</p>
         * <p>This parameter is returned only if the <code>IncludeAllTags</code> parameter is set to <code>True</code>.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListResourcesByTagResponseBodyResourcesTags> tags;

        public static ListResourcesByTagResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesByTagResponseBodyResources self = new ListResourcesByTagResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListResourcesByTagResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourcesByTagResponseBodyResources setTags(java.util.List<ListResourcesByTagResponseBodyResourcesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListResourcesByTagResponseBodyResourcesTags> getTags() {
            return this.tags;
        }

    }

}
