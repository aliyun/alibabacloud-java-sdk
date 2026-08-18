// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfuseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePxfuseInfoResponseBody body;

    public static DescribePxfuseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfuseInfoResponse self = new DescribePxfuseInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribePxfuseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePxfuseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePxfuseInfoResponse setBody(DescribePxfuseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePxfuseInfoResponseBody getBody() {
        return this.body;
    }

}
