// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateHaVipResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnassociateHaVipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassociateHaVipResponseBody self = new UnassociateHaVipResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassociateHaVipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
