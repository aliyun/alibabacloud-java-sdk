// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineRecallManagementServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnlineRecallManagementServiceResponseBody body;

    public static OnlineRecallManagementServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineRecallManagementServiceResponse self = new OnlineRecallManagementServiceResponse();
        return TeaModel.build(map, self);
    }

    public OnlineRecallManagementServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineRecallManagementServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnlineRecallManagementServiceResponse setBody(OnlineRecallManagementServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineRecallManagementServiceResponseBody getBody() {
        return this.body;
    }

}
