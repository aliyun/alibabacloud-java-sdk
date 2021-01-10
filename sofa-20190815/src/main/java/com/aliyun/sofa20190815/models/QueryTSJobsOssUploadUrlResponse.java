// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobsOssUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSJobsOssUploadUrlResponseBody body;

    public static QueryTSJobsOssUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobsOssUploadUrlResponse self = new QueryTSJobsOssUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSJobsOssUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSJobsOssUploadUrlResponse setBody(QueryTSJobsOssUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSJobsOssUploadUrlResponseBody getBody() {
        return this.body;
    }

}
