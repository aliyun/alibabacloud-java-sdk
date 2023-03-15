// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDownstreamPbcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcUpDownstreamResult body;

    public static ListDownstreamPbcResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDownstreamPbcResponse self = new ListDownstreamPbcResponse();
        return TeaModel.build(map, self);
    }

    public ListDownstreamPbcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDownstreamPbcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDownstreamPbcResponse setBody(PbcUpDownstreamResult body) {
        this.body = body;
        return this;
    }
    public PbcUpDownstreamResult getBody() {
        return this.body;
    }

}
