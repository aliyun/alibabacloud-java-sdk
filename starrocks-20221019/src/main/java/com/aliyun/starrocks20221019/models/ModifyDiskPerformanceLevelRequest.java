// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyDiskPerformanceLevelRequest extends TeaModel {
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
     * <p>The warehouse ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The disk performance level to which you want to change.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>pl0</li>
     * <li>pl1</li>
     * <li>pl2</li>
     * <li>pl3</li>
     * </ul>
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
