// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteTrafficMirrorFilterRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrafficMirrorFilterRulesResponseBody body;

    public static DeleteTrafficMirrorFilterRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficMirrorFilterRulesResponse self = new DeleteTrafficMirrorFilterRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficMirrorFilterRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrafficMirrorFilterRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrafficMirrorFilterRulesResponse setBody(DeleteTrafficMirrorFilterRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficMirrorFilterRulesResponseBody getBody() {
        return this.body;
    }

}
