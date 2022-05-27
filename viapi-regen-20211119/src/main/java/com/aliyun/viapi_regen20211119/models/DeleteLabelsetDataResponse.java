// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteLabelsetDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLabelsetDataResponseBody body;

    public static DeleteLabelsetDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelsetDataResponse self = new DeleteLabelsetDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLabelsetDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLabelsetDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLabelsetDataResponse setBody(DeleteLabelsetDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLabelsetDataResponseBody getBody() {
        return this.body;
    }

}
