// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsV2Request extends TeaModel {
    /**
     * <p>Specifies whether to page forward or backward for scan or phrase queries.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forward")
    public Boolean forward;

    /**
     * <p>The start time of the query. This time refers to the log time specified when log data is written.</p>
     * <p>The time range defined by the from and to request parameters follows the left-closed, right-open principle. The time range includes the start time but excludes the end time. If the values of from and to are the same, the time range is invalid and the function returns an error.
     * The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>Specifies whether to enable highlighting.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("highlight")
    public Boolean highlight;

    /**
     * <p>Specifies whether to enable nanosecond-precision ordering.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isAccurate")
    public Boolean isAccurate;

    /**
     * <p>The maximum number of logs to return in the request. This parameter is valid only when the query parameter is a query statement (not an analytic statement). Minimum value: 0. Maximum value: 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("line")
    public Long line;

    /**
     * <p>The start row of the query. This parameter is valid only when the query parameter is a query statement (not an analytic statement). The value starts from 0. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <p>Specifies whether to enable Dedicated SQL. Disabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("powerSql")
    public Boolean powerSql;

    /**
     * <p>The query statement or analytic statement. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Query overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Analysis overview</a>.</p>
     * <p>Add set session parallel_sql=true; to the analytic statement in the query parameter to use Dedicated SQL. Example: * | set session parallel_sql=true; select count(*) as pv.</p>
     * <p>Note: When the query parameter contains an analytic statement (SQL statement), the line and offset parameters of this API are invalid. Set them to 0. Use the LIMIT syntax in the SQL statement for pagination. For more information, see Display query and analysis results by page.</p>
     * 
     * <strong>example:</strong>
     * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Specifies whether to return logs in descending order of log timestamps, accurate to the minute level. This parameter is valid only when the query parameter is a query statement (not an analytic statement).</p>
     * <ul>
     * <li>true: Returns logs in descending order of log timestamps.</li>
     * <li>false (default): Returns logs in ascending order of log timestamps.</li>
     * </ul>
     * <p>To sort results in an analytic statement, use the ORDER BY syntax. If ORDER BY is set to asc (default), the results are sorted in ascending order. If ORDER BY is set to desc, the results are sorted in descending order.</p>
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
     * <p>The end time of the query. This time refers to the log time specified when log data is written.</p>
     * <p>The time range defined by the from and to request parameters follows the left-closed, right-open principle. The time range includes the start time but excludes the end time. If the values of from and to are the same, the time range is invalid and the function returns an error.
     * The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("to")
    public Integer to;

    /**
     * <p>The topic. Default value: empty string.</p>
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
