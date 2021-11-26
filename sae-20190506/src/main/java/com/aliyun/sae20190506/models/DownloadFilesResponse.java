// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DownloadFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadFilesResponseBody body;

    public static DownloadFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadFilesResponse self = new DownloadFilesResponse();
        return TeaModel.build(map, self);
    }

    public DownloadFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadFilesResponse setBody(DownloadFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadFilesResponseBody getBody() {
        return this.body;
    }

}
