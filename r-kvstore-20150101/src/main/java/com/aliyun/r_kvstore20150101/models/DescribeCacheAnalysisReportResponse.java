// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCacheAnalysisReportResponseBody body;

    public static DescribeCacheAnalysisReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisReportResponse self = new DescribeCacheAnalysisReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCacheAnalysisReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCacheAnalysisReportResponse setBody(DescribeCacheAnalysisReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCacheAnalysisReportResponseBody getBody() {
        return this.body;
    }

}
