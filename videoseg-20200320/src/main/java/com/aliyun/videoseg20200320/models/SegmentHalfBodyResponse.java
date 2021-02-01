// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoseg20200320.models;

import com.aliyun.tea.*;

public class SegmentHalfBodyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentHalfBodyResponseBody body;

    public static SegmentHalfBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHalfBodyResponse self = new SegmentHalfBodyResponse();
        return TeaModel.build(map, self);
    }

    public SegmentHalfBodyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentHalfBodyResponse setBody(SegmentHalfBodyResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentHalfBodyResponseBody getBody() {
        return this.body;
    }

}
