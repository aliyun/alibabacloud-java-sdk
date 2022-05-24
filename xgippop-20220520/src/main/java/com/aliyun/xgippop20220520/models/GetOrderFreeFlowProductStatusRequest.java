// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetOrderFreeFlowProductStatusRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    // 在订购接口2.1.9中引擎侧生成的id
    @NameInMap("CustomerFlowOrderId")
    public String customerFlowOrderId;

    public static GetOrderFreeFlowProductStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderFreeFlowProductStatusRequest self = new GetOrderFreeFlowProductStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderFreeFlowProductStatusRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetOrderFreeFlowProductStatusRequest setCustomerFlowOrderId(String customerFlowOrderId) {
        this.customerFlowOrderId = customerFlowOrderId;
        return this;
    }
    public String getCustomerFlowOrderId() {
        return this.customerFlowOrderId;
    }

}
