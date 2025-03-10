// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoDRMLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoDRMLicenseResponseBody body;

    public static VideoDRMLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoDRMLicenseResponse self = new VideoDRMLicenseResponse();
        return TeaModel.build(map, self);
    }

    public VideoDRMLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoDRMLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoDRMLicenseResponse setBody(VideoDRMLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoDRMLicenseResponseBody getBody() {
        return this.body;
    }

}
