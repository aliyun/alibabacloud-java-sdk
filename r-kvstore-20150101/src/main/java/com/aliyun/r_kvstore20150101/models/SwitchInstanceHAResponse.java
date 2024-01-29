// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceHAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchInstanceHAResponseBody body;

    public static SwitchInstanceHAResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchInstanceHAResponse self = new SwitchInstanceHAResponse();
        return TeaModel.build(map, self);
    }

    public SwitchInstanceHAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchInstanceHAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchInstanceHAResponse setBody(SwitchInstanceHAResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchInstanceHAResponseBody getBody() {
        return this.body;
    }

}
