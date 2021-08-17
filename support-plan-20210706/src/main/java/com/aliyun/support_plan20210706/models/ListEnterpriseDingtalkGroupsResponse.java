// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListEnterpriseDingtalkGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnterpriseDingtalkGroupsResponseBody body;

    public static ListEnterpriseDingtalkGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseDingtalkGroupsResponse self = new ListEnterpriseDingtalkGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseDingtalkGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterpriseDingtalkGroupsResponse setBody(ListEnterpriseDingtalkGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterpriseDingtalkGroupsResponseBody getBody() {
        return this.body;
    }

}
