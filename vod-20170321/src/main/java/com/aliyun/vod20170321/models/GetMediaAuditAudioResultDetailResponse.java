// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditAudioResultDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMediaAuditAudioResultDetailResponseBody body;

    public static GetMediaAuditAudioResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditAudioResultDetailResponse self = new GetMediaAuditAudioResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditAudioResultDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaAuditAudioResultDetailResponse setBody(GetMediaAuditAudioResultDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaAuditAudioResultDetailResponseBody getBody() {
        return this.body;
    }

}
