// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpNetworksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBgpNetworksResponseBody body;

    public static DescribeBgpNetworksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpNetworksResponse self = new DescribeBgpNetworksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpNetworksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBgpNetworksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBgpNetworksResponse setBody(DescribeBgpNetworksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBgpNetworksResponseBody getBody() {
        return this.body;
    }

}
