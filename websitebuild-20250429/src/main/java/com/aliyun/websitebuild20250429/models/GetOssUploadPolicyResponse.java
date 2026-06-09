// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetOssUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssUploadPolicyResponseBody body;

    public static GetOssUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadPolicyResponse self = new GetOssUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetOssUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssUploadPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssUploadPolicyResponse setBody(GetOssUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
