// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateSelectionKeyByTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSelectionKeyByTypeResponseBody body;

    public static UpdateSelectionKeyByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSelectionKeyByTypeResponse self = new UpdateSelectionKeyByTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSelectionKeyByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSelectionKeyByTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSelectionKeyByTypeResponse setBody(UpdateSelectionKeyByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSelectionKeyByTypeResponseBody getBody() {
        return this.body;
    }

}
