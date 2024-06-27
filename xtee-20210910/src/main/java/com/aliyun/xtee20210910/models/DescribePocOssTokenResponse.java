// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribePocOssTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePocOssTokenResponseBody body;

    public static DescribePocOssTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePocOssTokenResponse self = new DescribePocOssTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribePocOssTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePocOssTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePocOssTokenResponse setBody(DescribePocOssTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePocOssTokenResponseBody getBody() {
        return this.body;
    }

}
