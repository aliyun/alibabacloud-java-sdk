// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LabelBuildResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LabelBuildResponseBody body;

    public static LabelBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        LabelBuildResponse self = new LabelBuildResponse();
        return TeaModel.build(map, self);
    }

    public LabelBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LabelBuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LabelBuildResponse setBody(LabelBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public LabelBuildResponseBody getBody() {
        return this.body;
    }

}
