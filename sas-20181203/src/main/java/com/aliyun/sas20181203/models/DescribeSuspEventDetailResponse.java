// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSuspEventDetailResponseBody body;

    public static DescribeSuspEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventDetailResponse self = new DescribeSuspEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspEventDetailResponse setBody(DescribeSuspEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventDetailResponseBody getBody() {
        return this.body;
    }

}
