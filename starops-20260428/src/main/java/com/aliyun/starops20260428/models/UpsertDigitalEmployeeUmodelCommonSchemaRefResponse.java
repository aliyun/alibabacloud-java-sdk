// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class UpsertDigitalEmployeeUmodelCommonSchemaRefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody body;

    public static UpsertDigitalEmployeeUmodelCommonSchemaRefResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertDigitalEmployeeUmodelCommonSchemaRefResponse self = new UpsertDigitalEmployeeUmodelCommonSchemaRefResponse();
        return TeaModel.build(map, self);
    }

    public UpsertDigitalEmployeeUmodelCommonSchemaRefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertDigitalEmployeeUmodelCommonSchemaRefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertDigitalEmployeeUmodelCommonSchemaRefResponse setBody(UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody getBody() {
        return this.body;
    }

}
