// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class GenerateVehicleRepairPlanResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateVehicleRepairPlanResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateVehicleRepairPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateVehicleRepairPlanResponseBody self = new GenerateVehicleRepairPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateVehicleRepairPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateVehicleRepairPlanResponseBody setData(GenerateVehicleRepairPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateVehicleRepairPlanResponseBodyData getData() {
        return this.data;
    }

    public GenerateVehicleRepairPlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateVehicleRepairPlanResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GenerateVehicleRepairPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateVehicleRepairPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateVehicleRepairPlanResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static GenerateVehicleRepairPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateVehicleRepairPlanResponseBodyData self = new GenerateVehicleRepairPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateVehicleRepairPlanResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
