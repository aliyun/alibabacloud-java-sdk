// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class EnableInstancePublicAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableInstancePublicAccessResponseBody body;

    public static EnableInstancePublicAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableInstancePublicAccessResponse self = new EnableInstancePublicAccessResponse();
        return TeaModel.build(map, self);
    }

    public EnableInstancePublicAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableInstancePublicAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableInstancePublicAccessResponse setBody(EnableInstancePublicAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableInstancePublicAccessResponseBody getBody() {
        return this.body;
    }

}
