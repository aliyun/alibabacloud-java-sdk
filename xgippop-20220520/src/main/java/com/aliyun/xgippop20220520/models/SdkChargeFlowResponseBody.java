// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkChargeFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SdkChargeFlowResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static SdkChargeFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdkChargeFlowResponseBody self = new SdkChargeFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public SdkChargeFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SdkChargeFlowResponseBody setData(SdkChargeFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SdkChargeFlowResponseBodyData getData() {
        return this.data;
    }

    public SdkChargeFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SdkChargeFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SdkChargeFlowResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public SdkChargeFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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
