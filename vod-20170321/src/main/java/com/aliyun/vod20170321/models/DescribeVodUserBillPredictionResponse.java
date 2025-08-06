// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserBillPredictionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodUserBillPredictionResponseBody body;

    public static DescribeVodUserBillPredictionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserBillPredictionResponse self = new DescribeVodUserBillPredictionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserBillPredictionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodUserBillPredictionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodUserBillPredictionResponse setBody(DescribeVodUserBillPredictionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodUserBillPredictionResponseBody getBody() {
        return this.body;
    }

}
