// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneyPotUploadPolicyInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHoneyPotUploadPolicyInfoResponseBody body;

    public static GetHoneyPotUploadPolicyInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHoneyPotUploadPolicyInfoResponse self = new GetHoneyPotUploadPolicyInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetHoneyPotUploadPolicyInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHoneyPotUploadPolicyInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHoneyPotUploadPolicyInfoResponse setBody(GetHoneyPotUploadPolicyInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHoneyPotUploadPolicyInfoResponseBody getBody() {
        return this.body;
    }

}
