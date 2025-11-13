// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCheckItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCheckItemResponseBody body;

    public static UpdateCheckItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckItemResponse self = new UpdateCheckItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCheckItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCheckItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCheckItemResponse setBody(UpdateCheckItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCheckItemResponseBody getBody() {
        return this.body;
    }

}
