// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckResourceSupportOperateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckResourceSupportOperateResponseBody body;

    public static CheckResourceSupportOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceSupportOperateResponse self = new CheckResourceSupportOperateResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourceSupportOperateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResourceSupportOperateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckResourceSupportOperateResponse setBody(CheckResourceSupportOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResourceSupportOperateResponseBody getBody() {
        return this.body;
    }

}
