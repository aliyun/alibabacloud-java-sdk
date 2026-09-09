// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeUmodelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDigitalEmployeeUmodelResponseBody body;

    public static GetDigitalEmployeeUmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalEmployeeUmodelResponse self = new GetDigitalEmployeeUmodelResponse();
        return TeaModel.build(map, self);
    }

    public GetDigitalEmployeeUmodelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDigitalEmployeeUmodelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDigitalEmployeeUmodelResponse setBody(GetDigitalEmployeeUmodelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDigitalEmployeeUmodelResponseBody getBody() {
        return this.body;
    }

}
