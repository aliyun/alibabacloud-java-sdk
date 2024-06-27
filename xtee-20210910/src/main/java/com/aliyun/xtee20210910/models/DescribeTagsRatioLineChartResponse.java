// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsRatioLineChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagsRatioLineChartResponseBody body;

    public static DescribeTagsRatioLineChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsRatioLineChartResponse self = new DescribeTagsRatioLineChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagsRatioLineChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagsRatioLineChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagsRatioLineChartResponse setBody(DescribeTagsRatioLineChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagsRatioLineChartResponseBody getBody() {
        return this.body;
    }

}
