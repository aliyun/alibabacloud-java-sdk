// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The resource IDs. You can specify only one resource and add tags to the resource.</p>
     */
    @NameInMap("resourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource. Set the value to project.</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The tags that you want to add to the resource. Up to 20 tags are supported at a time. Each tag is a key-value pair.</p>
     */
    @NameInMap("tags")
    public java.util.List<TagResourcesRequestTags> tags;

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

    public TagResourcesRequest setTags(java.util.List<TagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<TagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class TagResourcesRequestTags extends TeaModel {
        /**
         * <p>The key of the tag. The key must meet the following requirements:</p>
         * <br>
         * <p>*   The key must be `1 to 128` characters in length.</p>
         * <p>*   The key cannot contain `"http://"` or `"https://"`.</p>
         * <p>*   The key cannot start with `"acs:"` or `"aliyun"`.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the tag. The value must meet the following requirements:</p>
         * <br>
         * <p>*   The value must be `1 to 128` characters in length.</p>
         * <p>*   The value cannot contain `"http://"` or `"https://"`.</p>
         */
        @NameInMap("value")
        public String value;

        public static TagResourcesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTags self = new TagResourcesRequestTags();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
