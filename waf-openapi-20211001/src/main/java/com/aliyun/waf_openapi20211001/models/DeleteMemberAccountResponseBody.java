// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteMemberAccountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5ABE714C-8890-5D7E-A08B-45CB****5473</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMemberAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemberAccountResponseBody self = new DeleteMemberAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMemberAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
