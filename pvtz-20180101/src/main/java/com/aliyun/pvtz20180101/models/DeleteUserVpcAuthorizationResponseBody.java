// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteUserVpcAuthorizationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46973D4C-E3E4-4ABA-9190-9A9DE406C7E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserVpcAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserVpcAuthorizationResponseBody self = new DeleteUserVpcAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserVpcAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
