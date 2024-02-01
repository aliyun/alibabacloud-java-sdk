// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTrafficMirrorFilterRulesResponseBody body;

    public static CreateTrafficMirrorFilterRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorFilterRulesResponse self = new CreateTrafficMirrorFilterRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorFilterRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrafficMirrorFilterRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrafficMirrorFilterRulesResponse setBody(CreateTrafficMirrorFilterRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrafficMirrorFilterRulesResponseBody getBody() {
        return this.body;
    }

}
