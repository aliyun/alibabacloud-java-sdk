// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDetectionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDetectionJobResponseBody body;

    public static ListDetectionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionJobResponse self = new ListDetectionJobResponse();
        return TeaModel.build(map, self);
    }

    public ListDetectionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDetectionJobResponse setBody(ListDetectionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDetectionJobResponseBody getBody() {
        return this.body;
    }

}
