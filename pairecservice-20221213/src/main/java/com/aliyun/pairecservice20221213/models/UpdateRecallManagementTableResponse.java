// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecallManagementTableResponseBody body;

    public static UpdateRecallManagementTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementTableResponse self = new UpdateRecallManagementTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecallManagementTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecallManagementTableResponse setBody(UpdateRecallManagementTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecallManagementTableResponseBody getBody() {
        return this.body;
    }

}
