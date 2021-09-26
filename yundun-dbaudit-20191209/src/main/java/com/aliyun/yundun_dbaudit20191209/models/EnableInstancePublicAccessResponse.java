// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20191209.models;

import com.aliyun.tea.*;

public class EnableInstancePublicAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EnableInstancePublicAccessResponse setBody(EnableInstancePublicAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableInstancePublicAccessResponseBody getBody() {
        return this.body;
    }

}
