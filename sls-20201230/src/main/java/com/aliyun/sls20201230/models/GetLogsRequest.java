// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsRequest extends TeaModel {
    /**
     * <p>The start of the query time range, based on the log time specified when the log data was written.</p>
     * <ul>
     * <li><p>The <strong>from</strong> and <strong>to</strong> parameters define a left-closed, right-open interval [from, to). If <strong>from</strong> equals <strong>to</strong>, the interval is invalid and the system returns an error.</p>
     * </li>
     * <li><p>Value: a UNIX timestamp representing the number of seconds elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To avoid missing data, align the query time to the minute level. If a time range is specified in the analytic statement, that time range takes precedence.</p>
     * </blockquote>
     * <p>To specify a time in seconds within an analytic statement, use the <a href="https://help.aliyun.com/document_detail/63451.html">from_unixtime function</a> or the <a href="https://help.aliyun.com/document_detail/63451.html">to_unixtime function</a> to convert the time format. Examples:</p>
     * <ul>
     * <li><p><code>* | SELECT * FROM log WHERE from_unixtime(__time__) &gt; from_unixtime(1664186624) AND from_unixtime(__time__) &lt; now()</code></p>
     * </li>
     * <li><p><code>* | SELECT * FROM log WHERE __time__ &gt; to_unixtime(date_parse(\\&quot;2022-10-19 15:46:05\\&quot;, \\&quot;%Y-%m-%d %H:%i:%s\\&quot;)) AND __time__ &lt; to_unixtime(now())</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>Valid only when the query parameter is a search statement. Maximum number of logs to return. Valid values: 0 to 100. Default value: 100. See <a href="https://help.aliyun.com/document_detail/89994.html">Page through query and analysis results</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("line")
    public Long line;

    /**
     * <p>Valid only when the query parameter is a search statement. The starting row for the query. Default value: 0. See <a href="https://help.aliyun.com/document_detail/89994.html">Page through query and analysis results</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <p>Whether to enable the Exclusive SQL feature. See <a href="https://help.aliyun.com/document_detail/223777.html">Enable the Exclusive SQL feature</a>.</p>
     * <ul>
     * <li><p>true: Enable Exclusive SQL.</p>
     * </li>
     * <li><p>false (default): Use standard SQL.</p>
     * </li>
     * </ul>
     * <p>Alternatively, add <code>set session parallel_sql=true;</code> to the analytic statement in the <strong>query</strong> parameter to enable Exclusive SQL.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("powerSql")
    public Boolean powerSql;

    /**
     * <p>The search statement or analytic statement. See <a href="https://help.aliyun.com/document_detail/43772.html">Query overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Analysis overview</a>. To enable the Exclusive SQL feature, add <code>set session parallel_sql=true;</code> to the analytic statement. Example: <code>* | set session parallel_sql=true; select count(*) as pv</code>. For common query and analysis issues, see <a href="https://help.aliyun.com/document_detail/61628.html">Common errors that occur when you query and analyze logs</a>.</p>
     * <blockquote>
     * <p>When the query parameter contains an analytic statement (SQL statement), the <code>line</code> and <code>offset</code> parameters are ignored. Set both to 0 and use the LIMIT clause in the SQL statement for pagination. See <a href="https://help.aliyun.com/document_detail/89994.html">Page through query and analysis results</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Whether to return logs in descending order of timestamp, with minute-level precision.</p>
     * <ul>
     * <li><p>true: Descending order (newest first).</p>
     * </li>
     * <li><p>false (default): Ascending order (oldest first).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li><p>When the query parameter is a search statement, the reverse parameter controls the sort order.</p>
     * </li>
     * <li><p>When the query parameter includes an analytic statement, the reverse parameter is ignored. Use the ORDER BY clause in the SQL statement instead. ORDER BY defaults to ascending (asc). Specify desc for descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("reverse")
    public Boolean reverse;

    /**
     * <p>The end of the query time range, based on the log time specified when the log data was written.</p>
     * <ul>
     * <li><p>The <strong>from</strong> and <strong>to</strong> parameters define a left-closed, right-open interval [from, to). If <strong>from</strong> equals <strong>to</strong>, the interval is invalid and the system returns an error.</p>
     * </li>
     * <li><p>Value: a UNIX timestamp representing the number of seconds elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To avoid missing data, align the query time to the minute level. If a time range is specified in the analytic statement, that time range takes precedence.</p>
     * </blockquote>
     * <p>To specify a time in seconds within an analytic statement, use the <a href="https://help.aliyun.com/document_detail/63451.html">from_unixtime function</a> or the <a href="https://help.aliyun.com/document_detail/63451.html">to_unixtime function</a> to convert the time format. Examples:</p>
     * <ul>
     * <li><p><code>* | SELECT * FROM log WHERE from_unixtime(__time__) &gt; from_unixtime(1664186624) AND from_unixtime(__time__) &lt; now()</code></p>
     * </li>
     * <li><p><code>* | SELECT * FROM log WHERE __time__ &gt; to_unixtime(date_parse(\\&quot;2022-10-19 15:46:05\\&quot;, \\&quot;%Y-%m-%d %H:%i:%s\\&quot;)) AND __time__ &lt; to_unixtime(now())</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627269085</p>
     */
    @NameInMap("to")
    public Integer to;

    /**
     * <p>The log topic. Default value: an empty string. See <a href="https://help.aliyun.com/document_detail/48881.html">Topic</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>topic</p>
     */
    @NameInMap("topic")
    public String topic;

    public static GetLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogsRequest self = new GetLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public GetLogsRequest setLine(Long line) {
        this.line = line;
        return this;
    }
    public Long getLine() {
        return this.line;
    }

    public GetLogsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public GetLogsRequest setPowerSql(Boolean powerSql) {
        this.powerSql = powerSql;
        return this;
    }
    public Boolean getPowerSql() {
        return this.powerSql;
    }

    public GetLogsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetLogsRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public GetLogsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public GetLogsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
