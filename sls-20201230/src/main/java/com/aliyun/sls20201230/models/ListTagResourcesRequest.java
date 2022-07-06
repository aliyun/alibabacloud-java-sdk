// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    // 查询的资源的 id 列表。resource id 与 tags 应至少存在一个。
    @NameInMap("resourceId")
    public java.util.List<String> resourceId;

    // 资源类型。目前取值范围：project。
    @NameInMap("resourceType")
    public String resourceType;

    // 精确查找时过滤的标签键值对。resource id 与 tags 应至少存在一个。
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
        // 精确过滤的标签的键。
        @NameInMap("key")
        public String key;

        // 精确过滤的标签的值。
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
