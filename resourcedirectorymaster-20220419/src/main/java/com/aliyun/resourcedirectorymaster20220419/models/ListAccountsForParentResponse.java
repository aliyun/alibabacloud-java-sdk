// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAccountsForParentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccountsForParentResponseBody body;

    public static ListAccountsForParentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsForParentResponse self = new ListAccountsForParentResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountsForParentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountsForParentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccountsForParentResponse setBody(ListAccountsForParentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountsForParentResponseBody getBody() {
        return this.body;
    }

}
