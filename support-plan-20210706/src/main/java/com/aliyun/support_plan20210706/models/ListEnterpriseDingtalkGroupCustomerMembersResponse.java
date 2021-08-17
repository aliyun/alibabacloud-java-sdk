// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListEnterpriseDingtalkGroupCustomerMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnterpriseDingtalkGroupCustomerMembersResponseBody body;

    public static ListEnterpriseDingtalkGroupCustomerMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseDingtalkGroupCustomerMembersResponse self = new ListEnterpriseDingtalkGroupCustomerMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseDingtalkGroupCustomerMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterpriseDingtalkGroupCustomerMembersResponse setBody(ListEnterpriseDingtalkGroupCustomerMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterpriseDingtalkGroupCustomerMembersResponseBody getBody() {
        return this.body;
    }

}
