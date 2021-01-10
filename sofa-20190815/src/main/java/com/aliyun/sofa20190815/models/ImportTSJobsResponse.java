// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportTSJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportTSJobsResponseBody body;

    public static ImportTSJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportTSJobsResponse self = new ImportTSJobsResponse();
        return TeaModel.build(map, self);
    }

    public ImportTSJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportTSJobsResponse setBody(ImportTSJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportTSJobsResponseBody getBody() {
        return this.body;
    }

}
