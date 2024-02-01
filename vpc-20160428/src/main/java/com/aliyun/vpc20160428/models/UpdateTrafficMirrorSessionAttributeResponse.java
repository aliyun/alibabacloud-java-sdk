// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorSessionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTrafficMirrorSessionAttributeResponseBody body;

    public static UpdateTrafficMirrorSessionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMirrorSessionAttributeResponse self = new UpdateTrafficMirrorSessionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMirrorSessionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrafficMirrorSessionAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrafficMirrorSessionAttributeResponse setBody(UpdateTrafficMirrorSessionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrafficMirrorSessionAttributeResponseBody getBody() {
        return this.body;
    }

}
