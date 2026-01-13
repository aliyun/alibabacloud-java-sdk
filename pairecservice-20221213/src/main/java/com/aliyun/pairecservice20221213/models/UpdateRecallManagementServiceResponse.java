// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecallManagementServiceResponseBody body;

    public static UpdateRecallManagementServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementServiceResponse self = new UpdateRecallManagementServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecallManagementServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecallManagementServiceResponse setBody(UpdateRecallManagementServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecallManagementServiceResponseBody getBody() {
        return this.body;
    }

}
