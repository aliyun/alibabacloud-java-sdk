// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktStatisticsRequest extends TeaModel {
    @NameInMap("From")
    public Long from;

    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("To")
    public Long to;

    public static QueryLinkeLinktStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktStatisticsRequest self = new QueryLinkeLinktStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktStatisticsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryLinkeLinktStatisticsRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public QueryLinkeLinktStatisticsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public QueryLinkeLinktStatisticsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
