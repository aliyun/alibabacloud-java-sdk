// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateDetectionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDetectionJobResponseBody body;

    public static UpdateDetectionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectionJobResponse self = new UpdateDetectionJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDetectionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDetectionJobResponse setBody(UpdateDetectionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDetectionJobResponseBody getBody() {
        return this.body;
    }

}
