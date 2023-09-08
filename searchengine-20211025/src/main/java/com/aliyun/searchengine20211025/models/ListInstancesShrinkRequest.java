// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The description of the instance</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>实例类型，vector(向量索引版)，engine(召回引擎版)</p>
     */
    @NameInMap("edition")
    public String edition;

    /**
     * <p>The time when the instance was created</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The status of the instance</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The description of the instance. You can use this description to filter instances. Fuzzy match is supported.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public String tagsShrink;

    public static ListInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesShrinkRequest self = new ListInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListInstancesShrinkRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public ListInstancesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstancesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstancesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
