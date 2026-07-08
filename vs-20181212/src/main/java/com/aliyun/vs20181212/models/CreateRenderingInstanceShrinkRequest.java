// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingInstanceShrinkRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>Unless you have specific requirements, keep the default values. For customers with special requirements, fill in the relevant parameters after communication and confirmation.</p>
     * </blockquote>
     * <p>Attribute information.</p>
     */
    @NameInMap("Attributes")
    public String attributesShrink;

    /**
     * <blockquote>
     * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PrePaid</code> (subscription).</p>
     * </blockquote>
     * <p>Enable or disable auto-renewal. Values:</p>
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
     * <p>Client information.</p>
     */
    @NameInMap("ClientInfo")
    public String clientInfoShrink;

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
     * <p>The billing method for the instance. Valid values:</p>
     * <ul>
     * <li><p>PrePaid (default): Subscription.</p>
     * </li>
     * <li><p>PostPaid: Pay-as-you-go.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <blockquote>
     * <p>Only one billing method is allowed. If a billing method already exists, the new value is invalid by default, and the existing one prevails. Note that this field is required when a user makes the first purchase.</p>
     * </blockquote>
     * <p>Network billing type. Value:</p>
     * <ul>
     * <li>95BandwidthByMonth: Monthly 95th percentile bandwidth.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>95BandwidthByMonth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>Maximum bandwidth, in Mbps. Default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidth")
    public Long internetMaxBandwidth;

    /**
     * <blockquote>
     * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PrePaid</code> (subscription).</p>
     * </blockquote>
     * <p>The subscription period. Valid values (Note: 12 is converted to one year; other values are in months):</p>
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
     * <p>Cloud application service instance specifications.</p>
     * <ul>
     * <li><p>For crs.cp.\* series specifications, choose between subscription or pay-as-you-go billing.</p>
     * </li>
     * <li><p>For crs.vm.\* series specifications, choose between subscription or pay-as-you-go billing.</p>
     * </li>
     * <li><p>For other series, only subscription billing is supported.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crs.cp.l1</p>
     */
    @NameInMap("RenderingSpec")
    public String renderingSpec;

    /**
     * <p>The cloud storage capacity used by the cloud application service instance (Note: not local storage).</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("StorageSize")
    public String storageSize;

    public static CreateRenderingInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingInstanceShrinkRequest self = new CreateRenderingInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRenderingInstanceShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

    public CreateRenderingInstanceShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateRenderingInstanceShrinkRequest setClientInfoShrink(String clientInfoShrink) {
        this.clientInfoShrink = clientInfoShrink;
        return this;
    }
    public String getClientInfoShrink() {
        return this.clientInfoShrink;
    }

    public CreateRenderingInstanceShrinkRequest setInstanceBillingCycle(String instanceBillingCycle) {
        this.instanceBillingCycle = instanceBillingCycle;
        return this;
    }
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    public CreateRenderingInstanceShrinkRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateRenderingInstanceShrinkRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateRenderingInstanceShrinkRequest setInternetMaxBandwidth(Long internetMaxBandwidth) {
        this.internetMaxBandwidth = internetMaxBandwidth;
        return this;
    }
    public Long getInternetMaxBandwidth() {
        return this.internetMaxBandwidth;
    }

    public CreateRenderingInstanceShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateRenderingInstanceShrinkRequest setRenderingSpec(String renderingSpec) {
        this.renderingSpec = renderingSpec;
        return this;
    }
    public String getRenderingSpec() {
        return this.renderingSpec;
    }

    public CreateRenderingInstanceShrinkRequest setStorageSize(String storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public String getStorageSize() {
        return this.storageSize;
    }

}
