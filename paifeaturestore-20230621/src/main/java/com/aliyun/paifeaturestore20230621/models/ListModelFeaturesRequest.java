// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListModelFeaturesRequest extends TeaModel {
    @NameInMap("ModelFeatureIds")
    public java.util.List<String> modelFeatureIds;

    /**
     * <strong>example:</strong>
     * <p>model_feature1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>12323143****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListModelFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelFeaturesRequest self = new ListModelFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ListModelFeaturesRequest setModelFeatureIds(java.util.List<String> modelFeatureIds) {
        this.modelFeatureIds = modelFeatureIds;
        return this;
    }
    public java.util.List<String> getModelFeatureIds() {
        return this.modelFeatureIds;
    }

    public ListModelFeaturesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelFeaturesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListModelFeaturesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListModelFeaturesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelFeaturesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelFeaturesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListModelFeaturesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
