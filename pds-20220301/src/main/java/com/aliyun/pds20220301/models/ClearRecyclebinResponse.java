// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ClearRecyclebinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearRecyclebinResponseBody body;

    public static ClearRecyclebinResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearRecyclebinResponse self = new ClearRecyclebinResponse();
        return TeaModel.build(map, self);
    }

    public ClearRecyclebinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearRecyclebinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearRecyclebinResponse setBody(ClearRecyclebinResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearRecyclebinResponseBody getBody() {
        return this.body;
    }

}
