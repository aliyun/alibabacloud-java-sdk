// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodTagResourcesRequest extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<ListVodTagResourcesRequestTag> tag;

    @NameInMap("TagOwnerBid")
    public String tagOwnerBid;

    @NameInMap("TagOwnerUid")
    public String tagOwnerUid;

    public static ListVodTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVodTagResourcesRequest self = new ListVodTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListVodTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVodTagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListVodTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListVodTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListVodTagResourcesRequest setTag(java.util.List<ListVodTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListVodTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public ListVodTagResourcesRequest setTagOwnerBid(String tagOwnerBid) {
        this.tagOwnerBid = tagOwnerBid;
        return this;
    }
    public String getTagOwnerBid() {
        return this.tagOwnerBid;
    }

    public ListVodTagResourcesRequest setTagOwnerUid(String tagOwnerUid) {
        this.tagOwnerUid = tagOwnerUid;
        return this;
    }
    public String getTagOwnerUid() {
        return this.tagOwnerUid;
    }

    public static class ListVodTagResourcesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListVodTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListVodTagResourcesRequestTag self = new ListVodTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListVodTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVodTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
