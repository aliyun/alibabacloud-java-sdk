// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogsRequest extends TeaModel {
    /**
     * <p>The data to be updated, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;status&quot;:&quot;success&quot;}</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The start time of the query. This time refers to the log time specified when the log data was written.</p>
     * <p>The time range defined by the request parameters from and to follows the left-closed, right-open principle. That is, the time range includes the start time but does not include the end time. If the values of from and to are the same, the range is invalid and the function returns an error directly.
     * Unix timestamp format, representing the number of seconds since 1970-01-01 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>Optional: A query statement used to filter the logs to be updated. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Query overview</a>.</p>
     * <p>Note: This parameter only supports query statements and does not support analysis statements such as SPL or SQL.</p>
     * 
     * <strong>example:</strong>
     * <p>status: 401</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Optional: The value of the built-in field <strong>rowid</strong> that is automatically returned in the query results.</p>
     * <p>One of the two fields, rowId and query, must be specified. If both are specified, rowId takes higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>0|1000001|638732499</p>
     */
    @NameInMap("rowId")
    public String rowId;

    /**
     * <p>The end time of the query. This time refers to the log time specified when the log data was written.</p>
     * <p>The time range defined by the request parameters from and to follows the left-closed, right-open principle. That is, the time range includes the start time but does not include the end time. If the values of from and to are the same, the range is invalid and the function returns an error directly.
     * Unix timestamp format, representing the number of seconds since 1970-01-01 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268200</p>
     */
    @NameInMap("to")
    public Integer to;

    /**
     * <p>Optional: The value can be full or partial. The default value is partial.</p>
     * <ul>
     * <li>full —— The request body must contain all fields of the row. The server overwrites the entire old record with the new values.</li>
     * <li>partial —— The request body only needs to contain the fields to be modified. Fields that are not provided retain their original values.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>partial</p>
     */
    @NameInMap("updateMode")
    public String updateMode;

    public static UpdateLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogsRequest self = new UpdateLogsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogsRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public UpdateLogsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public UpdateLogsRequest setRowId(String rowId) {
        this.rowId = rowId;
        return this;
    }
    public String getRowId() {
        return this.rowId;
    }

    public UpdateLogsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public UpdateLogsRequest setUpdateMode(String updateMode) {
        this.updateMode = updateMode;
        return this;
    }
    public String getUpdateMode() {
        return this.updateMode;
    }

}
