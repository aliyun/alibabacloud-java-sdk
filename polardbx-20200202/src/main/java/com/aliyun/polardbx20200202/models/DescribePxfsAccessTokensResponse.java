// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfsAccessTokensResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePxfsAccessTokensResponseBody body;

    public static DescribePxfsAccessTokensResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfsAccessTokensResponse self = new DescribePxfsAccessTokensResponse();
        return TeaModel.build(map, self);
    }

    public DescribePxfsAccessTokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePxfsAccessTokensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePxfsAccessTokensResponse setBody(DescribePxfsAccessTokensResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePxfsAccessTokensResponseBody getBody() {
        return this.body;
    }

}
