// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteServiceTrailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceTrailResponseBody body;

    public static DeleteServiceTrailResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTrailResponse self = new DeleteServiceTrailResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTrailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceTrailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceTrailResponse setBody(DeleteServiceTrailResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceTrailResponseBody getBody() {
        return this.body;
    }

}
