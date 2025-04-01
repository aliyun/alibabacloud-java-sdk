// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCdcInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdcInfoResponseBody body;

    public static DescribeCdcInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdcInfoResponse self = new DescribeCdcInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdcInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdcInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdcInfoResponse setBody(DescribeCdcInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdcInfoResponseBody getBody() {
        return this.body;
    }

}
