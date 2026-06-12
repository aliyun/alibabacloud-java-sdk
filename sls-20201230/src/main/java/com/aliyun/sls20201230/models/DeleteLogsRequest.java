// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteLogsRequest extends TeaModel {
    /**
     * <p>The start time of the query. This time refers to the log time specified when the log data was written.</p>
     * <p>The time interval defined by the request parameters from and to follows the left-closed, right-open principle. That is, the interval includes the start time but does not include the end time. If the values of from and to are the same, the interval is invalid, and the function returns an error directly.
     * Unix timestamp format, indicating the number of seconds elapsed since 1970-01-01 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268100</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>Optional: The query statement used to filter the logs to be updated. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Query overview</a>.</p>
     * <p>Note: This parameter supports only query statements. Analysis statements such as SPL and SQL are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>status:400</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Optional: The value of the built-in field <strong>rowid</strong> that is automatically returned in the query results.</p>
     * <p>One of rowId and query must be specified. If both are specified, rowId takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>0|1000001|638732499</p>
     */
    @NameInMap("rowId")
    public String rowId;

    /**
     * <p>The end time of the query. This time refers to the log time specified when the log data was written.</p>
     * <p>The time interval defined by the request parameters from and to follows the left-closed, right-open principle. That is, the interval includes the start time but does not include the end time. If the values of from and to are the same, the interval is invalid, and the function returns an error directly.
     * Unix timestamp format, indicating the number of seconds elapsed since 1970-01-01 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268200</p>
     */
    @NameInMap("to")
    public Integer to;

    public static DeleteLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogsRequest self = new DeleteLogsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public DeleteLogsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DeleteLogsRequest setRowId(String rowId) {
        this.rowId = rowId;
        return this;
    }
    public String getRowId() {
        return this.rowId;
    }

    public DeleteLogsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
