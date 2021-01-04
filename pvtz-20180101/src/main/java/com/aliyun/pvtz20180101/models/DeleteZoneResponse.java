// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteZoneResponseBody body;

    public static DeleteZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteZoneResponse self = new DeleteZoneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteZoneResponse setBody(DeleteZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteZoneResponseBody getBody() {
        return this.body;
    }

}
