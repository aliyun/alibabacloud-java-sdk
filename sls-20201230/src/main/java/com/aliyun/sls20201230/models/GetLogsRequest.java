// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsRequest extends TeaModel {
    /**
     * <p>The start of the time range to query. This time is the log time that is specified when the log data is written.</p>
     * <ul>
     * <li><p>The time range that is specified by the <strong>from</strong> and <strong>to</strong> parameters is a left-closed, right-open interval. The interval includes the start time but not the end time. If the values of <strong>from</strong> and <strong>to</strong> are the same, the interval is invalid. The system returns an error.</p>
     * </li>
     * <li><p>The value is a UNIX timestamp. It represents the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To make sure that no data is missed, snap the query time to the minute. If you specify a time range in an analytic statement, the time range in the analytic statement is used for the query and analysis.</p>
     * </blockquote>
     * <p>To specify a time in seconds, use the <a href="https://help.aliyun.com/document_detail/63451.html">from_unixtime function</a> or the <a href="https://help.aliyun.com/document_detail/63451.html">to_unixtime function</a> to convert the time format in the analytic statement. Examples:</p>
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
     * <p>This parameter is valid only when the query parameter is a search statement. It specifies the maximum number of logs to return for the request. The value ranges from 0 to 100. The default value is 100. For more information about paged queries, see <a href="https://help.aliyun.com/document_detail/89994.html">Page through query and analysis results</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("line")
    public Long line;

    /**
     * <p>This parameter is valid only when the query parameter is a search statement. It specifies the start line of the query. The default value is 0. For more information about paged queries, see <a href="https://help.aliyun.com/document_detail/89994.html">Page through query and analysis results</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <p>Specifies whether to use the Exclusive SQL feature. For more information, see <a href="https://help.aliyun.com/document_detail/223777.html">Enable the Exclusive SQL feature</a>.</p>
     * <ul>
     * <li><p>true: Use the Exclusive SQL feature.</p>
     * </li>
     * <li><p>false (default): Use the standard SQL feature.</p>
     * </li>
     * </ul>
     * <p>In addition to using the powerSql parameter, you can also use the <strong>query</strong> parameter to enable the Exclusive SQL feature.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("powerSql")
    public Boolean powerSql;

    /**
     * <p>The search statement or analytic statement. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Query overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Analysis overview</a>.
     * To use the Exclusive SQL feature, add <code>set session parallel_sql=true;</code> to the analytic statement in the query parameter. Example: <code>* | set session parallel_sql=true; select count(*) as pv</code>. For information about common query and analysis issues, see <a href="https://help.aliyun.com/document_detail/61628.html">Common errors that occur when you query and analyze logs</a>.</p>
     * <blockquote>
     * <p>If the query parameter contains an analytic statement (SQL statement), the line and offset parameters are invalid. We recommend that you set these parameters to 0. You must use the LIMIT clause in the SQL statement to turn pages. For more information, see <a href="https://help.aliyun.com/document_detail/89994.html">Page through query and analysis results</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Specifies whether to return logs in descending order of their timestamps. The precision is at the minute level.</p>
     * <ul>
     * <li><p>true: Returns logs in descending order of their timestamps.</p>
     * </li>
     * <li><p>false (default): Returns logs in ascending order of their timestamps.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li><p>If the query parameter is a search statement, the reverse parameter is valid and specifies the sorting order of the returned logs.</p>
     * </li>
     * <li><p>If the query parameter is a search and analytic statement, the reverse parameter is invalid. The sorting order is specified by the ORDER BY clause in the SQL analytic statement. If the ORDER BY clause specifies asc (default), the logs are sorted in ascending order. If the ORDER BY clause specifies desc, the logs are sorted in descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("reverse")
    public Boolean reverse;

    /**
     * <p>The end of the time range to query. This time is the log time that is specified when the log data is written.</p>
     * <ul>
     * <li><p>The time range that is specified by the <strong>from</strong> and <strong>to</strong> parameters is a left-closed, right-open interval. The interval includes the start time but not the end time. If the values of <strong>from</strong> and <strong>to</strong> are the same, the interval is invalid. The system returns an error.</p>
     * </li>
     * <li><p>The value is a UNIX timestamp. It represents the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To make sure that no data is missed, snap the query time to the minute. If you specify a time range in an analytic statement, the time range in the analytic statement is used for the query and analysis.</p>
     * </blockquote>
     * <p>To specify a time in seconds, use the <a href="https://help.aliyun.com/document_detail/63451.html">from_unixtime function</a> or the <a href="https://help.aliyun.com/document_detail/63451.html">to_unixtime function</a> to convert the time format in the analytic statement. Examples:</p>
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
     * <p>The topic of the logs. The default value is an empty string. For more information, see <a href="https://help.aliyun.com/document_detail/48881.html">Topic</a>.</p>
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
