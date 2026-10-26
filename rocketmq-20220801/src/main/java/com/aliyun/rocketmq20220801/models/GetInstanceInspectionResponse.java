// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceInspectionResponseBody body;

    public static GetInstanceInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionResponse self = new GetInstanceInspectionResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceInspectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceInspectionResponse setBody(GetInstanceInspectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceInspectionResponseBody getBody() {
        return this.body;
    }

}
