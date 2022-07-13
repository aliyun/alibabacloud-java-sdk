// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class BindAgentHotlinePhoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindAgentHotlinePhoneResponseBody body;

    public static BindAgentHotlinePhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAgentHotlinePhoneResponse self = new BindAgentHotlinePhoneResponse();
        return TeaModel.build(map, self);
    }

    public BindAgentHotlinePhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAgentHotlinePhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAgentHotlinePhoneResponse setBody(BindAgentHotlinePhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAgentHotlinePhoneResponseBody getBody() {
        return this.body;
    }

}
