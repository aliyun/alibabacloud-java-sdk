// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePbcInvokeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CatalogCommonResult body;

    public static DeletePbcInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePbcInvokeResponse self = new DeletePbcInvokeResponse();
        return TeaModel.build(map, self);
    }

    public DeletePbcInvokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePbcInvokeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePbcInvokeResponse setBody(CatalogCommonResult body) {
        this.body = body;
        return this;
    }
    public CatalogCommonResult getBody() {
        return this.body;
    }

}
