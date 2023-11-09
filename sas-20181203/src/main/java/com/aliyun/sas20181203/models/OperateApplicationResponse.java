// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OperateApplicationResponseBody body;

    public static OperateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateApplicationResponse self = new OperateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public OperateApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateApplicationResponse setBody(OperateApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateApplicationResponseBody getBody() {
        return this.body;
    }

}
