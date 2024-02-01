// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteTrafficMirrorFilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrafficMirrorFilterResponseBody body;

    public static DeleteTrafficMirrorFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficMirrorFilterResponse self = new DeleteTrafficMirrorFilterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficMirrorFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrafficMirrorFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrafficMirrorFilterResponse setBody(DeleteTrafficMirrorFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficMirrorFilterResponseBody getBody() {
        return this.body;
    }

}
