// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class GetEnterpriseDingtalkGroupCustomerMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEnterpriseDingtalkGroupCustomerMemberResponseBody body;

    public static GetEnterpriseDingtalkGroupCustomerMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDingtalkGroupCustomerMemberResponse self = new GetEnterpriseDingtalkGroupCustomerMemberResponse();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponse setBody(GetEnterpriseDingtalkGroupCustomerMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnterpriseDingtalkGroupCustomerMemberResponseBody getBody() {
        return this.body;
    }

}
