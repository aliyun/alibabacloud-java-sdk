// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseMem0PublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseMem0PublicConnectionResponseBody body;

    public static ReleaseMem0PublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseMem0PublicConnectionResponse self = new ReleaseMem0PublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseMem0PublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseMem0PublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseMem0PublicConnectionResponse setBody(ReleaseMem0PublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseMem0PublicConnectionResponseBody getBody() {
        return this.body;
    }

}
