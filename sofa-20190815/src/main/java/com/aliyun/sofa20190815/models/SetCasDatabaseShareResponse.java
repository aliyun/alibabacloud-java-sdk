// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetCasDatabaseShareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetCasDatabaseShareResponseBody body;

    public static SetCasDatabaseShareResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCasDatabaseShareResponse self = new SetCasDatabaseShareResponse();
        return TeaModel.build(map, self);
    }

    public SetCasDatabaseShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCasDatabaseShareResponse setBody(SetCasDatabaseShareResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCasDatabaseShareResponseBody getBody() {
        return this.body;
    }

}
