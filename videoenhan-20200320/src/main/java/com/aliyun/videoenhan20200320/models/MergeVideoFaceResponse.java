// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MergeVideoFaceResponseBody body;

    public static MergeVideoFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoFaceResponse self = new MergeVideoFaceResponse();
        return TeaModel.build(map, self);
    }

    public MergeVideoFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MergeVideoFaceResponse setBody(MergeVideoFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public MergeVideoFaceResponseBody getBody() {
        return this.body;
    }

}
