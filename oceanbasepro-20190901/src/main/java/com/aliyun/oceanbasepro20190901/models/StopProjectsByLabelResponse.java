// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopProjectsByLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopProjectsByLabelResponseBody body;

    public static StopProjectsByLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        StopProjectsByLabelResponse self = new StopProjectsByLabelResponse();
        return TeaModel.build(map, self);
    }

    public StopProjectsByLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopProjectsByLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopProjectsByLabelResponse setBody(StopProjectsByLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public StopProjectsByLabelResponseBody getBody() {
        return this.body;
    }

}
