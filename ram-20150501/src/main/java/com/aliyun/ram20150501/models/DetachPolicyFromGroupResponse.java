// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DetachPolicyFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromGroupResponse self = new DetachPolicyFromGroupResponse();
        return TeaModel.build(map, self);
    }

}
