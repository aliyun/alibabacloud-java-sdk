// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAutoGroupingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAutoGroupingConfigResponseBody body;

    public static UpdateAutoGroupingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoGroupingConfigResponse self = new UpdateAutoGroupingConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoGroupingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoGroupingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoGroupingConfigResponse setBody(UpdateAutoGroupingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoGroupingConfigResponseBody getBody() {
        return this.body;
    }

}
