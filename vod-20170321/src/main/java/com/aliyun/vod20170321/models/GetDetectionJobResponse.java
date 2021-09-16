// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDetectionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDetectionJobResponseBody body;

    public static GetDetectionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionJobResponse self = new GetDetectionJobResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectionJobResponse setBody(GetDetectionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectionJobResponseBody getBody() {
        return this.body;
    }

}
