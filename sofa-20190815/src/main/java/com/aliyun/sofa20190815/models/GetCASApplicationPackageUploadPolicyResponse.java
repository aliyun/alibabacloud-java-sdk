// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASApplicationPackageUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCASApplicationPackageUploadPolicyResponseBody body;

    public static GetCASApplicationPackageUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCASApplicationPackageUploadPolicyResponse self = new GetCASApplicationPackageUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetCASApplicationPackageUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCASApplicationPackageUploadPolicyResponse setBody(GetCASApplicationPackageUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCASApplicationPackageUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
