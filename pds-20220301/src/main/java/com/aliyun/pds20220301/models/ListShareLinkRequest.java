// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListShareLinkRequest extends TeaModel {
    /**
     * <p>The creator of the share.</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>Specifies whether to return the shares that are canceled.</p>
     */
    @NameInMap("include_cancelled")
    public Boolean includeCancelled;

    /**
     * <p>The maximum number of results to return. Valid values: 0 to 100.</p>
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

    public static ListShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShareLinkRequest self = new ListShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public ListShareLinkRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListShareLinkRequest setIncludeCancelled(Boolean includeCancelled) {
        this.includeCancelled = includeCancelled;
        return this;
    }
    public Boolean getIncludeCancelled() {
        return this.includeCancelled;
    }

    public ListShareLinkRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListShareLinkRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListShareLinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListShareLinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

}
