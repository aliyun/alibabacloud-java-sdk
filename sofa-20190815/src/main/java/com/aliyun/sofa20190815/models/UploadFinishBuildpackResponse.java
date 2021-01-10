// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadFinishBuildpackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadFinishBuildpackResponseBody body;

    public static UploadFinishBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFinishBuildpackResponse self = new UploadFinishBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public UploadFinishBuildpackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadFinishBuildpackResponse setBody(UploadFinishBuildpackResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadFinishBuildpackResponseBody getBody() {
        return this.body;
    }

}
