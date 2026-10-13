// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchShareLinkRequest extends TeaModel {
    /**
     * <p>The IDs of the creators.
     * <br>1) If this parameter is not specified, the search scope depends on the user\&quot;s role:
     * <br>    - A drive administrator or super administrator can search for shares from all members.
     * <br>    - A team administrator can search for shares from team members.
     * <br>    - A regular user can only search for their own shares.<br><br><br><br></p>
     * <p>2\) You can only specify user IDs that are within your role\&quot;s search scope, as described in point 1).</p>
     */
    @NameInMap("creators")
    public java.util.List<String> creators;

    /**
     * <p>The maximum number of shares to return. Valid values: 1-100. Default: 100.</p>
     * <p>The number of shares returned may be less than the specified limit.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>Use the <code>next_marker</code> value from a previous response to retrieve the next page of results.<br>If this parameter is not specified, the first page of results is returned.<br></p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The sort field.
     * By default, results are sorted by creation time in descending order.
     * Valid values:</p>
     * <ul>
     * <li><p><code>share_name</code>: The share name.</p>
     * </li>
     * <li><p><code>updated_at</code>: The update time.</p>
     * </li>
     * <li><p><code>description</code>: The description.</p>
     * </li>
     * <li><p><code>created_at</code>: The creation time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>created_at</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The sort order.
     * If the sort field is <code>created_at</code> or <code>updated_at</code>, the default order is descending. For other sort fields, the default order is ascending.
     * Valid values:</p>
     * <ul>
     * <li><p><code>ASC</code>: ascending</p>
     * </li>
     * <li><p><code>DESC</code>: descending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("order_direction")
    public String orderDirection;

    /**
     * <p>The query conditions.
     * <br>1) Supported fields:
     * <br>    1.1 <code>created_at</code>: The creation time.
     * <br>    1.2 <code>updated_at</code>: The update time.
     * <br>    1.3 <code>share_name_for_fuzzy</code>: The share name. Fuzzy search (<code>match</code>) is supported.
     * <br>    1.4 <code>status</code>: The share status. Valid values: <code>enabled</code> (active) or <code>disabled</code> (canceled).
     * <br>    1.5 <code>expired_time</code>: The expiration time.
     * <br>    To search for shares that never expire, set <code>expired_time=\\&quot;1970-01-01T00:00:00\\&quot;</code>. For these shares, the <code>expiration</code> field in the response is an empty string.
     * <br>    The time range <code>expired_time&lt;\\&quot;1970-01-02T00:00:00\\&quot;</code> is reserved for system use and does not represent a valid expiration time.<br><br><br><br><br><br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>created_at&gt;=\&quot;2022-01-18T02:50:00\&quot; and created_at&lt;\&quot;2022-01-19T09:45:28\&quot; and share_name_for_fuzzy match \&quot;HD.mp4\&quot; and status in [\&quot;enabled\&quot;, \&quot;disabled\&quot;] and expired_time=\&quot;1970-01-01T00:00:00\&quot;</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Specifies whether to return the total count of matched shares.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
