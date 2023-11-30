// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchShareLinkRequest extends TeaModel {
    /**
     * <p>The creators of shares. Set this parameter to a user ID. If you do not specify this parameter, Drive and Photo Service automatically queries shares based on your permissions. If you are a drive administrator or the super administrator, the shares created by all members are queried. If you are a team administrator, the shares created by all team members are queried. If you are a common user, only the shares created by yourself are queried.</p>
     * <br>
     * <p>If you specify this parameter, this parameter must be set to the ID of the super administrator, a drive administrator, or a team administrator.</p>
     */
    @NameInMap("creators")
    public java.util.List<String> creators;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
     * <br>
     * <p>The number of returned results must be less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\</p>
     * <p>By default, this parameter is left empty.</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The field by which to sort the returned results. Default value: created_at. Valid values:</p>
     * <br>
     * <p>*   share_name: sorts the results by the name of the share.</p>
     * <p>*   updated_at: sorts the results by the time when the share was modified.</p>
     * <p>*   description: sorts the results by the description of the share.</p>
     * <p>*   created_at: sorts the results by the time when the share was created.</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The order in which you want to sort the returned results. By default, order_direction is set to DESC if order_by is set to created_at or updated_at, and is set to ASC if order_by is set to other values. Valid values:</p>
     * <br>
     * <p>*   ASC: sorts the results in ascending order.</p>
     * <p>*   DESC: sorts the results in descending order.</p>
     */
    @NameInMap("order_direction")
    public String orderDirection;

    /**
     * <p>The query condition that is used to search for share URLs. You can use the following fields to specify query conditions: created_at: queries a share URL based on the time when the share URL was created. updated_at: queries a share URL based on the time when the share URL was modified. share_name_for_fuzzy: queries a share URL based on the name of the share. A fuzzy match is supported. status: queries a share URL based on the status of the share. Valid values: enabled and disabled. A value of enabled indicates that the share is valid. A value of disabled indicates that the share is canceled. expired_time: queries a share URL based on the expiration time of the share. If the share never expires, set this field to 1970-01-01T00:00:00. Otherwise, set this field to 1970-01-02T00:00:00.</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Specifies whether to return the total number of returned results.</p>
     */
    @NameInMap("return_total_count")
    public Boolean returnTotalCount;

    public static SearchShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchShareLinkRequest self = new SearchShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchShareLinkRequest setCreators(java.util.List<String> creators) {
        this.creators = creators;
        return this;
    }
    public java.util.List<String> getCreators() {
        return this.creators;
    }

    public SearchShareLinkRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchShareLinkRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public SearchShareLinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchShareLinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public SearchShareLinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchShareLinkRequest setReturnTotalCount(Boolean returnTotalCount) {
        this.returnTotalCount = returnTotalCount;
        return this;
    }
    public Boolean getReturnTotalCount() {
        return this.returnTotalCount;
    }

}
