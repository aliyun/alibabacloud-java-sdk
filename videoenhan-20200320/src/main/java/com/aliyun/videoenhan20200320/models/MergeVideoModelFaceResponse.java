// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoModelFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public MergeVideoModelFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MergeVideoModelFaceResponse setBody(MergeVideoModelFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public MergeVideoModelFaceResponseBody getBody() {
        return this.body;
    }

}
