// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OfflineRecallManagementServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineRecallManagementServiceResponseBody body;

    public static OfflineRecallManagementServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineRecallManagementServiceResponse self = new OfflineRecallManagementServiceResponse();
        return TeaModel.build(map, self);
    }

    public OfflineRecallManagementServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineRecallManagementServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineRecallManagementServiceResponse setBody(OfflineRecallManagementServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineRecallManagementServiceResponseBody getBody() {
        return this.body;
    }

}
