// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListShareLinkRequest extends TeaModel {
    /**
     * <p>The creator of the share.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>Specifies whether to return the shares that are canceled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("include_cancelled")
    public Boolean includeCancelled;

    /**
     * <p>The maximum number of results to return. Valid values: 0 to 100.</p>
     * <p>The number of returned results must be less than or equal to the specified number.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\
     * By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The field by which to sort the returned results. Default value: created_at. Valid values:</p>
     * <ul>
     * <li>share_name: sorts the results by the name of the share.</li>
     * <li>updated_at: sorts the results by the time when the share was modified.</li>
     * <li>description: sorts the results by the description of the share.</li>
     * <li>created_at: sorts the results by the time when the share was created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>share_name</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The order in which you want to sort the returned results. By default, order_direction is set to DESC if order_by is set to created_at or updated_at, and is set to ASC if order_by is set to other values. Valid values:</p>
     * <ul>
     * <li>ASC: sorts the results in ascending order.</li>
     * <li>DESC: sorts the results in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
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
