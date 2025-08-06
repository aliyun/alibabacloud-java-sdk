// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteFreeLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFreeLicenseResponseBody body;

    public static DeleteFreeLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFreeLicenseResponse self = new DeleteFreeLicenseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFreeLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFreeLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFreeLicenseResponse setBody(DeleteFreeLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFreeLicenseResponseBody getBody() {
        return this.body;
    }

}
