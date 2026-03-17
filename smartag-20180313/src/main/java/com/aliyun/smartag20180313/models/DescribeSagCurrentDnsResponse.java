// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagCurrentDnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSagCurrentDnsResponseBody body;

    public static DescribeSagCurrentDnsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagCurrentDnsResponse self = new DescribeSagCurrentDnsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagCurrentDnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagCurrentDnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagCurrentDnsResponse setBody(DescribeSagCurrentDnsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagCurrentDnsResponseBody getBody() {
        return this.body;
    }

}
