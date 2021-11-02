// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckDeviceResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Plans")
    public CheckDeviceResponseBodyPlans plans;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    public static CheckDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDeviceResponseBody self = new CheckDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDeviceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckDeviceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CheckDeviceResponseBody setPlans(CheckDeviceResponseBodyPlans plans) {
        this.plans = plans;
        return this;
    }
    public CheckDeviceResponseBodyPlans getPlans() {
        return this.plans;
    }

    public CheckDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDeviceResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public static class CheckDeviceResponseBodyPlansPlanDto extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("StartTime")
        public String startTime;

        public static CheckDeviceResponseBodyPlansPlanDto build(java.util.Map<String, ?> map) throws Exception {
            CheckDeviceResponseBodyPlansPlanDto self = new CheckDeviceResponseBodyPlansPlanDto();
            return TeaModel.build(map, self);
        }

        public CheckDeviceResponseBodyPlansPlanDto setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CheckDeviceResponseBodyPlansPlanDto setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CheckDeviceResponseBodyPlansPlanDto setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CheckDeviceResponseBodyPlansPlanDto setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CheckDeviceResponseBodyPlans extends TeaModel {
        @NameInMap("PlanDto")
        public java.util.List<CheckDeviceResponseBodyPlansPlanDto> planDto;

        public static CheckDeviceResponseBodyPlans build(java.util.Map<String, ?> map) throws Exception {
            CheckDeviceResponseBodyPlans self = new CheckDeviceResponseBodyPlans();
            return TeaModel.build(map, self);
        }

        public CheckDeviceResponseBodyPlans setPlanDto(java.util.List<CheckDeviceResponseBodyPlansPlanDto> planDto) {
            this.planDto = planDto;
            return this;
        }
        public java.util.List<CheckDeviceResponseBodyPlansPlanDto> getPlanDto() {
            return this.planDto;
        }

    }

}
