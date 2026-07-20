// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetValidDeductInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetValidDeductInstancesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2FBDD713-00A5-5C98-B661-3FD31A349B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetValidDeductInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetValidDeductInstancesResponseBody self = new GetValidDeductInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetValidDeductInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetValidDeductInstancesResponseBody setData(GetValidDeductInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetValidDeductInstancesResponseBodyData getData() {
        return this.data;
    }

    public GetValidDeductInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetValidDeductInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetValidDeductInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CurrentPeriodUsed")
        public Long currentPeriodUsed;

        /**
         * <strong>example:</strong>
         * <p>1737734400000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("InitCapacity")
        public Double initCapacity;

        /**
         * <strong>example:</strong>
         * <p>apigateway-hz-96f6659a1490</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>POST_HOST</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodCapacity")
        public Double periodCapacity;

        /**
         * <strong>example:</strong>
         * <p>1737734400000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>CREATE_FAILED</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList build(java.util.Map<String, ?> map) throws Exception {
            GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList self = new GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList();
            return TeaModel.build(map, self);
        }

        public GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList setCurrentPeriodUsed(Long currentPeriodUsed) {
            this.currentPeriodUsed = currentPeriodUsed;
            return this;
        }
        public Long getCurrentPeriodUsed() {
            return this.currentPeriodUsed;
        }

        public GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList setInitCapacity(Double initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public Double getInitCapacity() {
            return this.initCapacity;
        }

        public GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList setPeriodCapacity(Double periodCapacity) {
            this.periodCapacity = periodCapacity;
            return this;
        }
        public Double getPeriodCapacity() {
            return this.periodCapacity;
        }

        public GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetValidDeductInstancesResponseBodyDataBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanTry")
        public Boolean canTry;

        @NameInMap("DeductPackageList")
        public java.util.List<GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList> deductPackageList;

        public static GetValidDeductInstancesResponseBodyDataBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetValidDeductInstancesResponseBodyDataBodyData self = new GetValidDeductInstancesResponseBodyDataBodyData();
            return TeaModel.build(map, self);
        }

        public GetValidDeductInstancesResponseBodyDataBodyData setCanTry(Boolean canTry) {
            this.canTry = canTry;
            return this;
        }
        public Boolean getCanTry() {
            return this.canTry;
        }

        public GetValidDeductInstancesResponseBodyDataBodyData setDeductPackageList(java.util.List<GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList> deductPackageList) {
            this.deductPackageList = deductPackageList;
            return this;
        }
        public java.util.List<GetValidDeductInstancesResponseBodyDataBodyDataDeductPackageList> getDeductPackageList() {
            return this.deductPackageList;
        }

    }

    public static class GetValidDeductInstancesResponseBodyDataBody extends TeaModel {
        @NameInMap("Data")
        public GetValidDeductInstancesResponseBodyDataBodyData data;

        /**
         * <strong>example:</strong>
         * <p>A6FB9AC3-4431-538F-BA8A-2A13AEA208A4</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static GetValidDeductInstancesResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            GetValidDeductInstancesResponseBodyDataBody self = new GetValidDeductInstancesResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public GetValidDeductInstancesResponseBodyDataBody setData(GetValidDeductInstancesResponseBodyDataBodyData data) {
            this.data = data;
            return this;
        }
        public GetValidDeductInstancesResponseBodyDataBodyData getData() {
            return this.data;
        }

        public GetValidDeductInstancesResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

    public static class GetValidDeductInstancesResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public GetValidDeductInstancesResponseBodyDataBody body;

        public static GetValidDeductInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetValidDeductInstancesResponseBodyData self = new GetValidDeductInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetValidDeductInstancesResponseBodyData setBody(GetValidDeductInstancesResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public GetValidDeductInstancesResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
