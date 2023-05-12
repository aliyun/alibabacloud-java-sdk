// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddUserVpcAuthorizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserVpcAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserVpcAuthorizationResponseBody self = new AddUserVpcAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserVpcAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
