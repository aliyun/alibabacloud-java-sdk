// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AllocateReadWriteSplittingConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateReadWriteSplittingConnectionResponseBody body;

    public static AllocateReadWriteSplittingConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateReadWriteSplittingConnectionResponse self = new AllocateReadWriteSplittingConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateReadWriteSplittingConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateReadWriteSplittingConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateReadWriteSplittingConnectionResponse setBody(AllocateReadWriteSplittingConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateReadWriteSplittingConnectionResponseBody getBody() {
        return this.body;
    }

}
