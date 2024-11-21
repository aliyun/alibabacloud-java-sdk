// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PullLogsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MTQ0NzMyOTQwMTEwMjEzMDkwNA</p>
     */
    @NameInMap("cursor")
    public String cursor;

    /**
     * <strong>example:</strong>
     * <p>MTU1NzA1NzQwMTEwMjEzMDkwCg</p>
     */
    @NameInMap("end_cursor")
    public String endCursor;

    /**
     * <p>The SPL statement that is used to filter data. For more information, see <a href="https://help.aliyun.com/document_detail/2536530.html">SPL instructions</a>.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>| where userId=\&quot;123\&quot;</li>
     * </ul>
     */
    @NameInMap("query")
    public String query;

    public static PullLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        PullLogsRequest self = new PullLogsRequest();
        return TeaModel.build(map, self);
    }

    public PullLogsRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public PullLogsRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public PullLogsRequest setEndCursor(String endCursor) {
        this.endCursor = endCursor;
        return this;
    }
    public String getEndCursor() {
        return this.endCursor;
    }

    public PullLogsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
