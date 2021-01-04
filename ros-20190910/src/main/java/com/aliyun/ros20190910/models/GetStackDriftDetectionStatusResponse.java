// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStackDriftDetectionStatusResponseBody body;

    public static GetStackDriftDetectionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackDriftDetectionStatusResponse self = new GetStackDriftDetectionStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetStackDriftDetectionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackDriftDetectionStatusResponse setBody(GetStackDriftDetectionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackDriftDetectionStatusResponseBody getBody() {
        return this.body;
    }

}
