// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpLanesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpLanesPageResult body;

    public static ListPdpLanesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPdpLanesResponse self = new ListPdpLanesResponse();
        return TeaModel.build(map, self);
    }

    public ListPdpLanesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPdpLanesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPdpLanesResponse setBody(PdpLanesPageResult body) {
        this.body = body;
        return this;
    }
    public PdpLanesPageResult getBody() {
        return this.body;
    }

}
