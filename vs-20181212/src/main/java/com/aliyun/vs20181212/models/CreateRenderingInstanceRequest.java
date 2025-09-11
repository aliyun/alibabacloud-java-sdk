// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingInstanceRequest extends TeaModel {
    @NameInMap("Attributes")
    public CreateRenderingInstanceRequestAttributes attributes;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ClientInfo")
    public CreateRenderingInstanceRequestClientInfo clientInfo;

    @NameInMap("InstanceBillingCycle")
    public String instanceBillingCycle;

    /**
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <strong>example:</strong>
     * <p>95BandwidthByMonth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidth")
    public Long internetMaxBandwidth;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crs.cp.l1</p>
     */
    @NameInMap("RenderingSpec")
    public String renderingSpec;

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
        @NameInMap("EdgeMediaService")
        public String edgeMediaService;

        @NameInMap("InAccess")
        public String inAccess;

        @NameInMap("OutAccess")
        public String outAccess;

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
