// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateBaselineCheckWhiteRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBaselineCheckWhiteRecordResponseBody body;

    public static UpdateBaselineCheckWhiteRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaselineCheckWhiteRecordResponse self = new UpdateBaselineCheckWhiteRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBaselineCheckWhiteRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBaselineCheckWhiteRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBaselineCheckWhiteRecordResponse setBody(UpdateBaselineCheckWhiteRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBaselineCheckWhiteRecordResponseBody getBody() {
        return this.body;
    }

}
