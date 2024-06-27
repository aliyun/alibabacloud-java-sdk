// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SwitchFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchFieldResponseBody body;

    public static SwitchFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchFieldResponse self = new SwitchFieldResponse();
        return TeaModel.build(map, self);
    }

    public SwitchFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchFieldResponse setBody(SwitchFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchFieldResponseBody getBody() {
        return this.body;
    }

}
