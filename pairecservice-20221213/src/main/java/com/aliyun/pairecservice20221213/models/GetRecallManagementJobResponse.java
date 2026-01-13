// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecallManagementJobResponseBody body;

    public static GetRecallManagementJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementJobResponse self = new GetRecallManagementJobResponse();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecallManagementJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecallManagementJobResponse setBody(GetRecallManagementJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecallManagementJobResponseBody getBody() {
        return this.body;
    }

}
