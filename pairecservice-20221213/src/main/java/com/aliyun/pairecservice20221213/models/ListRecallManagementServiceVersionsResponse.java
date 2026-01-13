// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementServiceVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecallManagementServiceVersionsResponseBody body;

    public static ListRecallManagementServiceVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementServiceVersionsResponse self = new ListRecallManagementServiceVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementServiceVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecallManagementServiceVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecallManagementServiceVersionsResponse setBody(ListRecallManagementServiceVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecallManagementServiceVersionsResponseBody getBody() {
        return this.body;
    }

}
