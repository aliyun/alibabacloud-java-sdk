// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AllocatePxfsPublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocatePxfsPublicConnectionResponseBody body;

    public static AllocatePxfsPublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocatePxfsPublicConnectionResponse self = new AllocatePxfsPublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocatePxfsPublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocatePxfsPublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocatePxfsPublicConnectionResponse setBody(AllocatePxfsPublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocatePxfsPublicConnectionResponseBody getBody() {
        return this.body;
    }

}
