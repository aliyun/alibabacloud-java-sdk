// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbjOperateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SbjOperateResponseBody body;

    public static SbjOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        SbjOperateResponse self = new SbjOperateResponse();
        return TeaModel.build(map, self);
    }

    public SbjOperateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SbjOperateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SbjOperateResponse setBody(SbjOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public SbjOperateResponseBody getBody() {
        return this.body;
    }

}
