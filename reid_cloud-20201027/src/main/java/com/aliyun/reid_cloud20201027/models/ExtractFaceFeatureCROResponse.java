// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class ExtractFaceFeatureCROResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExtractFaceFeatureCROResponseBody body;

    public static ExtractFaceFeatureCROResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractFaceFeatureCROResponse self = new ExtractFaceFeatureCROResponse();
        return TeaModel.build(map, self);
    }

    public ExtractFaceFeatureCROResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractFaceFeatureCROResponse setBody(ExtractFaceFeatureCROResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractFaceFeatureCROResponseBody getBody() {
        return this.body;
    }

}
