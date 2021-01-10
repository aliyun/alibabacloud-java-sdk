// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportJobsOssResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportJobsOssResponseBody body;

    public static ExportJobsOssResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportJobsOssResponse self = new ExportJobsOssResponse();
        return TeaModel.build(map, self);
    }

    public ExportJobsOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportJobsOssResponse setBody(ExportJobsOssResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportJobsOssResponseBody getBody() {
        return this.body;
    }

}
