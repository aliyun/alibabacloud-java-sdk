// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RecordBankBalanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecordBankBalanceResponseBody body;

    public static RecordBankBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecordBankBalanceResponse self = new RecordBankBalanceResponse();
        return TeaModel.build(map, self);
    }

    public RecordBankBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecordBankBalanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecordBankBalanceResponse setBody(RecordBankBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecordBankBalanceResponseBody getBody() {
        return this.body;
    }

}
