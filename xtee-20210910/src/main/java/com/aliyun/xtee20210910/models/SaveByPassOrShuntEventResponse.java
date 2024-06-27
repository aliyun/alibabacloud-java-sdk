// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SaveByPassOrShuntEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveByPassOrShuntEventResponseBody body;

    public static SaveByPassOrShuntEventResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveByPassOrShuntEventResponse self = new SaveByPassOrShuntEventResponse();
        return TeaModel.build(map, self);
    }

    public SaveByPassOrShuntEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveByPassOrShuntEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveByPassOrShuntEventResponse setBody(SaveByPassOrShuntEventResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveByPassOrShuntEventResponseBody getBody() {
        return this.body;
    }

}
