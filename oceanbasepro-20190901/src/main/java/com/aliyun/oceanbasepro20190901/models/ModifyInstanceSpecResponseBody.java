// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyInstanceSpecResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecResponseBody self = new ModifyInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecResponseBody setData(ModifyInstanceSpecResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyInstanceSpecResponseBodyData getData() {
        return this.data;
    }

    public ModifyInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyInstanceSpecResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public String orderId;

        public static ModifyInstanceSpecResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSpecResponseBodyData self = new ModifyInstanceSpecResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSpecResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
