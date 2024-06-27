// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisColumnListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAnalysisColumnListResponseBody body;

    public static DescribeAnalysisColumnListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisColumnListResponse self = new DescribeAnalysisColumnListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisColumnListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnalysisColumnListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAnalysisColumnListResponse setBody(DescribeAnalysisColumnListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnalysisColumnListResponseBody getBody() {
        return this.body;
    }

}
