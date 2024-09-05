// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListEnterpriseDingtalkGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListEnterpriseDingtalkGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnterpriseDingtalkGroupsResponse setBody(ListEnterpriseDingtalkGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterpriseDingtalkGroupsResponseBody getBody() {
        return this.body;
    }

}
