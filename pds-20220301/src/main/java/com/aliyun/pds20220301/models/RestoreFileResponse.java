// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RestoreFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreFileResponseBody body;

    public static RestoreFileResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreFileResponse self = new RestoreFileResponse();
        return TeaModel.build(map, self);
    }

    public RestoreFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreFileResponse setBody(RestoreFileResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreFileResponseBody getBody() {
        return this.body;
    }

}
