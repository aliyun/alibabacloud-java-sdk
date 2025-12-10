// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DisableResourceGroupNotificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableResourceGroupNotificationResponseBody body;

    public static DisableResourceGroupNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableResourceGroupNotificationResponse self = new DisableResourceGroupNotificationResponse();
        return TeaModel.build(map, self);
    }

    public DisableResourceGroupNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableResourceGroupNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableResourceGroupNotificationResponse setBody(DisableResourceGroupNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableResourceGroupNotificationResponseBody getBody() {
        return this.body;
    }

}
