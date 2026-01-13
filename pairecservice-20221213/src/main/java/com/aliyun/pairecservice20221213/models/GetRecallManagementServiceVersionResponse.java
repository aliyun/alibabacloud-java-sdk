// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecallManagementServiceVersionResponseBody body;

    public static GetRecallManagementServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementServiceVersionResponse self = new GetRecallManagementServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecallManagementServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecallManagementServiceVersionResponse setBody(GetRecallManagementServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecallManagementServiceVersionResponseBody getBody() {
        return this.body;
    }

}
