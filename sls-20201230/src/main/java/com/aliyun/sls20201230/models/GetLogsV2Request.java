// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsV2Request extends TeaModel {
    /**
     * <p>Specifies whether to page forward or backward for the scan-based query or phrase search.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forward")
    public Boolean forward;

    /**
     * <p>The beginning of the time range to query. The value is the log time that is specified when log data is written.</p>
     * <p>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the from parameter, but does not include the end time specified by the to parameter. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned. The value is a timestamp that follows the UNIX time format. It is the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>Specifies whether to highlight the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("highlight")
    public Boolean highlight;

    /**
     * <p>The maximum number of logs to return for the request. This parameter takes effect only when the query parameter is set to a search statement. Valid values: 0 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("line")
    public Long line;

    /**
     * <p>The line from which the query starts. This parameter takes effect only when the query parameter is set to a search statement. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <p>Specifies whether to enable the SQL enhancement feature. By default, the feature is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("powerSql")
    public Boolean powerSql;

    /**
     * <p>The search statement or query statement. For more information, see the &quot;Log search overview&quot; and &quot;Log analysis overview&quot; topics.</p>
     * <p>If you add set session parallel_sql=true; to the analytic statement in the query parameter, Dedicated SQL is used. Example: \* | set session parallel_sql=true; select count(\*) as pv.</p>
     * <p>Note: If you specify an analytic statement in the query parameter, the line and offset parameters do not take effect in this operation. In this case, we recommend that you set the line and offset parameters to 0 and use the LIMIT clause to specify the number of logs to return on each page. For more information, see the &quot;Perform paged queries&quot; topic.</p>
     * 
     * <strong>example:</strong>
     * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Specifies whether to return logs in reverse chronological order of log timestamps. The log timestamps are accurate to minutes. Valid values:</p>
     * <p>true: Logs are returned in reverse chronological order of log timestamps. false (default): Logs are returned in chronological order of log timestamps. Note: The reverse parameter takes effect only when the query parameter is set to a search statement. The reverse parameter specifies the method used to sort returned logs. If the query parameter is set to a query statement, the reverse parameter does not take effect. The method used to sort returned logs is specified by the ORDER BY clause in the analytic statement. If you use the keyword asc in the ORDER BY clause, the logs are sorted in chronological order. If you use the keyword desc in the ORDER BY clause, the logs are sorted in reverse chronological order. By default, asc is used in the ORDER BY clause.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("reverse")
    public Boolean reverse;

    /**
     * <p>The parameter that is used to query data.</p>
     * 
     * <strong>example:</strong>
     * <p>mode=scan</p>
     */
    @NameInMap("session")
    public String session;

    /**
     * <p>The end of the time range to query. The value is the log time that is specified when log data is written.</p>
     * <p>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the from parameter, but does not include the end time specified by the to parameter. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned. The value is a timestamp that follows the UNIX time format. It is the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("to")
    public Integer to;

    /**
     * <p>The topic of the logs. Default value: double quotation marks (&quot;&quot;).</p>
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
