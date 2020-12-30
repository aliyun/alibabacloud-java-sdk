// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class GenerateVehicleRepairPlanRequest extends TeaModel {
    @NameInMap("DamageImageList")
    public java.util.List<GenerateVehicleRepairPlanRequestDamageImageList> damageImageList;

    public static GenerateVehicleRepairPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVehicleRepairPlanRequest self = new GenerateVehicleRepairPlanRequest();
        return TeaModel.build(map, self);
    }

    public GenerateVehicleRepairPlanRequest setDamageImageList(java.util.List<GenerateVehicleRepairPlanRequestDamageImageList> damageImageList) {
        this.damageImageList = damageImageList;
        return this;
    }
    public java.util.List<GenerateVehicleRepairPlanRequestDamageImageList> getDamageImageList() {
        return this.damageImageList;
    }

    public static class GenerateVehicleRepairPlanRequestDamageImageList extends TeaModel {
        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        @NameInMap("ImageUrl")
        public String imageUrl;

        public static GenerateVehicleRepairPlanRequestDamageImageList build(java.util.Map<String, ?> map) throws Exception {
            GenerateVehicleRepairPlanRequestDamageImageList self = new GenerateVehicleRepairPlanRequestDamageImageList();
            return TeaModel.build(map, self);
        }

        public GenerateVehicleRepairPlanRequestDamageImageList setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public GenerateVehicleRepairPlanRequestDamageImageList setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

}
