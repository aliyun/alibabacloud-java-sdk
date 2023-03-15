// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpConfigPageResult body;

    public static ListPdpConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPdpConfigsResponse self = new ListPdpConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListPdpConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPdpConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPdpConfigsResponse setBody(PdpConfigPageResult body) {
        this.body = body;
        return this;
    }
    public PdpConfigPageResult getBody() {
        return this.body;
    }

}
