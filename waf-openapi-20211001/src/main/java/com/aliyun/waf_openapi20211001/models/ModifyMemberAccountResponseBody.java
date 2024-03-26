// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyMemberAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMemberAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMemberAccountResponseBody self = new ModifyMemberAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMemberAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
