// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementTableVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecallManagementTableVersionsResponseBody body;

    public static ListRecallManagementTableVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementTableVersionsResponse self = new ListRecallManagementTableVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementTableVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecallManagementTableVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecallManagementTableVersionsResponse setBody(ListRecallManagementTableVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecallManagementTableVersionsResponseBody getBody() {
        return this.body;
    }

}
