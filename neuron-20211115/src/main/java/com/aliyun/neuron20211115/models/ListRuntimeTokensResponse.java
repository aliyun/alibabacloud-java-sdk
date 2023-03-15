// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListRuntimeTokensResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpListTokenResult body;

    public static ListRuntimeTokensResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuntimeTokensResponse self = new ListRuntimeTokensResponse();
        return TeaModel.build(map, self);
    }

    public ListRuntimeTokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRuntimeTokensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRuntimeTokensResponse setBody(PdpListTokenResult body) {
        this.body = body;
        return this;
    }
    public PdpListTokenResult getBody() {
        return this.body;
    }

}
