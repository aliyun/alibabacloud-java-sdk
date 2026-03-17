// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagUserDnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSagUserDnsResponseBody body;

    public static DescribeSagUserDnsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagUserDnsResponse self = new DescribeSagUserDnsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagUserDnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagUserDnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagUserDnsResponse setBody(DescribeSagUserDnsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagUserDnsResponseBody getBody() {
        return this.body;
    }

}
