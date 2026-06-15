// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectFeaturesRequest extends TeaModel {
    /**
     * <p>The feature alias. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ff1</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>Additional filter conditions in a JSON object. Conditions are combined by using the AND operator.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;feature_view_name&quot;:&quot;fv1&quot;}</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The feature name. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>f1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies the sort order. Valid values: <code>Asc</code> and <code>Desc</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of features to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field used to sort the returned features.</p>
     * 
     * <strong>example:</strong>
     * <p>ModelFeatureCount</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListProjectFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFeaturesRequest self = new ListProjectFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectFeaturesRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public ListProjectFeaturesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListProjectFeaturesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProjectFeaturesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListProjectFeaturesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectFeaturesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectFeaturesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
