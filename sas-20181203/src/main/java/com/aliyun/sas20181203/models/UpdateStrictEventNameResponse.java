// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateStrictEventNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStrictEventNameResponseBody body;

    public static UpdateStrictEventNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStrictEventNameResponse self = new UpdateStrictEventNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStrictEventNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStrictEventNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStrictEventNameResponse setBody(UpdateStrictEventNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStrictEventNameResponseBody getBody() {
        return this.body;
    }

}
