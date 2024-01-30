// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetStackDriftDetectionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStackDriftDetectionStatusResponse setBody(GetStackDriftDetectionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackDriftDetectionStatusResponseBody getBody() {
        return this.body;
    }

}
