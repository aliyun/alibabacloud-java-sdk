// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class MoveResourceGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static MoveResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceGroupResponse self = new MoveResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public MoveResourceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
