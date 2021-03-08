// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultTimelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMediaAuditResultTimelineResponseBody body;

    public static GetMediaAuditResultTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultTimelineResponse self = new GetMediaAuditResultTimelineResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaAuditResultTimelineResponse setBody(GetMediaAuditResultTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaAuditResultTimelineResponseBody getBody() {
        return this.body;
    }

}
