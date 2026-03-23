// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsV2Request extends TeaModel {
    /**
     * <p>For a scan or phrase query, specifies whether to page forward or backward.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forward")
    public Boolean forward;

    /**
     * <p>The start of the time range to query. The value is the log time that was specified when the log was written.</p>
     * <p>The time range is a left-closed right-open interval. This means the range includes the start time but not the end time. If the from and to values are the same, the interval is invalid and an error is returned. The value is a UNIX timestamp that represents the number of seconds since 00:00:00 UTC on January 1, 1970.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>Specifies whether to highlight the results.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("highlight")
    public Boolean highlight;

    /**
     * <p>Specifies whether to enable nanosecond-level sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isAccurate")
    public Boolean isAccurate;

    /**
     * <p>The maximum number of logs to return. This parameter is valid only if the query parameter contains a query statement. The value must be an integer from 0 to 100. The default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("line")
    public Long line;

    /**
     * <p>The line number from which to start the query. This parameter is valid only if the query parameter contains a query statement. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <p>Specifies whether to enable enhanced SQL. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("powerSql")
    public Boolean powerSql;

    /**
     * <p>The query statement or analytic statement. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Query overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Analysis overview</a>.</p>
     * <p>To use the Exclusive SQL feature, add set session parallel_sql=true; to the analytic statement in the query parameter. Example: \* | set session parallel_sql=true; select count(\*) as pv.</p>
     * <p>Note: If the query parameter contains an analytic statement (SQL statement), the line and offset parameters are invalid. Set them to 0. Use the LIMIT clause in the SQL statement for paging. For more information, see Paginate query and analysis results.</p>
     * 
     * <strong>example:</strong>
     * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Specifies whether to return logs in descending order of their timestamps. The precision is at the minute level.</p>
     * <p>true: Returns logs in descending order of their timestamps.
     * false (default): Returns logs in ascending order of their timestamps.
     * Note:
     * If the query parameter contains a query statement, the reverse parameter is valid and specifies the sorting order.
     * If the query parameter contains a query and analysis statement, the reverse parameter is invalid. The sorting order is specified by the ORDER BY clause in the analytic statement. If ORDER BY is asc (default), logs are sorted in ascending order. If ORDER BY is desc, logs are sorted in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("reverse")
    public Boolean reverse;

    /**
     * <p>The query parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>mode=scan</p>
     */
    @NameInMap("session")
    public String session;

    /**
     * <p>The end of the time range to query. The value is the log time that was specified when the log was written.</p>
     * <p>The time range is a left-closed right-open interval. This means the range includes the start time but not the end time. If the from and to values are the same, the interval is invalid and an error is returned. The value is a UNIX timestamp that represents the number of seconds since 00:00:00 UTC on January 1, 1970.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("to")
    public Integer to;

    /**
     * <p>The log topic. The default value is double quotation marks (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("topic")
    public String topic;

    public static GetLogsV2Request build(java.util.Map<String, ?> map) throws Exception {
        GetLogsV2Request self = new GetLogsV2Request();
        return TeaModel.build(map, self);
    }

    public GetLogsV2Request setForward(Boolean forward) {
        this.forward = forward;
        return this;
    }
    public Boolean getForward() {
        return this.forward;
    }

    public GetLogsV2Request setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public GetLogsV2Request setHighlight(Boolean highlight) {
        this.highlight = highlight;
        return this;
    }
    public Boolean getHighlight() {
        return this.highlight;
    }

    public GetLogsV2Request setIsAccurate(Boolean isAccurate) {
        this.isAccurate = isAccurate;
        return this;
    }
    public Boolean getIsAccurate() {
        return this.isAccurate;
    }

    public GetLogsV2Request setLine(Long line) {
        this.line = line;
        return this;
    }
    public Long getLine() {
        return this.line;
    }

    public GetLogsV2Request setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public GetLogsV2Request setPowerSql(Boolean powerSql) {
        this.powerSql = powerSql;
        return this;
    }
    public Boolean getPowerSql() {
        return this.powerSql;
    }

    public GetLogsV2Request setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetLogsV2Request setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public GetLogsV2Request setSession(String session) {
        this.session = session;
        return this;
    }
    public String getSession() {
        return this.session;
    }

    public GetLogsV2Request setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public GetLogsV2Request setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
