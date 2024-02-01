// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveSourcesFromTrafficMirrorSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveSourcesFromTrafficMirrorSessionResponseBody body;

    public static RemoveSourcesFromTrafficMirrorSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSourcesFromTrafficMirrorSessionResponse self = new RemoveSourcesFromTrafficMirrorSessionResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSourcesFromTrafficMirrorSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSourcesFromTrafficMirrorSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSourcesFromTrafficMirrorSessionResponse setBody(RemoveSourcesFromTrafficMirrorSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSourcesFromTrafficMirrorSessionResponseBody getBody() {
        return this.body;
    }

}
