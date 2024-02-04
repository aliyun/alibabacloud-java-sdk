// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartProjectsByLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartProjectsByLabelResponseBody body;

    public static StartProjectsByLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        StartProjectsByLabelResponse self = new StartProjectsByLabelResponse();
        return TeaModel.build(map, self);
    }

    public StartProjectsByLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartProjectsByLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartProjectsByLabelResponse setBody(StartProjectsByLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public StartProjectsByLabelResponseBody getBody() {
        return this.body;
    }

}
