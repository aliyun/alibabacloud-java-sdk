// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class SaveUrgentDemandItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveUrgentDemandItemResponseBody body;

    public static SaveUrgentDemandItemResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveUrgentDemandItemResponse self = new SaveUrgentDemandItemResponse();
        return TeaModel.build(map, self);
    }

    public SaveUrgentDemandItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveUrgentDemandItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveUrgentDemandItemResponse setBody(SaveUrgentDemandItemResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveUrgentDemandItemResponseBody getBody() {
        return this.body;
    }

}
