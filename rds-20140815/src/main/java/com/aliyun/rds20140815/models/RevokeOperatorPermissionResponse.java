// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeOperatorPermissionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RevokeOperatorPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeOperatorPermissionResponse self = new RevokeOperatorPermissionResponse();
        return TeaModel.build(map, self);
    }

}
