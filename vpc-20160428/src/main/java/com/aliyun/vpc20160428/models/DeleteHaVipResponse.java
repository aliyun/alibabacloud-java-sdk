// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteHaVipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHaVipResponseBody body;

    public static DeleteHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHaVipResponse self = new DeleteHaVipResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHaVipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHaVipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHaVipResponse setBody(DeleteHaVipResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHaVipResponseBody getBody() {
        return this.body;
    }

}
