// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class GetVehicleRepairPlanRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("CarNumberImage")
    public String carNumberImage;

    @NameInMap("VinCodeImage")
    public String vinCodeImage;

    public static GetVehicleRepairPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVehicleRepairPlanRequest self = new GetVehicleRepairPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetVehicleRepairPlanRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetVehicleRepairPlanRequest setCarNumberImage(String carNumberImage) {
        this.carNumberImage = carNumberImage;
        return this;
    }
    public String getCarNumberImage() {
        return this.carNumberImage;
    }

    public GetVehicleRepairPlanRequest setVinCodeImage(String vinCodeImage) {
        this.vinCodeImage = vinCodeImage;
        return this;
    }
    public String getVinCodeImage() {
        return this.vinCodeImage;
    }

}
