// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListEnvInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpListEnvInfoResult body;

    public static ListEnvInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvInfosResponse self = new ListEnvInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvInfosResponse setBody(PdpListEnvInfoResult body) {
        this.body = body;
        return this;
    }
    public PdpListEnvInfoResult getBody() {
        return this.body;
    }

}
