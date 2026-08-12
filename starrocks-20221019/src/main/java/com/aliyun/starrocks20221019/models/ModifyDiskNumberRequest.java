// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyDiskNumberRequest extends TeaModel {
    /**
     * <p>Specifies whether to restart the compute nodes in fast mode. Default value: false.</p>
     * <ul>
     * <li><p>true: Restarts the compute nodes in fast mode. The nodes are restarted in batches. Nodes within a batch are restarted in parallel, and the batches are processed sequentially.</p>
     * </li>
     * <li><p>false: Restarts the compute nodes in rolling restart mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The target number of disks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Target")
    public Integer target;

    public static ModifyDiskNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskNumberRequest self = new ModifyDiskNumberRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskNumberRequest setFastMode(Boolean fastMode) {
        this.fastMode = fastMode;
        return this;
    }
    public Boolean getFastMode() {
        return this.fastMode;
    }

    public ModifyDiskNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDiskNumberRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ModifyDiskNumberRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public ModifyDiskNumberRequest setTarget(Integer target) {
        this.target = target;
        return this;
    }
    public Integer getTarget() {
        return this.target;
    }

}
