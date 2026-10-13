// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListShareLinkRequest extends TeaModel {
    /**
     * <p>The user ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>Specifies whether to include canceled shares in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("include_cancelled")
    public Boolean includeCancelled;

    /**
     * <p>The maximum number of shares to return. The value must be in the range of [0, 100].</p>
     * <p>The number of results returned can be less than the specified value.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>A token for paginating results. To retrieve the next page, provide the <code>next_marker</code> value from the previous response. Omit this parameter to query from the beginning.<br>Default: none<br></p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The field to sort results by.
     * By default, results are sorted by creation time in descending order.
     * Valid values:</p>
     * <ul>
     * <li><p><code>share_name</code>: share name</p>
     * </li>
     * <li><p><code>updated_at</code>: modification time</p>
     * </li>
     * <li><p><code>description</code>: share description</p>
     * </li>
     * <li><p><code>created_at</code>: creation time</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>share_name</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The sort order.
     * If the sort field is <code>created_at</code> or <code>updated_at</code>, the default order is descending. For other sort fields, the default is ascending.
     * Valid values:</p>
     * <ul>
     * <li><p><code>ASC</code>: ascending order</p>
     * </li>
     * <li><p><code>DESC</code>: descending order</p>
     * </li>
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
