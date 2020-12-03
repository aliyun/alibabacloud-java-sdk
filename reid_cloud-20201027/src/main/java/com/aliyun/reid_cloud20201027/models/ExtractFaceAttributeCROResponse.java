// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class ExtractFaceAttributeCROResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExtractFaceAttributeCROResponseBody body;

    public static ExtractFaceAttributeCROResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractFaceAttributeCROResponse self = new ExtractFaceAttributeCROResponse();
        return TeaModel.build(map, self);
    }

    public ExtractFaceAttributeCROResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractFaceAttributeCROResponse setBody(ExtractFaceAttributeCROResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractFaceAttributeCROResponseBody getBody() {
        return this.body;
    }

}
