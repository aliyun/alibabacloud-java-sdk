// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsRequest extends TeaModel {
    @NameInMap("forward")
    public Boolean forward;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("from")
    public Integer from;

    @NameInMap("highlight")
    public Boolean highlight;

    @NameInMap("isAccurate")
    public Boolean isAccurate;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("line")
    public Long line;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Long offset;

    @NameInMap("powerSql")
    public Boolean powerSql;

    /**
     * <strong>example:</strong>
     * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("reverse")
    public Boolean reverse;

    @NameInMap("session")
    public String session;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268185</p>
     */
    @NameInMap("to")
    public Integer to;

    /**
     * <strong>example:</strong>
     * <p>topic</p>
     */
    @NameInMap("topic")
    public String topic;

    public static GetLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogsRequest self = new GetLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetLogsRequest setForward(Boolean forward) {
        this.forward = forward;
        return this;
    }
    public Boolean getForward() {
        return this.forward;
    }

    public GetLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public GetLogsRequest setHighlight(Boolean highlight) {
        this.highlight = highlight;
        return this;
    }
    public Boolean getHighlight() {
        return this.highlight;
    }

    public GetLogsRequest setIsAccurate(Boolean isAccurate) {
        this.isAccurate = isAccurate;
        return this;
    }
    public Boolean getIsAccurate() {
        return this.isAccurate;
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

    public GetLogsRequest setSession(String session) {
        this.session = session;
        return this;
    }
    public String getSession() {
        return this.session;
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
