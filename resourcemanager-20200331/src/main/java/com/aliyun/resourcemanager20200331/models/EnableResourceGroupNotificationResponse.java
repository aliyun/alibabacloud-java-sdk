// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableResourceGroupNotificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableResourceGroupNotificationResponseBody body;

    public static EnableResourceGroupNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceGroupNotificationResponse self = new EnableResourceGroupNotificationResponse();
        return TeaModel.build(map, self);
    }

    public EnableResourceGroupNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableResourceGroupNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableResourceGroupNotificationResponse setBody(EnableResourceGroupNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableResourceGroupNotificationResponseBody getBody() {
        return this.body;
    }

}
