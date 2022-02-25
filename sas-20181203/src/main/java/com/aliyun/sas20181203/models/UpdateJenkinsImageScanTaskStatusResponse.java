// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateJenkinsImageScanTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateJenkinsImageScanTaskStatusResponseBody body;

    public static UpdateJenkinsImageScanTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJenkinsImageScanTaskStatusResponse self = new UpdateJenkinsImageScanTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJenkinsImageScanTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJenkinsImageScanTaskStatusResponse setBody(UpdateJenkinsImageScanTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJenkinsImageScanTaskStatusResponseBody getBody() {
        return this.body;
    }

}
