// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleInfoResponseBody body;

    public static DescribeSampleInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleInfoResponse self = new DescribeSampleInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleInfoResponse setBody(DescribeSampleInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleInfoResponseBody getBody() {
        return this.body;
    }

}
