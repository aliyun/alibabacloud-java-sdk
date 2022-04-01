// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CancelOrderGroupParam extends TeaModel {
    // 订单组ID
    @NameInMap("orderGroupId")
    public String orderGroupId;

    // 用户ID
    @NameInMap("userId")
    public Long userId;

    public static CancelOrderGroupParam build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderGroupParam self = new CancelOrderGroupParam();
        return TeaModel.build(map, self);
    }

    public CancelOrderGroupParam setOrderGroupId(String orderGroupId) {
        this.orderGroupId = orderGroupId;
        return this;
    }
    public String getOrderGroupId() {
        return this.orderGroupId;
    }

    public CancelOrderGroupParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
