// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class MovePolarFsObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MovePolarFsObjectsResponseBody body;

    public static MovePolarFsObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        MovePolarFsObjectsResponse self = new MovePolarFsObjectsResponse();
        return TeaModel.build(map, self);
    }

    public MovePolarFsObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MovePolarFsObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MovePolarFsObjectsResponse setBody(MovePolarFsObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public MovePolarFsObjectsResponseBody getBody() {
        return this.body;
    }

}
