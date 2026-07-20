// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class SubmitApplyRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitApplyRecordResponseBody body;

    public static SubmitApplyRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitApplyRecordResponse self = new SubmitApplyRecordResponse();
        return TeaModel.build(map, self);
    }

    public SubmitApplyRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitApplyRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitApplyRecordResponse setBody(SubmitApplyRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitApplyRecordResponseBody getBody() {
        return this.body;
    }

}
