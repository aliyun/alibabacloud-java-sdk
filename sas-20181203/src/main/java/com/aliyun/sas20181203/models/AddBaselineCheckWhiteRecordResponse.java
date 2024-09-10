// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddBaselineCheckWhiteRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBaselineCheckWhiteRecordResponseBody body;

    public static AddBaselineCheckWhiteRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBaselineCheckWhiteRecordResponse self = new AddBaselineCheckWhiteRecordResponse();
        return TeaModel.build(map, self);
    }

    public AddBaselineCheckWhiteRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBaselineCheckWhiteRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBaselineCheckWhiteRecordResponse setBody(AddBaselineCheckWhiteRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBaselineCheckWhiteRecordResponseBody getBody() {
        return this.body;
    }

}
