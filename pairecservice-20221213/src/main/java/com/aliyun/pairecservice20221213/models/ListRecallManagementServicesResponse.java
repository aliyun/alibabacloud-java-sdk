// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecallManagementServicesResponseBody body;

    public static ListRecallManagementServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementServicesResponse self = new ListRecallManagementServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecallManagementServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecallManagementServicesResponse setBody(ListRecallManagementServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecallManagementServicesResponseBody getBody() {
        return this.body;
    }

}
