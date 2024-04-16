// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class DescribeDomainReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainReportResponseBody body;

    public static DescribeDomainReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainReportResponse self = new DescribeDomainReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainReportResponse setBody(DescribeDomainReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainReportResponseBody getBody() {
        return this.body;
    }

}
