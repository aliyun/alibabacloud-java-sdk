// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The description of the instance. You can use this description to filter instances. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Havenask instance</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The Instance type, vector (vector index version),engine (recall engine version)</p>
     * 
     * <strong>example:</strong>
     * <p>vector</p>
     */
    @NameInMap("edition")
    public String edition;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-83570439y0n</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzgpiswzbksdi</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag dictionary.</p>
     */
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
