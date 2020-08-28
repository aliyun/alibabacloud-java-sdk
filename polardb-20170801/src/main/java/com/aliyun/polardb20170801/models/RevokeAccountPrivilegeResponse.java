// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RevokeAccountPrivilegeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RevokeAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeAccountPrivilegeResponse self = new RevokeAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

}
