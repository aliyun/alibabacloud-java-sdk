// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPdpHistoryConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpHistoryConfig body;

    public static GetPdpHistoryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPdpHistoryConfigResponse self = new GetPdpHistoryConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetPdpHistoryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPdpHistoryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPdpHistoryConfigResponse setBody(PdpHistoryConfig body) {
        this.body = body;
        return this;
    }
    public PdpHistoryConfig getBody() {
        return this.body;
    }

}
