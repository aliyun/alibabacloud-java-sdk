// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureEntitiesShrinkRequest extends TeaModel {
    /**
     * <p>Filters the results by a list of feature entity IDs.</p>
     */
    @NameInMap("FeatureEntityIds")
    public String featureEntityIdsShrink;

    /**
     * <p>Filters the results by feature entity name.</p>
     * 
     * <strong>example:</strong>
     * <p>feature_entity_1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><code>Asc</code>: Ascending order.</p>
     * </li>
     * <li><p><code>Desc</code>: Descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The Alibaba Cloud account ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1231432*****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Values start at 1. Default value: 1.</p>
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
     * <p>Filters the results by parent feature entity ID. Omit this parameter to return all feature entities. Set it to <code>0</code> to return all root feature entities. Set it to a non-zero value to return all child feature entities of the specified parent.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ParentFeatureEntityId")
    public String parentFeatureEntityId;

    /**
     * <p>The project ID. You can obtain this ID by calling the <code>ListProjects</code> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The field to sort the results by.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtModifiedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListFeatureEntitiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureEntitiesShrinkRequest self = new ListFeatureEntitiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureEntitiesShrinkRequest setFeatureEntityIdsShrink(String featureEntityIdsShrink) {
        this.featureEntityIdsShrink = featureEntityIdsShrink;
        return this;
    }
    public String getFeatureEntityIdsShrink() {
        return this.featureEntityIdsShrink;
    }

    public ListFeatureEntitiesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListFeatureEntitiesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListFeatureEntitiesShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListFeatureEntitiesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFeatureEntitiesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFeatureEntitiesShrinkRequest setParentFeatureEntityId(String parentFeatureEntityId) {
        this.parentFeatureEntityId = parentFeatureEntityId;
        return this;
    }
    public String getParentFeatureEntityId() {
        return this.parentFeatureEntityId;
    }

    public ListFeatureEntitiesShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFeatureEntitiesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
