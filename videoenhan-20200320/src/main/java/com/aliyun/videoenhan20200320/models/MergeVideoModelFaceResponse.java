// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoModelFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MergeVideoModelFaceResponseBody body;

    public static MergeVideoModelFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoModelFaceResponse self = new MergeVideoModelFaceResponse();
        return TeaModel.build(map, self);
    }

    public MergeVideoModelFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MergeVideoModelFaceResponse setBody(MergeVideoModelFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public MergeVideoModelFaceResponseBody getBody() {
        return this.body;
    }

}
