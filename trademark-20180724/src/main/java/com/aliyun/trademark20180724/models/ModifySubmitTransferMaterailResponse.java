// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ModifySubmitTransferMaterailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySubmitTransferMaterailResponseBody body;

    public static ModifySubmitTransferMaterailResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySubmitTransferMaterailResponse self = new ModifySubmitTransferMaterailResponse();
        return TeaModel.build(map, self);
    }

    public ModifySubmitTransferMaterailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySubmitTransferMaterailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySubmitTransferMaterailResponse setBody(ModifySubmitTransferMaterailResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySubmitTransferMaterailResponseBody getBody() {
        return this.body;
    }

}
