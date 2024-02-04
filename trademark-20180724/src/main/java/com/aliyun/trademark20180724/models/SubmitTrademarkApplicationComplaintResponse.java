// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SubmitTrademarkApplicationComplaintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTrademarkApplicationComplaintResponseBody body;

    public static SubmitTrademarkApplicationComplaintResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTrademarkApplicationComplaintResponse self = new SubmitTrademarkApplicationComplaintResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTrademarkApplicationComplaintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTrademarkApplicationComplaintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTrademarkApplicationComplaintResponse setBody(SubmitTrademarkApplicationComplaintResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTrademarkApplicationComplaintResponseBody getBody() {
        return this.body;
    }

}
