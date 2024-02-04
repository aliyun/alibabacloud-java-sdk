// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UploadTrademarkOnSaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadTrademarkOnSaleResponseBody body;

    public static UploadTrademarkOnSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadTrademarkOnSaleResponse self = new UploadTrademarkOnSaleResponse();
        return TeaModel.build(map, self);
    }

    public UploadTrademarkOnSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadTrademarkOnSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadTrademarkOnSaleResponse setBody(UploadTrademarkOnSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadTrademarkOnSaleResponseBody getBody() {
        return this.body;
    }

}
