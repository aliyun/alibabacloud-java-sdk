// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class GetVehicleRepairPlanAdvanceRequest extends TeaModel {
    @NameInMap("CarNumberImage")
    public java.io.InputStream carNumberImageObject;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("VinCodeImage")
    public java.io.InputStream vinCodeImageObject;

    public static GetVehicleRepairPlanAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVehicleRepairPlanAdvanceRequest self = new GetVehicleRepairPlanAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GetVehicleRepairPlanAdvanceRequest setCarNumberImageObject(java.io.InputStream carNumberImageObject) {
        this.carNumberImageObject = carNumberImageObject;
        return this;
    }
    public java.io.InputStream getCarNumberImageObject() {
        return this.carNumberImageObject;
    }

    public GetVehicleRepairPlanAdvanceRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetVehicleRepairPlanAdvanceRequest setVinCodeImageObject(java.io.InputStream vinCodeImageObject) {
        this.vinCodeImageObject = vinCodeImageObject;
        return this;
    }
    public java.io.InputStream getVinCodeImageObject() {
        return this.vinCodeImageObject;
    }

}
