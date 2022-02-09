// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TempModifyDBNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TempModifyDBNodeResponseBody body;

    public static TempModifyDBNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        TempModifyDBNodeResponse self = new TempModifyDBNodeResponse();
        return TeaModel.build(map, self);
    }

    public TempModifyDBNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TempModifyDBNodeResponse setBody(TempModifyDBNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public TempModifyDBNodeResponseBody getBody() {
        return this.body;
    }

}
