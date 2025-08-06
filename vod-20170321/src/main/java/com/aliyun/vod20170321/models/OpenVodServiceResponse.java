// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class OpenVodServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenVodServiceResponseBody body;

    public static OpenVodServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenVodServiceResponse self = new OpenVodServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenVodServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenVodServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenVodServiceResponse setBody(OpenVodServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenVodServiceResponseBody getBody() {
        return this.body;
    }

}
