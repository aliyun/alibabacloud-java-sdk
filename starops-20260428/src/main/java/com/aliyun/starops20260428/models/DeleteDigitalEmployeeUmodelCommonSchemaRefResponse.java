// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class DeleteDigitalEmployeeUmodelCommonSchemaRefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody body;

    public static DeleteDigitalEmployeeUmodelCommonSchemaRefResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDigitalEmployeeUmodelCommonSchemaRefResponse self = new DeleteDigitalEmployeeUmodelCommonSchemaRefResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDigitalEmployeeUmodelCommonSchemaRefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDigitalEmployeeUmodelCommonSchemaRefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDigitalEmployeeUmodelCommonSchemaRefResponse setBody(DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody getBody() {
        return this.body;
    }

}
