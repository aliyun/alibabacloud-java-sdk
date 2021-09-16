// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDetectionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitDetectionJobResponseBody body;

    public static SubmitDetectionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDetectionJobResponse self = new SubmitDetectionJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDetectionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDetectionJobResponse setBody(SubmitDetectionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDetectionJobResponseBody getBody() {
        return this.body;
    }

}
