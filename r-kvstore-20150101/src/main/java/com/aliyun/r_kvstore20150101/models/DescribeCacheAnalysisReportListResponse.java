// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisReportListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCacheAnalysisReportListResponseBody body;

    public static DescribeCacheAnalysisReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisReportListResponse self = new DescribeCacheAnalysisReportListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCacheAnalysisReportListResponse setBody(DescribeCacheAnalysisReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCacheAnalysisReportListResponseBody getBody() {
        return this.body;
    }

}
