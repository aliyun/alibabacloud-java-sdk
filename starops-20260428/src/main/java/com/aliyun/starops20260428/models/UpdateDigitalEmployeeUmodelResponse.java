// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeUmodelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDigitalEmployeeUmodelResponseBody body;

    public static UpdateDigitalEmployeeUmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDigitalEmployeeUmodelResponse self = new UpdateDigitalEmployeeUmodelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDigitalEmployeeUmodelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDigitalEmployeeUmodelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDigitalEmployeeUmodelResponse setBody(UpdateDigitalEmployeeUmodelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDigitalEmployeeUmodelResponseBody getBody() {
        return this.body;
    }

}
