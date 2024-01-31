// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectApiInvokeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileDetectApiInvokeInfoResponseBody body;

    public static GetFileDetectApiInvokeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectApiInvokeInfoResponse self = new GetFileDetectApiInvokeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetFileDetectApiInvokeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileDetectApiInvokeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileDetectApiInvokeInfoResponse setBody(GetFileDetectApiInvokeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileDetectApiInvokeInfoResponseBody getBody() {
        return this.body;
    }

}
