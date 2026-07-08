// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingInstanceRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>Unless you have specific requirements, keep the default values. For customers with special requirements, fill in the relevant parameters after communication and confirmation.</p>
     * </blockquote>
     * <p>Attribute information.</p>
     */
    @NameInMap("Attributes")
    public CreateRenderingInstanceRequestAttributes attributes;

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
    public CreateRenderingInstanceRequestClientInfo clientInfo;

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

    public static CreateRenderingInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingInstanceRequest self = new CreateRenderingInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRenderingInstanceRequest setAttributes(CreateRenderingInstanceRequestAttributes attributes) {
        this.attributes = attributes;
        return this;
    }
    public CreateRenderingInstanceRequestAttributes getAttributes() {
        return this.attributes;
    }

    public CreateRenderingInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateRenderingInstanceRequest setClientInfo(CreateRenderingInstanceRequestClientInfo clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public CreateRenderingInstanceRequestClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public CreateRenderingInstanceRequest setInstanceBillingCycle(String instanceBillingCycle) {
        this.instanceBillingCycle = instanceBillingCycle;
        return this;
    }
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    public CreateRenderingInstanceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateRenderingInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateRenderingInstanceRequest setInternetMaxBandwidth(Long internetMaxBandwidth) {
        this.internetMaxBandwidth = internetMaxBandwidth;
        return this;
    }
    public Long getInternetMaxBandwidth() {
        return this.internetMaxBandwidth;
    }

    public CreateRenderingInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateRenderingInstanceRequest setRenderingSpec(String renderingSpec) {
        this.renderingSpec = renderingSpec;
        return this;
    }
    public String getRenderingSpec() {
        return this.renderingSpec;
    }

    public CreateRenderingInstanceRequest setStorageSize(String storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public String getStorageSize() {
        return this.storageSize;
    }

    public static class CreateRenderingInstanceRequestAttributes extends TeaModel {
        /**
         * <p>Streaming service.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("EdgeMediaService")
        public String edgeMediaService;

        /**
         * <p>Inbound access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("InAccess")
        public String inAccess;

        /**
         * <p>Outbound access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("OutAccess")
        public String outAccess;

        /**
         * <p>Resource domain.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static CreateRenderingInstanceRequestAttributes build(java.util.Map<String, ?> map) throws Exception {
            CreateRenderingInstanceRequestAttributes self = new CreateRenderingInstanceRequestAttributes();
            return TeaModel.build(map, self);
        }

        public CreateRenderingInstanceRequestAttributes setEdgeMediaService(String edgeMediaService) {
            this.edgeMediaService = edgeMediaService;
            return this;
        }
        public String getEdgeMediaService() {
            return this.edgeMediaService;
        }

        public CreateRenderingInstanceRequestAttributes setInAccess(String inAccess) {
            this.inAccess = inAccess;
            return this;
        }
        public String getInAccess() {
            return this.inAccess;
        }

        public CreateRenderingInstanceRequestAttributes setOutAccess(String outAccess) {
            this.outAccess = outAccess;
            return this;
        }
        public String getOutAccess() {
            return this.outAccess;
        }

        public CreateRenderingInstanceRequestAttributes setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class CreateRenderingInstanceRequestClientInfo extends TeaModel {
        /**
         * <p>Client IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.128.110</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        public static CreateRenderingInstanceRequestClientInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateRenderingInstanceRequestClientInfo self = new CreateRenderingInstanceRequestClientInfo();
            return TeaModel.build(map, self);
        }

        public CreateRenderingInstanceRequestClientInfo setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

    }

}
