// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetFreeFlowInstanceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static GetFreeFlowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowInstanceResponseBody self = new GetFreeFlowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFreeFlowInstanceResponseBody setData(java.util.List<GetFreeFlowInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFreeFlowInstanceResponseBodyData> getData() {
        return this.data;
    }

    public GetFreeFlowInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFreeFlowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFreeFlowInstanceResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetFreeFlowInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFreeFlowInstanceResponseBodyData extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceMemo")
        public String instanceMemo;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("OpenTime")
        public String openTime;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("StartTime")
        public String startTime;

        public static GetFreeFlowInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFreeFlowInstanceResponseBodyData self = new GetFreeFlowInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFreeFlowInstanceResponseBodyData setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetFreeFlowInstanceResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetFreeFlowInstanceResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetFreeFlowInstanceResponseBodyData setInstanceMemo(String instanceMemo) {
            this.instanceMemo = instanceMemo;
            return this;
        }
        public String getInstanceMemo() {
            return this.instanceMemo;
        }

        public GetFreeFlowInstanceResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetFreeFlowInstanceResponseBodyData setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public GetFreeFlowInstanceResponseBodyData setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetFreeFlowInstanceResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
