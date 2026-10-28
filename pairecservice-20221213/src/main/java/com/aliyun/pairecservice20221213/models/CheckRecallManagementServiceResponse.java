// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckRecallManagementServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckRecallManagementServiceResponseBody body;

    public static CheckRecallManagementServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRecallManagementServiceResponse self = new CheckRecallManagementServiceResponse();
        return TeaModel.build(map, self);
    }

    public CheckRecallManagementServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRecallManagementServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckRecallManagementServiceResponse setBody(CheckRecallManagementServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRecallManagementServiceResponseBody getBody() {
        return this.body;
    }

}
