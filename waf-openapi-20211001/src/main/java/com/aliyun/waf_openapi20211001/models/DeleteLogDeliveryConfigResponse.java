// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteLogDeliveryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLogDeliveryConfigResponseBody body;

    public static DeleteLogDeliveryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogDeliveryConfigResponse self = new DeleteLogDeliveryConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogDeliveryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogDeliveryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLogDeliveryConfigResponse setBody(DeleteLogDeliveryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogDeliveryConfigResponseBody getBody() {
        return this.body;
    }

}
