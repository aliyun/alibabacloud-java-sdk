// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ReduceAmountResponseBody extends TeaModel {
    @NameInMap("Data")
    public ReduceAmountResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReduceAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReduceAmountResponseBody self = new ReduceAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public ReduceAmountResponseBody setData(ReduceAmountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReduceAmountResponseBodyData getData() {
        return this.data;
    }

    public ReduceAmountResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ReduceAmountResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ReduceAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReduceAmountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReduceAmountResponseBodyData extends TeaModel {
        @NameInMap("ChargeDetail")
        public String chargeDetail;

        @NameInMap("Price")
        public Long price;

        @NameInMap("TaskId")
        public Long taskId;

        public static ReduceAmountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReduceAmountResponseBodyData self = new ReduceAmountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReduceAmountResponseBodyData setChargeDetail(String chargeDetail) {
            this.chargeDetail = chargeDetail;
            return this;
        }
        public String getChargeDetail() {
            return this.chargeDetail;
        }

        public ReduceAmountResponseBodyData setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public ReduceAmountResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
