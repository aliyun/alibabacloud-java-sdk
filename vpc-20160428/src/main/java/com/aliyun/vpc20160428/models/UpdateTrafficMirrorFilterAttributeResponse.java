// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorFilterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTrafficMirrorFilterAttributeResponseBody body;

    public static UpdateTrafficMirrorFilterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMirrorFilterAttributeResponse self = new UpdateTrafficMirrorFilterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMirrorFilterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrafficMirrorFilterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrafficMirrorFilterAttributeResponse setBody(UpdateTrafficMirrorFilterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrafficMirrorFilterAttributeResponseBody getBody() {
        return this.body;
    }

}
