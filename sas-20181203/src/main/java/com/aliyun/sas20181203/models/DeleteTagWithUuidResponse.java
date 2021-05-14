// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteTagWithUuidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTagWithUuidResponseBody body;

    public static DeleteTagWithUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagWithUuidResponse self = new DeleteTagWithUuidResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagWithUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagWithUuidResponse setBody(DeleteTagWithUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagWithUuidResponseBody getBody() {
        return this.body;
    }

}
