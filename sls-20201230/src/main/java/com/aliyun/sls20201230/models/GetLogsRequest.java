// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. The value is the log time that is specified when log data is written.</p>
     * <ul>
     * <li>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the <strong>from</strong> parameter, but does not include the end time specified by the <strong>to</strong> parameter. If you specify the same value for the <strong>from</strong> and <strong>to</strong> parameters, the interval is invalid, and an error message is returned.</li>
     * <li>The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
     * </ul>
     * <blockquote>
     * <p>To ensure that full data can be queried, specify a query time range that is accurate to the minute. If you also specify a time range in an analytic statement, Simple Log Service uses the time range specified in the analytic statement for query and analysis.</p>
     * </blockquote>
     * <p>If you want to specify a time range that is accurate to the second in your analytic statement, you must use the from_unixtime or to_unixtime function to convert the time format. For more information about the functions, see <a href="https://help.aliyun.com/document_detail/63451.html">from_unixtime function</a> and <a href="https://help.aliyun.com/document_detail/63451.html">to_unixtime function</a>. Examples:</p>
     * <ul>
     * <li><code>* | SELECT * FROM log WHERE from_unixtime(__time__) &gt; from_unixtime(1664186624) AND from_unixtime(__time__) &lt; now()</code></li>
     * <li><code>* | SELECT * FROM log WHERE __time__ &gt; to_unixtime(date_parse(\\&quot;2022-10-19 15:46:05\\&quot;, \\&quot;%Y-%m-%d %H:%i:%s\\&quot;)) AND __time__ &lt; to_unixtime(now())</code></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>The maximum number of logs to return for the request. This parameter takes effect only when the query parameter is set to a search statement. Minimum value: 0. Maximum value: 100. Default value: 100. For more information, see <a href="https://help.aliyun.com/document_detail/89994.html">Perform paged queries</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("line")
    public Long line;

    /**
     * <p>The line from which the query starts. This parameter takes effect only when the query parameter is set to a search statement. Default value: 0. For more information, see <a href="https://help.aliyun.com/document_detail/89994.html">Perform paged queries</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <p>Specifies whether to enable the Dedicated SQL feature. For more information, see <a href="https://help.aliyun.com/document_detail/223777.html">Enable Dedicated SQL</a>. Valid values:</p>
     * <ul>
     * <li>true: enables the Dedicated SQL feature.</li>
     * <li>false (default): enables the Standard SQL feature.</li>
     * </ul>
     * <p>You can use the powerSql or <strong>query</strong> parameter to configure Dedicated SQL.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("powerSql")
    public Boolean powerSql;

    /**
     * <p>The search statement or the query statement. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>. If you add <code>set session parallel_sql=true;</code> to the analytic statement in the query parameter, Dedicated SQL is used. For example, you can set the query parameter to <code>* | set session parallel_sql=true; select count(*) as pv</code>. For more information about common errors that may occur during log query and analysis, see <a href="https://help.aliyun.com/document_detail/61628.html">How do I resolve common errors that occur when I query and analyze logs?</a></p>
     * <blockquote>
     * <p>If you specify an analytic statement in the value of the query parameter, the line and offset parameters do not take effect. In this case, we recommend that you set the line and offset parameters to 0 and use the LIMIT clause to limit the number of logs to return on each page. For more information, see <a href="https://help.aliyun.com/document_detail/89994.html">Paged query</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Specifies whether to return logs in reverse chronological order of log timestamps. The log timestamps are accurate to the minute. Valid values:</p>
     * <ul>
     * <li>true: returns logs in reverse chronological order of log timestamps.</li>
     * <li>false (default): returns logs in chronological order of log timestamps.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The reverse parameter takes effect only when the query parameter is set to a search statement. The reverse parameter specifies the method used to sort returned logs.</li>
     * <li>If the query parameter is set to a query statement, the reverse parameter does not take effect. The method used to sort returned logs is specified by the ORDER BY clause in the analytic statement. If you use the keyword asc in the ORDER BY clause, the logs are sorted in chronological order. If you use the keyword desc in the ORDER BY clause, the logs are sorted in reverse chronological order. By default, asc is used in the ORDER BY clause.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("reverse")
    public Boolean reverse;

    /**
     * <p>The end of the time range to query. The value is the log time that is specified when log data is written.</p>
     * <ul>
     * <li>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the <strong>from</strong> parameter, but does not include the end time specified by the <strong>to</strong> parameter. If you specify the same value for the <strong>from</strong> and <strong>to</strong> parameters, the interval is invalid, and an error message is returned.</li>
     * <li>The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
     * </ul>
     * <blockquote>
     * <p>To ensure that full data can be queried, specify a query time range that is accurate to the minute. If you also specify a time range in an analytic statement, Simple Log Service uses the time range specified in the analytic statement for query and analysis.</p>
     * </blockquote>
     * <p>If you want to specify a time range that is accurate to the second in your analytic statement, you must use the from_unixtime or to_unixtime function to convert the time format. For more information about the functions, see <a href="https://help.aliyun.com/document_detail/63451.html">from_unixtime function</a> and <a href="https://help.aliyun.com/document_detail/63451.html">to_unixtime function</a>. Examples:</p>
     * <ul>
     * <li><code>* | SELECT * FROM log WHERE from_unixtime(__time__) &gt; from_unixtime(1664186624) AND from_unixtime(__time__) &lt; now()</code></li>
     * <li><code>* | SELECT * FROM log WHERE __time__ &gt; to_unixtime(date_parse(\\&quot;2022-10-19 15:46:05\\&quot;, \\&quot;%Y-%m-%d %H:%i:%s\\&quot;)) AND __time__ &lt; to_unixtime(now())</code></li>
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
