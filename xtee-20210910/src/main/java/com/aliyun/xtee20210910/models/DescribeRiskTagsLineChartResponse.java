// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRiskTagsLineChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskTagsLineChartResponseBody body;

    public static DescribeRiskTagsLineChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskTagsLineChartResponse self = new DescribeRiskTagsLineChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskTagsLineChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskTagsLineChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskTagsLineChartResponse setBody(DescribeRiskTagsLineChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskTagsLineChartResponseBody getBody() {
        return this.body;
    }

}
