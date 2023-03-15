// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListUpstreamPbcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcUpDownstreamResult body;

    public static ListUpstreamPbcResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamPbcResponse self = new ListUpstreamPbcResponse();
        return TeaModel.build(map, self);
    }

    public ListUpstreamPbcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUpstreamPbcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUpstreamPbcResponse setBody(PbcUpDownstreamResult body) {
        this.body = body;
        return this;
    }
    public PbcUpDownstreamResult getBody() {
        return this.body;
    }

}
