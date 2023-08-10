// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CheckSharingWithResourceDirectoryStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckSharingWithResourceDirectoryStatusResponseBody body;

    public static CheckSharingWithResourceDirectoryStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSharingWithResourceDirectoryStatusResponse self = new CheckSharingWithResourceDirectoryStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckSharingWithResourceDirectoryStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSharingWithResourceDirectoryStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSharingWithResourceDirectoryStatusResponse setBody(CheckSharingWithResourceDirectoryStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSharingWithResourceDirectoryStatusResponseBody getBody() {
        return this.body;
    }

}
