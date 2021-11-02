// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class TagVodResourcesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<TagVodResourcesRequestTag> tag;

    public static TagVodResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagVodResourcesRequest self = new TagVodResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagVodResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagVodResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagVodResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagVodResourcesRequest setTag(java.util.List<TagVodResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagVodResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagVodResourcesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static TagVodResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagVodResourcesRequestTag self = new TagVodResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagVodResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagVodResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
