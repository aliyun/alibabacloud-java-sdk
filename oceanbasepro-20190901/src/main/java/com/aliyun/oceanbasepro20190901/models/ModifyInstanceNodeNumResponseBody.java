// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceNodeNumResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyInstanceNodeNumResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceNodeNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNodeNumResponseBody self = new ModifyInstanceNodeNumResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNodeNumResponseBody setData(ModifyInstanceNodeNumResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyInstanceNodeNumResponseBodyData getData() {
        return this.data;
    }

    public ModifyInstanceNodeNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyInstanceNodeNumResponseBodyData extends TeaModel {
        @NameInMap("DryRunResult")
        public Boolean dryRunResult;

        @NameInMap("OrderId")
        public String orderId;

        public static ModifyInstanceNodeNumResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceNodeNumResponseBodyData self = new ModifyInstanceNodeNumResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceNodeNumResponseBodyData setDryRunResult(Boolean dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }
        public Boolean getDryRunResult() {
            return this.dryRunResult;
        }

        public ModifyInstanceNodeNumResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
