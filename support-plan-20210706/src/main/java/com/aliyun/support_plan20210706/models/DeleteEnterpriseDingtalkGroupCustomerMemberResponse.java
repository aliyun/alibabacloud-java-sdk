// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseDingtalkGroupCustomerMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody body;

    public static DeleteEnterpriseDingtalkGroupCustomerMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseDingtalkGroupCustomerMemberResponse self = new DeleteEnterpriseDingtalkGroupCustomerMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponse setBody(DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnterpriseDingtalkGroupCustomerMemberResponseBody getBody() {
        return this.body;
    }

}
