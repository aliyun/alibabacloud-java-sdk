// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class UpdateWorkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWorkitemResponseBody body;

    public static UpdateWorkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkitemResponse self = new UpdateWorkitemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkitemResponse setBody(UpdateWorkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkitemResponseBody getBody() {
        return this.body;
    }

}
