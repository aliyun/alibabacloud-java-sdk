// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteUserVpcAuthorizationResponseBody extends TeaModel {
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
