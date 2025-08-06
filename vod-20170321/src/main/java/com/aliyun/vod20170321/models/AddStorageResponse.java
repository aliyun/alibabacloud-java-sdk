// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddStorageResponseBody body;

    public static AddStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddStorageResponse self = new AddStorageResponse();
        return TeaModel.build(map, self);
    }

    public AddStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddStorageResponse setBody(AddStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public AddStorageResponseBody getBody() {
        return this.body;
    }

}
