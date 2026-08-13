// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSourceUploadSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSourceUploadSignatureResponseBody body;

    public static GetSourceUploadSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSourceUploadSignatureResponse self = new GetSourceUploadSignatureResponse();
        return TeaModel.build(map, self);
    }

    public GetSourceUploadSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSourceUploadSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSourceUploadSignatureResponse setBody(GetSourceUploadSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSourceUploadSignatureResponseBody getBody() {
        return this.body;
    }

}
