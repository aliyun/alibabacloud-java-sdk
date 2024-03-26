// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateMediaStorageClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaStorageClassResponseBody body;

    public static UpdateMediaStorageClassResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaStorageClassResponse self = new UpdateMediaStorageClassResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaStorageClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaStorageClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaStorageClassResponse setBody(UpdateMediaStorageClassResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaStorageClassResponseBody getBody() {
        return this.body;
    }

}
