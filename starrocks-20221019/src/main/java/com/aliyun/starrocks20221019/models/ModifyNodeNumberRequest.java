// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyNodeNumberRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically purchase (pay for) all products specified in the Products parameter. Valid values:</p>
     * <ul>
     * <li>true: Automatic payment.</li>
     * <li>false: No automatic payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>The decommission concurrency for BE scale-in scenarios in compute-storage coupled mode. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Parallelism")
    public Integer parallelism;

    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The target number of nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Target")
    public Integer target;

    /**
     * <p>The wait time for running tasks to complete before dropping nodes during CN scale-in scenarios in compute-storage decoupled mode.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TerminationGracePeriodSeconds")
    public Integer terminationGracePeriodSeconds;

    public static ModifyNodeNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeNumberRequest self = new ModifyNodeNumberRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodeNumberRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyNodeNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyNodeNumberRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ModifyNodeNumberRequest setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Integer getParallelism() {
        return this.parallelism;
    }

    public ModifyNodeNumberRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public ModifyNodeNumberRequest setTarget(Integer target) {
        this.target = target;
        return this;
    }
    public Integer getTarget() {
        return this.target;
    }

    public ModifyNodeNumberRequest setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

}
