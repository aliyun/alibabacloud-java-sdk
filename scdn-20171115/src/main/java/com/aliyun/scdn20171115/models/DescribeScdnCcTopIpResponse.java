// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCcTopIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnCcTopIpResponseBody body;

    public static DescribeScdnCcTopIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCcTopIpResponse self = new DescribeScdnCcTopIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCcTopIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnCcTopIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnCcTopIpResponse setBody(DescribeScdnCcTopIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnCcTopIpResponseBody getBody() {
        return this.body;
    }

}
