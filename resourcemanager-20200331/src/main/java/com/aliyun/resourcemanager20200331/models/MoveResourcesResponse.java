// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class MoveResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveResourcesResponseBody body;

    public static MoveResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveResourcesResponse self = new MoveResourcesResponse();
        return TeaModel.build(map, self);
    }

    public MoveResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveResourcesResponse setBody(MoveResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveResourcesResponseBody getBody() {
        return this.body;
    }

}
