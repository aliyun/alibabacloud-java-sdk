// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CreateIntentionOrderResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public CreateIntentionOrderResponseBodyData data;

    public static CreateIntentionOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentionOrderResponseBody self = new CreateIntentionOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIntentionOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateIntentionOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIntentionOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateIntentionOrderResponseBody setData(CreateIntentionOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIntentionOrderResponseBodyData getData() {
        return this.data;
    }

    public static class CreateIntentionOrderResponseBodyData extends TeaModel {
        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        public static CreateIntentionOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIntentionOrderResponseBodyData self = new CreateIntentionOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIntentionOrderResponseBodyData setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

    }

}
