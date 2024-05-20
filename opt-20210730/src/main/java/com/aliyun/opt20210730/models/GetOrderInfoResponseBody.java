// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730.models;

import com.aliyun.tea.*;

public class GetOrderInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOrderInfoResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOrderInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrderInfoResponseBody self = new GetOrderInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrderInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOrderInfoResponseBody setData(java.util.List<GetOrderInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOrderInfoResponseBodyData> getData() {
        return this.data;
    }

    public GetOrderInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOrderInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrderInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrderInfoResponseBodyData extends TeaModel {
        @NameInMap("bizType")
        public String bizType;

        @NameInMap("currentConcurrency")
        public Integer currentConcurrency;

        @NameInMap("currentDays")
        public Integer currentDays;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("licenseKey")
        public String licenseKey;

        @NameInMap("remark")
        public String remark;

        @NameInMap("totalDays")
        public Integer totalDays;

        public static GetOrderInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrderInfoResponseBodyData self = new GetOrderInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrderInfoResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetOrderInfoResponseBodyData setCurrentConcurrency(Integer currentConcurrency) {
            this.currentConcurrency = currentConcurrency;
            return this;
        }
        public Integer getCurrentConcurrency() {
            return this.currentConcurrency;
        }

        public GetOrderInfoResponseBodyData setCurrentDays(Integer currentDays) {
            this.currentDays = currentDays;
            return this;
        }
        public Integer getCurrentDays() {
            return this.currentDays;
        }

        public GetOrderInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetOrderInfoResponseBodyData setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public GetOrderInfoResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetOrderInfoResponseBodyData setTotalDays(Integer totalDays) {
            this.totalDays = totalDays;
            return this;
        }
        public Integer getTotalDays() {
            return this.totalDays;
        }

    }

}
