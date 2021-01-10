// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeLinkaInternalsinglecoverageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadLinkeLinkaInternalsinglecoverageResponseBody body;

    public static UploadLinkeLinkaInternalsinglecoverageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeLinkaInternalsinglecoverageResponse self = new UploadLinkeLinkaInternalsinglecoverageResponse();
        return TeaModel.build(map, self);
    }

    public UploadLinkeLinkaInternalsinglecoverageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadLinkeLinkaInternalsinglecoverageResponse setBody(UploadLinkeLinkaInternalsinglecoverageResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadLinkeLinkaInternalsinglecoverageResponseBody getBody() {
        return this.body;
    }

}
