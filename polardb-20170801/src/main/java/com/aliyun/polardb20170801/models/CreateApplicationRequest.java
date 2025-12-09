// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("Components")
    public java.util.List<CreateApplicationRequestComponents> components;

    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Endpoints")
    public java.util.List<CreateApplicationRequestEndpoints> endpoints;

    /**
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <strong>example:</strong>
     * <p>pcs-********************</p>
     */
    @NameInMap("PolarFSInstanceId")
    public String polarFSInstanceId;

    /**
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-********************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing-k</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreateApplicationRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public CreateApplicationRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateApplicationRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateApplicationRequest setComponents(java.util.List<CreateApplicationRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<CreateApplicationRequestComponents> getComponents() {
        return this.components;
    }

    public CreateApplicationRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateApplicationRequest setEndpoints(java.util.List<CreateApplicationRequestEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<CreateApplicationRequestEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public CreateApplicationRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateApplicationRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateApplicationRequest setPolarFSInstanceId(String polarFSInstanceId) {
        this.polarFSInstanceId = polarFSInstanceId;
        return this;
    }
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
    }

    public CreateApplicationRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CreateApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateApplicationRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateApplicationRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateApplicationRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateApplicationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateApplicationRequestComponents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>polar.app.g2.medium</p>
         */
        @NameInMap("ComponentClass")
        public String componentClass;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentMaxReplica")
        public Long componentMaxReplica;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentReplica")
        public Long componentReplica;

        /**
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        @NameInMap("ScaleMax")
        public String scaleMax;

        @NameInMap("ScaleMin")
        public String scaleMin;

        /**
         * <strong>example:</strong>
         * <p>sg-********************</p>
         */
        @NameInMap("SecurityGroups")
        public String securityGroups;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SecurityIPArrayName")
        public String securityIPArrayName;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("SecurityIPType")
        public String securityIPType;

        public static CreateApplicationRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestComponents self = new CreateApplicationRequestComponents();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestComponents setComponentClass(String componentClass) {
            this.componentClass = componentClass;
            return this;
        }
        public String getComponentClass() {
            return this.componentClass;
        }

        public CreateApplicationRequestComponents setComponentMaxReplica(Long componentMaxReplica) {
            this.componentMaxReplica = componentMaxReplica;
            return this;
        }
        public Long getComponentMaxReplica() {
            return this.componentMaxReplica;
        }

        public CreateApplicationRequestComponents setComponentReplica(Long componentReplica) {
            this.componentReplica = componentReplica;
            return this;
        }
        public Long getComponentReplica() {
            return this.componentReplica;
        }

        public CreateApplicationRequestComponents setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public CreateApplicationRequestComponents setScaleMax(String scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public String getScaleMax() {
            return this.scaleMax;
        }

        public CreateApplicationRequestComponents setScaleMin(String scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public String getScaleMin() {
            return this.scaleMin;
        }

        public CreateApplicationRequestComponents setSecurityGroups(String securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public String getSecurityGroups() {
            return this.securityGroups;
        }

        public CreateApplicationRequestComponents setSecurityIPArrayName(String securityIPArrayName) {
            this.securityIPArrayName = securityIPArrayName;
            return this;
        }
        public String getSecurityIPArrayName() {
            return this.securityIPArrayName;
        }

        public CreateApplicationRequestComponents setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public CreateApplicationRequestComponents setSecurityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }
        public String getSecurityIPType() {
            return this.securityIPType;
        }

    }

    public static class CreateApplicationRequestEndpoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my_endpoint</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        public static CreateApplicationRequestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestEndpoints self = new CreateApplicationRequestEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestEndpoints setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApplicationRequestEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

    }

}
