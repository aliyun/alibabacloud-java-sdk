// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteTrafficMirrorSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrafficMirrorSessionResponseBody body;

    public static DeleteTrafficMirrorSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficMirrorSessionResponse self = new DeleteTrafficMirrorSessionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficMirrorSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrafficMirrorSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrafficMirrorSessionResponse setBody(DeleteTrafficMirrorSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficMirrorSessionResponseBody getBody() {
        return this.body;
    }

}
