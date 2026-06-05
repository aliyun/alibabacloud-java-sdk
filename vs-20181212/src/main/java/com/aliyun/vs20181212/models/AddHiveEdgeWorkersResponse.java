// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddHiveEdgeWorkersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddHiveEdgeWorkersResponseBody body;

    public static AddHiveEdgeWorkersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddHiveEdgeWorkersResponse self = new AddHiveEdgeWorkersResponse();
        return TeaModel.build(map, self);
    }

    public AddHiveEdgeWorkersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddHiveEdgeWorkersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddHiveEdgeWorkersResponse setBody(AddHiveEdgeWorkersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddHiveEdgeWorkersResponseBody getBody() {
        return this.body;
    }

}
