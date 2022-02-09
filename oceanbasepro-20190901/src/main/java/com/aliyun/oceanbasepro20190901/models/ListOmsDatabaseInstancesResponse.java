// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsDatabaseInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOmsDatabaseInstancesResponseBody body;

    public static ListOmsDatabaseInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOmsDatabaseInstancesResponse self = new ListOmsDatabaseInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListOmsDatabaseInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOmsDatabaseInstancesResponse setBody(ListOmsDatabaseInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOmsDatabaseInstancesResponseBody getBody() {
        return this.body;
    }

}
