// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateRplInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRplInspectionTaskResponseBody body;

    public static CreateRplInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRplInspectionTaskResponse self = new CreateRplInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRplInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRplInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRplInspectionTaskResponse setBody(CreateRplInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRplInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
