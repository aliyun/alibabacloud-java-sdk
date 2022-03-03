// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVideoCastCrewListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeVideoCastCrewListResponseBody body;

    public static RecognizeVideoCastCrewListResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVideoCastCrewListResponse self = new RecognizeVideoCastCrewListResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVideoCastCrewListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVideoCastCrewListResponse setBody(RecognizeVideoCastCrewListResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVideoCastCrewListResponseBody getBody() {
        return this.body;
    }

}
