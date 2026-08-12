// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyDiskTypeRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the compute group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The ID of the coupon.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The target disk type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>essd</p>
     */
    @NameInMap("TargetDiskType")
    public String targetDiskType;

    /**
     * <p>The target disk performance level.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pl2</p>
     */
    @NameInMap("TargetPerformanceLevel")
    public String targetPerformanceLevel;

    public static ModifyDiskTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskTypeRequest self = new ModifyDiskTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDiskTypeRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ModifyDiskTypeRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public ModifyDiskTypeRequest setTargetDiskType(String targetDiskType) {
        this.targetDiskType = targetDiskType;
        return this;
    }
    public String getTargetDiskType() {
        return this.targetDiskType;
    }

    public ModifyDiskTypeRequest setTargetPerformanceLevel(String targetPerformanceLevel) {
        this.targetPerformanceLevel = targetPerformanceLevel;
        return this;
    }
    public String getTargetPerformanceLevel() {
        return this.targetPerformanceLevel;
    }

}
