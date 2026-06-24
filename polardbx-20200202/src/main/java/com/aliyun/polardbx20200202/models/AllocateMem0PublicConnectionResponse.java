// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AllocateMem0PublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateMem0PublicConnectionResponseBody body;

    public static AllocateMem0PublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateMem0PublicConnectionResponse self = new AllocateMem0PublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateMem0PublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateMem0PublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateMem0PublicConnectionResponse setBody(AllocateMem0PublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateMem0PublicConnectionResponseBody getBody() {
        return this.body;
    }

}
