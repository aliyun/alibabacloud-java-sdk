// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisColumnFieldListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAnalysisColumnFieldListResponseBody body;

    public static DescribeAnalysisColumnFieldListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisColumnFieldListResponse self = new DescribeAnalysisColumnFieldListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisColumnFieldListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnalysisColumnFieldListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAnalysisColumnFieldListResponse setBody(DescribeAnalysisColumnFieldListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnalysisColumnFieldListResponseBody getBody() {
        return this.body;
    }

}
