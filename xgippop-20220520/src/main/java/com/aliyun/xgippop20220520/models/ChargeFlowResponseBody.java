// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ChargeFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ChargeFlowResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static ChargeFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChargeFlowResponseBody self = new ChargeFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ChargeFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChargeFlowResponseBody setData(ChargeFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChargeFlowResponseBodyData getData() {
        return this.data;
    }

    public ChargeFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChargeFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChargeFlowResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public ChargeFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChargeFlowResponseBodyData extends TeaModel {
        @NameInMap("CustomerFlowRequestId")
        public String customerFlowRequestId;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Status")
        public Boolean status;

        public static ChargeFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChargeFlowResponseBodyData self = new ChargeFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChargeFlowResponseBodyData setCustomerFlowRequestId(String customerFlowRequestId) {
            this.customerFlowRequestId = customerFlowRequestId;
            return this;
        }
        public String getCustomerFlowRequestId() {
            return this.customerFlowRequestId;
        }

        public ChargeFlowResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ChargeFlowResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

    public static class SdkChargeFlowResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        public static SdkChargeFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SdkChargeFlowResponseBodyData self = new SdkChargeFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SdkChargeFlowResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SdkChargeFlowResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SdkChargeFlowResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public SdkChargeFlowResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public SdkChargeFlowResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
