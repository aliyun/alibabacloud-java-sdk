// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateHaVipResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AssociateHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateHaVipResponse self = new AssociateHaVipResponse();
        return TeaModel.build(map, self);
    }

    public AssociateHaVipResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
