// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCustomBlockRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCustomBlockRecordResponseBody body;

    public static ModifyCustomBlockRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomBlockRecordResponse self = new ModifyCustomBlockRecordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomBlockRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomBlockRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustomBlockRecordResponse setBody(ModifyCustomBlockRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomBlockRecordResponseBody getBody() {
        return this.body;
    }

}
