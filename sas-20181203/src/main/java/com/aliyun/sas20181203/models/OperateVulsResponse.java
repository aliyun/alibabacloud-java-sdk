// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateVulsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateVulsResponseBody body;

    public static OperateVulsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateVulsResponse self = new OperateVulsResponse();
        return TeaModel.build(map, self);
    }

    public OperateVulsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateVulsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateVulsResponse setBody(OperateVulsResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateVulsResponseBody getBody() {
        return this.body;
    }

}
