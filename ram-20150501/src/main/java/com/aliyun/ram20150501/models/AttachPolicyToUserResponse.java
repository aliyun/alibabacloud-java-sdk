// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AttachPolicyToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToUserResponse self = new AttachPolicyToUserResponse();
        return TeaModel.build(map, self);
    }

}
