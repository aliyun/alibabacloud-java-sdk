// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfsInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePxfsInfoResponseBody body;

    public static DescribePxfsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfsInfoResponse self = new DescribePxfsInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribePxfsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePxfsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePxfsInfoResponse setBody(DescribePxfsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePxfsInfoResponseBody getBody() {
        return this.body;
    }

}
