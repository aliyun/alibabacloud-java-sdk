// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileUploadLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileUploadLimitResponseBody body;

    public static GetFileUploadLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileUploadLimitResponse self = new GetFileUploadLimitResponse();
        return TeaModel.build(map, self);
    }

    public GetFileUploadLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileUploadLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileUploadLimitResponse setBody(GetFileUploadLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileUploadLimitResponseBody getBody() {
        return this.body;
    }

}
