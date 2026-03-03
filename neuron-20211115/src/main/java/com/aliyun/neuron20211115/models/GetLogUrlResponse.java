// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLogUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpSlsLogInfo body;

    public static GetLogUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogUrlResponse self = new GetLogUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetLogUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogUrlResponse setBody(PdpSlsLogInfo body) {
        this.body = body;
        return this;
    }
    public PdpSlsLogInfo getBody() {
        return this.body;
    }

}
