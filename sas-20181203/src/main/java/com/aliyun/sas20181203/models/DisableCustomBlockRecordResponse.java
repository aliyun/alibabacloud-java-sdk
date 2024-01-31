// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DisableCustomBlockRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCustomBlockRecordResponseBody body;

    public static DisableCustomBlockRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCustomBlockRecordResponse self = new DisableCustomBlockRecordResponse();
        return TeaModel.build(map, self);
    }

    public DisableCustomBlockRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCustomBlockRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCustomBlockRecordResponse setBody(DisableCustomBlockRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCustomBlockRecordResponseBody getBody() {
        return this.body;
    }

}
