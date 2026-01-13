// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ChangeRecallManagementServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeRecallManagementServiceVersionResponseBody body;

    public static ChangeRecallManagementServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeRecallManagementServiceVersionResponse self = new ChangeRecallManagementServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public ChangeRecallManagementServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeRecallManagementServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeRecallManagementServiceVersionResponse setBody(ChangeRecallManagementServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeRecallManagementServiceVersionResponseBody getBody() {
        return this.body;
    }

}
