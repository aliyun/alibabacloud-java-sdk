// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelUrlUploadJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelUrlUploadJobsResponseBody body;

    public static CancelUrlUploadJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelUrlUploadJobsResponse self = new CancelUrlUploadJobsResponse();
        return TeaModel.build(map, self);
    }

    public CancelUrlUploadJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelUrlUploadJobsResponse setBody(CancelUrlUploadJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelUrlUploadJobsResponseBody getBody() {
        return this.body;
    }

}
