// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribePocDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePocDetailResponseBody body;

    public static DescribePocDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePocDetailResponse self = new DescribePocDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePocDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePocDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePocDetailResponse setBody(DescribePocDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePocDetailResponseBody getBody() {
        return this.body;
    }

}
