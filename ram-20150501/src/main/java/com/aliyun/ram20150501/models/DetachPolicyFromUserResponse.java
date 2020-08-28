// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DetachPolicyFromUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromUserResponse self = new DetachPolicyFromUserResponse();
        return TeaModel.build(map, self);
    }

}
