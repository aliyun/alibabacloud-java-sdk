// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportTSJobsOssResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportTSJobsOssResponseBody body;

    public static ImportTSJobsOssResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportTSJobsOssResponse self = new ImportTSJobsOssResponse();
        return TeaModel.build(map, self);
    }

    public ImportTSJobsOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportTSJobsOssResponse setBody(ImportTSJobsOssResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportTSJobsOssResponseBody getBody() {
        return this.body;
    }

}
