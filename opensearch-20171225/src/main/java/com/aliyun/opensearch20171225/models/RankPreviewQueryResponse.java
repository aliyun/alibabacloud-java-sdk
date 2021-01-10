// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RankPreviewQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RankPreviewQueryResponseBody body;

    public static RankPreviewQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        RankPreviewQueryResponse self = new RankPreviewQueryResponse();
        return TeaModel.build(map, self);
    }

    public RankPreviewQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RankPreviewQueryResponse setBody(RankPreviewQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public RankPreviewQueryResponseBody getBody() {
        return this.body;
    }

}
