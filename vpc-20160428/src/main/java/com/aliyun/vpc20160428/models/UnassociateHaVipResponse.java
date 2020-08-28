// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateHaVipResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnassociateHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateHaVipResponse self = new UnassociateHaVipResponse();
        return TeaModel.build(map, self);
    }

}
