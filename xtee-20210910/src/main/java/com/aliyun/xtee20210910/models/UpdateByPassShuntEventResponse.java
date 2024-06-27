// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateByPassShuntEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateByPassShuntEventResponseBody body;

    public static UpdateByPassShuntEventResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateByPassShuntEventResponse self = new UpdateByPassShuntEventResponse();
        return TeaModel.build(map, self);
    }

    public UpdateByPassShuntEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateByPassShuntEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateByPassShuntEventResponse setBody(UpdateByPassShuntEventResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateByPassShuntEventResponseBody getBody() {
        return this.body;
    }

}
