// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateDataSourcePropertiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataSourcePropertiesResponseBody body;

    public static UpdateDataSourcePropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourcePropertiesResponse self = new UpdateDataSourcePropertiesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourcePropertiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataSourcePropertiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataSourcePropertiesResponse setBody(UpdateDataSourcePropertiesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataSourcePropertiesResponseBody getBody() {
        return this.body;
    }

}
