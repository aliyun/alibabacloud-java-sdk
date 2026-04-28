// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateInstanceInspectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceInspectionResponseBody body;

    public static CreateInstanceInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceInspectionResponse self = new CreateInstanceInspectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceInspectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceInspectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceInspectionResponse setBody(CreateInstanceInspectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceInspectionResponseBody getBody() {
        return this.body;
    }

}
