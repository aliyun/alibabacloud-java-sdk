// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GrantOperatorPermissionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GrantOperatorPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantOperatorPermissionResponse self = new GrantOperatorPermissionResponse();
        return TeaModel.build(map, self);
    }

}
