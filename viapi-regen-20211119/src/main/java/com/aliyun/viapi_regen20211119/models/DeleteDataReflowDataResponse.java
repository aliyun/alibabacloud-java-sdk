// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteDataReflowDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDataReflowDataResponseBody body;

    public static DeleteDataReflowDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataReflowDataResponse self = new DeleteDataReflowDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataReflowDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataReflowDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataReflowDataResponse setBody(DeleteDataReflowDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataReflowDataResponseBody getBody() {
        return this.body;
    }

}
