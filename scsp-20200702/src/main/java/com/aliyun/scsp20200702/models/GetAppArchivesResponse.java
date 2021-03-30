// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAppArchivesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppArchivesResponseBody body;

    public static GetAppArchivesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppArchivesResponse self = new GetAppArchivesResponse();
        return TeaModel.build(map, self);
    }

    public GetAppArchivesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppArchivesResponse setBody(GetAppArchivesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppArchivesResponseBody getBody() {
        return this.body;
    }

}
