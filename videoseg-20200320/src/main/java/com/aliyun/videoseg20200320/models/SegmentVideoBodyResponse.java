// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentVideoBodyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentVideoBodyResponseBody body;

    public static SegmentVideoBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentVideoBodyResponse self = new SegmentVideoBodyResponse();
        return TeaModel.build(map, self);
    }

    public SegmentVideoBodyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentVideoBodyResponse setBody(SegmentVideoBodyResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentVideoBodyResponseBody getBody() {
        return this.body;
    }

}
