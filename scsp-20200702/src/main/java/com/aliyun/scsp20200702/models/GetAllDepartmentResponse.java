// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAllDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllDepartmentResponseBody body;

    public static GetAllDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllDepartmentResponse self = new GetAllDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public GetAllDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllDepartmentResponse setBody(GetAllDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllDepartmentResponseBody getBody() {
        return this.body;
    }

}
