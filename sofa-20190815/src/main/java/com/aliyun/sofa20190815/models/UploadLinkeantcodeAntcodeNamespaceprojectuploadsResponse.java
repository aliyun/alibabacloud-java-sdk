// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponseBody body;

    public static UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse self = new UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse();
        return TeaModel.build(map, self);
    }

    public UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse setBody(UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponseBody getBody() {
        return this.body;
    }

}
