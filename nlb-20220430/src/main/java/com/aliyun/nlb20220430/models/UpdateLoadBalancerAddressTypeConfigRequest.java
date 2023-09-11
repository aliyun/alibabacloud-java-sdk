// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAddressTypeConfigRequest extends TeaModel {
    /**
     * <p>The new network type. Valid values:</p>
     * <br>
     * <p>*   **Internet**: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.</p>
     * <p>*   **Intranet**: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. In this case, the NLB instance can be accessed over the virtual private cloud (VPC) where the NLB instance is deployed.</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The NLB instance ID.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The region ID of the NLB instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The mappings between zones and vSwitches. You can specify at most 10 zones in each call.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> zoneMappings;

    public static UpdateLoadBalancerAddressTypeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAddressTypeConfigRequest self = new UpdateLoadBalancerAddressTypeConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setZoneMappings(java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class UpdateLoadBalancerAddressTypeConfigRequestZoneMappings extends TeaModel {
        /**
         * <p>The ID of the elastic IP address (EIP).</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The type of the EIP. Valid values:</p>
         * <br>
         * <p>*   **Common**</p>
         * <p>*   **Anycast**</p>
         * <br>
         * <p>> Anycast EIPs are supported only by NLB instances in the China (Hong Kong) region. This parameter is required when **AddressType** is set to **Internet**.</p>
         */
        @NameInMap("EipType")
        public String eipType;

        /**
         * <p>The ID of the vSwitch in the zone. Each zone can contain only one vSwitch and one subnet.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the NLB instance.</p>
         * <br>
         * <p>You can call the [DescribeZones](~~443890~~) operation to query the most recent zone list.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateLoadBalancerAddressTypeConfigRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerAddressTypeConfigRequestZoneMappings self = new UpdateLoadBalancerAddressTypeConfigRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setEipType(String eipType) {
            this.eipType = eipType;
            return this;
        }
        public String getEipType() {
            return this.eipType;
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
