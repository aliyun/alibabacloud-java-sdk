// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListModelFeaturesShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the model features.</p>
     */
    @NameInMap("ModelFeatureIds")
    public String modelFeatureIdsShrink;

    /**
     * <p>The name of the model feature.</p>
     * 
     * <strong>example:</strong>
     * <p>model_feature1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order.</p>
     * <ul>
     * <li><p><code>ASC</code>: ascending order.</p>
     * </li>
     * <li><p><code>DESC</code>: descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The Alibaba Cloud account ID of the user who creates the model feature.</p>
     * 
     * <strong>example:</strong>
     * <p>12323143****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. The value must be a positive integer. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The project ID. You can call the <code>ListProjects</code> API to obtain the project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The field by which to sort the results.</p>
     * <ul>
     * <li><p><code>GmtCreateTime</code>: the creation time.</p>
     * </li>
     * <li><p><code>GmtModifiedTime</code>: the update time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListModelFeaturesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelFeaturesShrinkRequest self = new ListModelFeaturesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListModelFeaturesShrinkRequest setModelFeatureIdsShrink(String modelFeatureIdsShrink) {
        this.modelFeatureIdsShrink = modelFeatureIdsShrink;
        return this;
    }
    public String getModelFeatureIdsShrink() {
        return this.modelFeatureIdsShrink;
    }

    public ListModelFeaturesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelFeaturesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListModelFeaturesShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListModelFeaturesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelFeaturesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelFeaturesShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListModelFeaturesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
