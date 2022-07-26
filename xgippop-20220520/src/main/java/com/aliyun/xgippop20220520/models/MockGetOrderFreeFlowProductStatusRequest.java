// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class MockGetOrderFreeFlowProductStatusRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("CustomerFlowOrderId")
    public String customerFlowOrderId;

    public static MockGetOrderFreeFlowProductStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        MockGetOrderFreeFlowProductStatusRequest self = new MockGetOrderFreeFlowProductStatusRequest();
        return TeaModel.build(map, self);
    }

    public MockGetOrderFreeFlowProductStatusRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public MockGetOrderFreeFlowProductStatusRequest setCustomerFlowOrderId(String customerFlowOrderId) {
        this.customerFlowOrderId = customerFlowOrderId;
        return this;
    }
    public String getCustomerFlowOrderId() {
        return this.customerFlowOrderId;
    }

}
