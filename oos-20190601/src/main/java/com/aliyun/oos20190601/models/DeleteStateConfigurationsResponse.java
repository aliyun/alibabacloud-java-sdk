// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteStateConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteStateConfigurationsResponseBody body;

    public static DeleteStateConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStateConfigurationsResponse self = new DeleteStateConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStateConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStateConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStateConfigurationsResponse setBody(DeleteStateConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStateConfigurationsResponseBody getBody() {
        return this.body;
    }

}
