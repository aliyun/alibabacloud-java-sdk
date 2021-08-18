// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppFollowCallRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppFollowCallRuleListResponseBody body;

    public static DescribeAppFollowCallRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppFollowCallRuleListResponse self = new DescribeAppFollowCallRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppFollowCallRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppFollowCallRuleListResponse setBody(DescribeAppFollowCallRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppFollowCallRuleListResponseBody getBody() {
        return this.body;
    }

}
