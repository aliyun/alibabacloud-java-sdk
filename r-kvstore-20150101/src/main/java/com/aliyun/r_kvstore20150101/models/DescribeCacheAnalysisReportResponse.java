// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCacheAnalysisReportResponse setBody(DescribeCacheAnalysisReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCacheAnalysisReportResponseBody getBody() {
        return this.body;
    }

}
