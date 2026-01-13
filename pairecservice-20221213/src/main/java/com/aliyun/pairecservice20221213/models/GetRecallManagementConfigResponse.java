// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecallManagementConfigResponseBody body;

    public static GetRecallManagementConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementConfigResponse self = new GetRecallManagementConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecallManagementConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecallManagementConfigResponse setBody(GetRecallManagementConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecallManagementConfigResponseBody getBody() {
        return this.body;
    }

}
