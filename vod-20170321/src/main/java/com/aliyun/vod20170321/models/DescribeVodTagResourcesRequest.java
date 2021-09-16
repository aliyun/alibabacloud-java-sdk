// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTagResourcesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("Tag")
    public java.util.List<DescribeVodTagResourcesRequestTag> tag;

    public static DescribeVodTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTagResourcesRequest self = new DescribeVodTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodTagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeVodTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public DescribeVodTagResourcesRequest setTag(java.util.List<DescribeVodTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVodTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeVodTagResourcesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVodTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTagResourcesRequestTag self = new DescribeVodTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeVodTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVodTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
