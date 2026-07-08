// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyRenderingChargeTypeRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PrePaid</code> (subscription).</p>
     * </blockquote>
     * <p>Enable or disable auto-renewal. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable.</p>
     * </li>
     * <li><p><strong>false</strong>: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <blockquote>
     * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PostPaid</code> (pay-as-you-go).</p>
     * </blockquote>
     * <p>Billing type. Valid values:</p>
     * <ul>
     * <li>Hour: Hourly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("InstanceBillingCycle")
    public String instanceBillingCycle;

    /**
     * <p>The target billing method for the instance. Valid values:</p>
     * <ul>
     * <li><p>PrePaid (default): Subscription.</p>
     * </li>
     * <li><p>PostPaid: Pay-as-you-go.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <blockquote>
     * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PrePaid</code> (subscription).</p>
     * </blockquote>
     * <p>The duration for subscription. Valid values (Note: If you select 12, it converts to one year; other values are in months):</p>
     * <ul>
     * <li><p>1 (default)</p>
     * </li>
     * <li><p>2</p>
     * </li>
     * <li><p>3</p>
     * </li>
     * <li><p>4</p>
     * </li>
     * <li><p>5</p>
     * </li>
     * <li><p>6</p>
     * </li>
     * <li><p>7</p>
     * </li>
     * <li><p>8</p>
     * </li>
     * <li><p>9</p>
     * </li>
     * <li><p>12</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The ID of the Graphic Computing Service instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static ModifyRenderingChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRenderingChargeTypeRequest self = new ModifyRenderingChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRenderingChargeTypeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ModifyRenderingChargeTypeRequest setInstanceBillingCycle(String instanceBillingCycle) {
        this.instanceBillingCycle = instanceBillingCycle;
        return this;
    }
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    public ModifyRenderingChargeTypeRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ModifyRenderingChargeTypeRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public ModifyRenderingChargeTypeRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
