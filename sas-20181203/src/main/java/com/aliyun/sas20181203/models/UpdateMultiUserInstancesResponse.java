// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateMultiUserInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMultiUserInstancesResponseBody body;

    public static UpdateMultiUserInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiUserInstancesResponse self = new UpdateMultiUserInstancesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMultiUserInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMultiUserInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMultiUserInstancesResponse setBody(UpdateMultiUserInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMultiUserInstancesResponseBody getBody() {
        return this.body;
    }

}
