// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscriptionByPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubscriptionByPackageResponseBody body;

    public static ListSubscriptionByPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByPackageResponse self = new ListSubscriptionByPackageResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscriptionByPackageResponse setBody(ListSubscriptionByPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscriptionByPackageResponseBody getBody() {
        return this.body;
    }

}
