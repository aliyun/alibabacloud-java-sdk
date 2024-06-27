// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ClearNameListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearNameListResponseBody body;

    public static ClearNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearNameListResponse self = new ClearNameListResponse();
        return TeaModel.build(map, self);
    }

    public ClearNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearNameListResponse setBody(ClearNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearNameListResponseBody getBody() {
        return this.body;
    }

}
