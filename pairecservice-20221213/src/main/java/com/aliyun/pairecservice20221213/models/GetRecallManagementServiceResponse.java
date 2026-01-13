// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecallManagementServiceResponseBody body;

    public static GetRecallManagementServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementServiceResponse self = new GetRecallManagementServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecallManagementServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecallManagementServiceResponse setBody(GetRecallManagementServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecallManagementServiceResponseBody getBody() {
        return this.body;
    }

}
