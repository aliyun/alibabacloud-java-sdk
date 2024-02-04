// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class EnableSharingWithResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSharingWithResourceDirectoryResponseBody body;

    public static EnableSharingWithResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSharingWithResourceDirectoryResponse self = new EnableSharingWithResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public EnableSharingWithResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSharingWithResourceDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSharingWithResourceDirectoryResponse setBody(EnableSharingWithResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSharingWithResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
