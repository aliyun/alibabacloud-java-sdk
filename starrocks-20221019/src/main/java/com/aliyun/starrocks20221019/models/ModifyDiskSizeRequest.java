// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyDiskSizeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically purchase (pay for) all products specified in the Products parameter.</p>
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
     * <p>Specifies whether to use the fast restart mode for restart. Default value: false.</p>
     * <ul>
     * <li>true: Restarts compute nodes in fast restart mode. Compute nodes are restarted in multiple batches. Nodes within a batch are restarted in parallel, and batches execute sequentially.</li>
     * <li>false: Restarts compute nodes in rolling restart mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FastMode")
    public Boolean fastMode;

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
     * <p>2345</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The target disk size. Unit: GB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Target")
    public Integer target;

    public static ModifyDiskSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskSizeRequest self = new ModifyDiskSizeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskSizeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDiskSizeRequest setFastMode(Boolean fastMode) {
        this.fastMode = fastMode;
        return this;
    }
    public Boolean getFastMode() {
        return this.fastMode;
    }

    public ModifyDiskSizeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDiskSizeRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ModifyDiskSizeRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public ModifyDiskSizeRequest setTarget(Integer target) {
        this.target = target;
        return this;
    }
    public Integer getTarget() {
        return this.target;
    }

}
