// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteInstanceInspectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstanceInspectionResponseBody body;

    public static DeleteInstanceInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceInspectionResponse self = new DeleteInstanceInspectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceInspectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceInspectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceInspectionResponse setBody(DeleteInstanceInspectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceInspectionResponseBody getBody() {
        return this.body;
    }

}
