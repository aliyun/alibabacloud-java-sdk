// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UnTagResourcesRequest extends TeaModel {
    // 是否删除所有标签，默认为 false，表示仅删除 tags 列表中的标签项。值为 true 时删除资源上绑定的所有标签。
    @NameInMap("all")
    public Boolean all;

    // 资源的 id 列表，可以一次为多个同类型资源删除相同的标签。当 all 为 false 时生效。
    @NameInMap("resourceId")
    public java.util.List<String> resourceId;

    // 资源的类型。目前取值范围 ： project。
    @NameInMap("resourceType")
    public String resourceType;

    // 标签 key 列表。当 all 为 false 时，仅删除列表中的标签。
    @NameInMap("tags")
    public java.util.List<String> tags;

    public static UnTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesRequest self = new UnTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UnTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UnTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UnTagResourcesRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
