// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewsShrinkRequest extends TeaModel {
    /**
     * <p>Filters the results by feature name.</p>
     * 
     * <strong>example:</strong>
     * <p>feature1</p>
     */
    @NameInMap("FeatureName")
    public String featureName;

    /**
     * <p>The feature view IDs by which to filter the results.</p>
     */
    @NameInMap("FeatureViewIds")
    public String featureViewIdsShrink;

    /**
     * <p>Filters the results by feature view name.</p>
     * 
     * <strong>example:</strong>
     * <p>fv1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Valid values: <code>Desc</code> (descending) and <code>Asc</code> (ascending).</p>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>Filters the results by owner.</p>
     * 
     * <strong>example:</strong>
     * <p>1232143243242****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number of the results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of feature views to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The project ID. You can obtain this ID by calling the <code>ListProjects</code> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Filters the results by tag.</p>
     * 
     * <strong>example:</strong>
     * <p>tag1</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>Filters the results by type. Valid values:</p>
     * <p>● <code>Batch</code>: batch feature</p>
     * <p>● <code>Stream</code>: stream feature</p>
     * 
     * <strong>example:</strong>
     * <p>Batch</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListFeatureViewsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewsShrinkRequest self = new ListFeatureViewsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewsShrinkRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public ListFeatureViewsShrinkRequest setFeatureViewIdsShrink(String featureViewIdsShrink) {
        this.featureViewIdsShrink = featureViewIdsShrink;
        return this;
    }
    public String getFeatureViewIdsShrink() {
        return this.featureViewIdsShrink;
    }

    public ListFeatureViewsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListFeatureViewsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListFeatureViewsShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListFeatureViewsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFeatureViewsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFeatureViewsShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFeatureViewsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListFeatureViewsShrinkRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ListFeatureViewsShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
