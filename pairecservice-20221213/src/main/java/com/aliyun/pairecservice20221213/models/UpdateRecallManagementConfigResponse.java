// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecallManagementConfigResponseBody body;

    public static UpdateRecallManagementConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementConfigResponse self = new UpdateRecallManagementConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecallManagementConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecallManagementConfigResponse setBody(UpdateRecallManagementConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecallManagementConfigResponseBody getBody() {
        return this.body;
    }

}
