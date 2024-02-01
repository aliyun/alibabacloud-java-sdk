// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpPeersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBgpPeersResponseBody body;

    public static DescribeBgpPeersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPeersResponse self = new DescribeBgpPeersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPeersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBgpPeersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBgpPeersResponse setBody(DescribeBgpPeersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBgpPeersResponseBody getBody() {
        return this.body;
    }

}
