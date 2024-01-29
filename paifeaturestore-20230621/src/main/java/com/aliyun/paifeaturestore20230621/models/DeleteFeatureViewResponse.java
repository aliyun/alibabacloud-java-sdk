// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteFeatureViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFeatureViewResponseBody body;

    public static DeleteFeatureViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFeatureViewResponse self = new DeleteFeatureViewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFeatureViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFeatureViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFeatureViewResponse setBody(DeleteFeatureViewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFeatureViewResponseBody getBody() {
        return this.body;
    }

}
