// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CancelProjectModifyRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelProjectModifyRecordResponseBody body;

    public static CancelProjectModifyRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelProjectModifyRecordResponse self = new CancelProjectModifyRecordResponse();
        return TeaModel.build(map, self);
    }

    public CancelProjectModifyRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelProjectModifyRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelProjectModifyRecordResponse setBody(CancelProjectModifyRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelProjectModifyRecordResponseBody getBody() {
        return this.body;
    }

}
