// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountResourceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMultiAccountResourceGroupsResponseBody body;

    public static ListMultiAccountResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountResourceGroupsResponse self = new ListMultiAccountResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountResourceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultiAccountResourceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultiAccountResourceGroupsResponse setBody(ListMultiAccountResourceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultiAccountResourceGroupsResponseBody getBody() {
        return this.body;
    }

}
