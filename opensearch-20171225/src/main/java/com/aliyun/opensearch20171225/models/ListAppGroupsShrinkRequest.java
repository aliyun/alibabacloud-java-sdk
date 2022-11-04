// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupsShrinkRequest extends TeaModel {
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("name")
    public String name;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("sortBy")
    public Integer sortBy;

    @NameInMap("tags")
    public String tagsShrink;

    @NameInMap("type")
    public String type;

    public static ListAppGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupsShrinkRequest self = new ListAppGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAppGroupsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAppGroupsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAppGroupsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppGroupsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppGroupsShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAppGroupsShrinkRequest setSortBy(Integer sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public Integer getSortBy() {
        return this.sortBy;
    }

    public ListAppGroupsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListAppGroupsShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
