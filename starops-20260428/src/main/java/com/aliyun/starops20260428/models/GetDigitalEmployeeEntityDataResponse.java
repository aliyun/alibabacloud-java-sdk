// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeEntityDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDigitalEmployeeEntityDataResponseBody body;

    public static GetDigitalEmployeeEntityDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalEmployeeEntityDataResponse self = new GetDigitalEmployeeEntityDataResponse();
        return TeaModel.build(map, self);
    }

    public GetDigitalEmployeeEntityDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDigitalEmployeeEntityDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDigitalEmployeeEntityDataResponse setBody(GetDigitalEmployeeEntityDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDigitalEmployeeEntityDataResponseBody getBody() {
        return this.body;
    }

}
