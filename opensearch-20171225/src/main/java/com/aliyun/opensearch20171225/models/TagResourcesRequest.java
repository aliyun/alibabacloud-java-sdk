// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The resource IDs. You can specify a maximum number of 50 resource IDs.</p>
     */
    @NameInMap("resourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type.</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The tags. You can specify a maximum number of 20 tags.</p>
     */
    @NameInMap("tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(java.util.List<TagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagResourcesRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("value")
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
