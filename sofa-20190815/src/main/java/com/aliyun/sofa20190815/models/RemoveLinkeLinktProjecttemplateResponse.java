// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktProjecttemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeLinktProjecttemplateResponseBody body;

    public static RemoveLinkeLinktProjecttemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktProjecttemplateResponse self = new RemoveLinkeLinktProjecttemplateResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktProjecttemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeLinktProjecttemplateResponse setBody(RemoveLinkeLinktProjecttemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeLinktProjecttemplateResponseBody getBody() {
        return this.body;
    }

}
