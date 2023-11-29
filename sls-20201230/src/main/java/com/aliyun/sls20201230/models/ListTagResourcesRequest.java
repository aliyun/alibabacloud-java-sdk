// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The IDs of the resources for which you want to query tags. You must specify at least one of resourceId and tags.</p>
     */
    @NameInMap("resourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource. Set the value to project.</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The tags that you want to use to filter resources based on exact match. Each tag is a key-value pair. You must specify at least one of resourceId and tags.</p>
     * <br>
     * <p>You can enter up to 20 tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<ListTagResourcesRequestTags> tags;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
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
        /**
         * <p>The key of the tag that you want to use to filter resources. For example, if you set the key to `"test-key"`, only resources to which the key is added are returned.``</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the tag that you want to use to filter resources. If you set the value to null, resources are filtered based only on the key of the tag.</p>
         */
        @NameInMap("value")
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
