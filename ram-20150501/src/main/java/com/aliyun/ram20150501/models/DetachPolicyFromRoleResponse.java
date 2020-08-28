// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DetachPolicyFromRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromRoleResponse self = new DetachPolicyFromRoleResponse();
        return TeaModel.build(map, self);
    }

}
