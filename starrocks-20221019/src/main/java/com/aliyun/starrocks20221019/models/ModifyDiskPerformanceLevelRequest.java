// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyDiskPerformanceLevelRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically purchase (pay for) all products specified in the Products parameter. Valid values:</p>
     * <ul>
     * <li>true: Automatic payment.</li>
     * <li>false: No automatic payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The compute group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The target disk performance level (PL).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pl2</p>
     */
    @NameInMap("Target")
    public String target;

    public static ModifyDiskPerformanceLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskPerformanceLevelRequest self = new ModifyDiskPerformanceLevelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskPerformanceLevelRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDiskPerformanceLevelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDiskPerformanceLevelRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ModifyDiskPerformanceLevelRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public ModifyDiskPerformanceLevelRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
