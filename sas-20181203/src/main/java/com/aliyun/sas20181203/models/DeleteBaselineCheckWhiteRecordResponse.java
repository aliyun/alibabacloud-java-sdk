// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBaselineCheckWhiteRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBaselineCheckWhiteRecordResponseBody body;

    public static DeleteBaselineCheckWhiteRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaselineCheckWhiteRecordResponse self = new DeleteBaselineCheckWhiteRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBaselineCheckWhiteRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBaselineCheckWhiteRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBaselineCheckWhiteRecordResponse setBody(DeleteBaselineCheckWhiteRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBaselineCheckWhiteRecordResponseBody getBody() {
        return this.body;
    }

}
