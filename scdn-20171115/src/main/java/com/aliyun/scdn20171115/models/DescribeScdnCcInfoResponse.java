// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCcInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnCcInfoResponseBody body;

    public static DescribeScdnCcInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCcInfoResponse self = new DescribeScdnCcInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCcInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnCcInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnCcInfoResponse setBody(DescribeScdnCcInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnCcInfoResponseBody getBody() {
        return this.body;
    }

}
