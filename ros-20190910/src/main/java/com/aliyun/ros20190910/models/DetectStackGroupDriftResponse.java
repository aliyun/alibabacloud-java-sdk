// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackGroupDriftResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectStackGroupDriftResponseBody body;

    public static DetectStackGroupDriftResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectStackGroupDriftResponse self = new DetectStackGroupDriftResponse();
        return TeaModel.build(map, self);
    }

    public DetectStackGroupDriftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectStackGroupDriftResponse setBody(DetectStackGroupDriftResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectStackGroupDriftResponseBody getBody() {
        return this.body;
    }

}
