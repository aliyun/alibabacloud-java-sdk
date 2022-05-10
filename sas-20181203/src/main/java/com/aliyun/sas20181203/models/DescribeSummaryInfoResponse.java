// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSummaryInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSummaryInfoResponseBody body;

    public static DescribeSummaryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryInfoResponse self = new DescribeSummaryInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSummaryInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSummaryInfoResponse setBody(DescribeSummaryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSummaryInfoResponseBody getBody() {
        return this.body;
    }

}
