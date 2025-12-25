// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveMinimapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveMinimapResponseBody body;

    public static SaveMinimapResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveMinimapResponse self = new SaveMinimapResponse();
        return TeaModel.build(map, self);
    }

    public SaveMinimapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveMinimapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveMinimapResponse setBody(SaveMinimapResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveMinimapResponseBody getBody() {
        return this.body;
    }

}
