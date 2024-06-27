// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionRatioLineChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScoreSectionRatioLineChartResponseBody body;

    public static DescribeScoreSectionRatioLineChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreSectionRatioLineChartResponse self = new DescribeScoreSectionRatioLineChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScoreSectionRatioLineChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScoreSectionRatioLineChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScoreSectionRatioLineChartResponse setBody(DescribeScoreSectionRatioLineChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScoreSectionRatioLineChartResponseBody getBody() {
        return this.body;
    }

}
