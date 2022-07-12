// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class PartnerUpdateTrademarkNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PartnerUpdateTrademarkNameResponseBody body;

    public static PartnerUpdateTrademarkNameResponse build(java.util.Map<String, ?> map) throws Exception {
        PartnerUpdateTrademarkNameResponse self = new PartnerUpdateTrademarkNameResponse();
        return TeaModel.build(map, self);
    }

    public PartnerUpdateTrademarkNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PartnerUpdateTrademarkNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PartnerUpdateTrademarkNameResponse setBody(PartnerUpdateTrademarkNameResponseBody body) {
        this.body = body;
        return this;
    }
    public PartnerUpdateTrademarkNameResponseBody getBody() {
        return this.body;
    }

}
