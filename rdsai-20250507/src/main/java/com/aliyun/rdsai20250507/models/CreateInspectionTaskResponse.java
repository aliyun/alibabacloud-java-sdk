// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInspectionTaskResponseBody body;

    public static CreateInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectionTaskResponse self = new CreateInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInspectionTaskResponse setBody(CreateInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
