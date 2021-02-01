// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentGreenScreenVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentGreenScreenVideoResponseBody body;

    public static SegmentGreenScreenVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentGreenScreenVideoResponse self = new SegmentGreenScreenVideoResponse();
        return TeaModel.build(map, self);
    }

    public SegmentGreenScreenVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentGreenScreenVideoResponse setBody(SegmentGreenScreenVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentGreenScreenVideoResponseBody getBody() {
        return this.body;
    }

}
