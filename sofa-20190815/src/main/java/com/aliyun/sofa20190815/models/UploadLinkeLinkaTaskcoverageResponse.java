// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeLinkaTaskcoverageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadLinkeLinkaTaskcoverageResponseBody body;

    public static UploadLinkeLinkaTaskcoverageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeLinkaTaskcoverageResponse self = new UploadLinkeLinkaTaskcoverageResponse();
        return TeaModel.build(map, self);
    }

    public UploadLinkeLinkaTaskcoverageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadLinkeLinkaTaskcoverageResponse setBody(UploadLinkeLinkaTaskcoverageResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadLinkeLinkaTaskcoverageResponseBody getBody() {
        return this.body;
    }

}
