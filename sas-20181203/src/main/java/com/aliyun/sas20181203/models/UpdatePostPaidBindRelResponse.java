// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePostPaidBindRelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePostPaidBindRelResponseBody body;

    public static UpdatePostPaidBindRelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostPaidBindRelResponse self = new UpdatePostPaidBindRelResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePostPaidBindRelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePostPaidBindRelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePostPaidBindRelResponse setBody(UpdatePostPaidBindRelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePostPaidBindRelResponseBody getBody() {
        return this.body;
    }

}
