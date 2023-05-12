// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateRecordRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRecordRemarkResponseBody body;

    public static UpdateRecordRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordRemarkResponse self = new UpdateRecordRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecordRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecordRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecordRemarkResponse setBody(UpdateRecordRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecordRemarkResponseBody getBody() {
        return this.body;
    }

}
