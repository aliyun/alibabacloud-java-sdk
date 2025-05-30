// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class DeleteUrgentDemandItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUrgentDemandItemResponseBody body;

    public static DeleteUrgentDemandItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUrgentDemandItemResponse self = new DeleteUrgentDemandItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUrgentDemandItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUrgentDemandItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUrgentDemandItemResponse setBody(DeleteUrgentDemandItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUrgentDemandItemResponseBody getBody() {
        return this.body;
    }

}
