// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ReportDeviceCapacityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportDeviceCapacityResponseBody body;

    public static ReportDeviceCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDeviceCapacityResponse self = new ReportDeviceCapacityResponse();
        return TeaModel.build(map, self);
    }

    public ReportDeviceCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDeviceCapacityResponse setBody(ReportDeviceCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDeviceCapacityResponseBody getBody() {
        return this.body;
    }

}
