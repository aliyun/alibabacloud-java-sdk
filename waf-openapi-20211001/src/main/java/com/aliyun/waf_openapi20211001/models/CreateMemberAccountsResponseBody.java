// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateMemberAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMemberAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberAccountsResponseBody self = new CreateMemberAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemberAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
