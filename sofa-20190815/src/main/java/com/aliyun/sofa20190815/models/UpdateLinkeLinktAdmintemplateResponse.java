// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktAdmintemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktAdmintemplateResponseBody body;

    public static UpdateLinkeLinktAdmintemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktAdmintemplateResponse self = new UpdateLinkeLinktAdmintemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktAdmintemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktAdmintemplateResponse setBody(UpdateLinkeLinktAdmintemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktAdmintemplateResponseBody getBody() {
        return this.body;
    }

}
