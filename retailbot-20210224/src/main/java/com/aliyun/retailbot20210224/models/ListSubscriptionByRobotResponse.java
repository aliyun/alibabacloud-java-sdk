// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscriptionByRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubscriptionByRobotResponseBody body;

    public static ListSubscriptionByRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByRobotResponse self = new ListSubscriptionByRobotResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscriptionByRobotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubscriptionByRobotResponse setBody(ListSubscriptionByRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscriptionByRobotResponseBody getBody() {
        return this.body;
    }

}
