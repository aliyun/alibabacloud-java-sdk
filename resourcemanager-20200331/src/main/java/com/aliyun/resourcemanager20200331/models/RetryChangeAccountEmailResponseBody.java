// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class RetryChangeAccountEmailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RetryChangeAccountEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryChangeAccountEmailResponseBody self = new RetryChangeAccountEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryChangeAccountEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
