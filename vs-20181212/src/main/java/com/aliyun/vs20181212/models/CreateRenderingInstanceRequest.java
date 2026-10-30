// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingInstanceRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>Keep the default value unless you have special requirements. If you have special requirements, contact technical support to confirm and then specify the relevant parameters.</p>
     * </blockquote>
     * <p>The attribute information.</p>
     */
    @NameInMap("Attributes")
    public CreateRenderingInstanceRequestAttributes attributes;

    /**
     * <blockquote>
     * <p>This parameter takes effect only when <code>InstanceChargeType</code> is set to <code>PrePaid</code> (subscription).</p>
     * </blockquote>
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: disables auto-renewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The client information.</p>
     */
    @NameInMap("ClientInfo")
    public CreateRenderingInstanceRequestClientInfo clientInfo;

    /**
     * <blockquote>
     * <p>This parameter takes effect only when <code>InstanceChargeType</code> is set to <code>PostPaid</code> (pay-as-you-go).</p>
     * </blockquote>
     * <p>The billing cycle. Valid values:</p>
     * <ul>
     * <li>Hour: hour.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("InstanceBillingCycle")
    public String instanceBillingCycle;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PrePaid (default): subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <blockquote>
     * <p>Only one billing method is supported. If a billing method already exists, the new value is invalid by default, and the existing billing method prevails. Note that this parameter is required when you purchase the instance for the first time.</p>
     * </blockquote>
     * <p>The network billing type. Valid values:</p>
     * <ul>
     * <li>95BandwidthByMonth: monthly 95th percentile bandwidth.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>95BandwidthByMonth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum bandwidth. Unit: Mbit/s. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidth")
    public Long internetMaxBandwidth;

    /**
     * <blockquote>
     * <p>This parameter takes effect only when <code>InstanceChargeType</code> is set to <code>PrePaid</code> (subscription).</p>
     * </blockquote>
     * <p>The subscription duration. Valid values (Note: If you select 12, the duration is calculated as one year. For other values, the unit is months):</p>
     * <ul>
     * <li>1 (default)</li>
     * <li>2</li>
     * <li>3</li>
     * <li>4</li>
     * <li>5</li>
     * <li>6</li>
     * <li>7</li>
     * <li>8</li>
     * <li>9</li>
     * <li>12</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The specification of the cloud application service instance.</p>
     * <ul>
     * <li>If the specification belongs to the crs.cp.* series, the billing method can be subscription or pay-as-you-go.</li>
     * <li>If the specification belongs to the crs.vm.* series, the billing method can be subscription or pay-as-you-go.</li>
     * <li>For other series, only the subscription billing method is supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crs.cp.l1</p>
     */
    @NameInMap("RenderingSpec")
    public String renderingSpec;

    /**
     * <p>The cloud storage capacity used by the cloud application service instance. Note: This is not local storage.</p>
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
         * <p>The streaming service.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("EdgeMediaService")
        public String edgeMediaService;

        /**
         * <p>The inbound network configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("InAccess")
        public String inAccess;

        /**
         * <p>The outbound network configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("OutAccess")
        public String outAccess;

        /**
         * <p>The resource domain.</p>
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
         * <p>The IP address of the client.</p>
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
