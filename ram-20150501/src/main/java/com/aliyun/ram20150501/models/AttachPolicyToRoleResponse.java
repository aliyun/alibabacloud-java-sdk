// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AttachPolicyToRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToRoleResponse self = new AttachPolicyToRoleResponse();
        return TeaModel.build(map, self);
    }

}
