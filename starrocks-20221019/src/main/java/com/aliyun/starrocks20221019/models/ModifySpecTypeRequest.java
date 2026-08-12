// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifySpecTypeRequest extends TeaModel {
    /**
     * <p>Restart in fast restart mode. Default is false.</p>
     * <ul>
     * <li><p>true: Restarts compute nodes in fast restart mode. Nodes restart in parallel within a batch, and batches execute sequentially.</p>
     * </li>
     * <li><p>false: Restarts compute nodes in rolling restart mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FastMode")
    public Boolean fastMode;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Compute group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>Coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>Target specifications type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("TargetSpecType")
    public String targetSpecType;

    public static ModifySpecTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySpecTypeRequest self = new ModifySpecTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifySpecTypeRequest setFastMode(Boolean fastMode) {
        this.fastMode = fastMode;
        return this;
    }
    public Boolean getFastMode() {
        return this.fastMode;
    }

    public ModifySpecTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySpecTypeRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ModifySpecTypeRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public ModifySpecTypeRequest setTargetSpecType(String targetSpecType) {
        this.targetSpecType = targetSpecType;
        return this;
    }
    public String getTargetSpecType() {
        return this.targetSpecType;
    }

}
