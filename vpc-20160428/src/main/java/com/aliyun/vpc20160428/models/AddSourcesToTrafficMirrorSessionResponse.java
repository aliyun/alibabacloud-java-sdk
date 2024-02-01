// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddSourcesToTrafficMirrorSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSourcesToTrafficMirrorSessionResponseBody body;

    public static AddSourcesToTrafficMirrorSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSourcesToTrafficMirrorSessionResponse self = new AddSourcesToTrafficMirrorSessionResponse();
        return TeaModel.build(map, self);
    }

    public AddSourcesToTrafficMirrorSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSourcesToTrafficMirrorSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSourcesToTrafficMirrorSessionResponse setBody(AddSourcesToTrafficMirrorSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSourcesToTrafficMirrorSessionResponseBody getBody() {
        return this.body;
    }

}
