// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf_vpc_cloud20211115_131123360.models;

import com.aliyun.tea.*;

public class AdadaAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AdadaAResponseBody body;

    public static AdadaAResponse build(java.util.Map<String, ?> map) throws Exception {
        AdadaAResponse self = new AdadaAResponse();
        return TeaModel.build(map, self);
    }

    public AdadaAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdadaAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AdadaAResponse setBody(AdadaAResponseBody body) {
        this.body = body;
        return this;
    }
    public AdadaAResponseBody getBody() {
        return this.body;
    }

}
