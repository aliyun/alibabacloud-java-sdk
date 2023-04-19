// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>The protocol version. Valid values:</p>
     * <br>
     * <p>*   **ipv4:** IPv4. This is the default value.</p>
     * <p>*   **DualStack:** dual stack.</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The type of IPv4 address used by the NLB instance. Valid values:</p>
     * <br>
     * <p>*   **Internet**: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.</p>
     * <p>*   **Intranet**: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the virtual private cloud (VPC) where the NLB instance is deployed.</p>
     * <br>
     * <p>>  To enable a public IPv6 address for an NLB instance, call the [EnableLoadBalancerIpv6Internet](~~445878~~) operation.</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the EIP bandwidth plan that is associated with the Internet-facing NLB instance.</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request is different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration of the deletion protection feature.</p>
     */
    @NameInMap("DeletionProtectionConfig")
    public CreateLoadBalancerRequestDeletionProtectionConfig deletionProtectionConfig;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: performs a dry run and sends the request. This is the default value. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The billing settings of the NLB instance.</p>
     */
    @NameInMap("LoadBalancerBillingConfig")
    public CreateLoadBalancerRequestLoadBalancerBillingConfig loadBalancerBillingConfig;

    /**
     * <p>The name of the NLB instance.</p>
     * <br>
     * <p>The value must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter.</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The type of the instance. Set the value to **network**, which specifies an NLB instance.</p>
     */
    @NameInMap("LoadBalancerType")
    public String loadBalancerType;

    /**
     * <p>The configuration of the configuration read-only mode.</p>
     */
    @NameInMap("ModificationProtectionConfig")
    public CreateLoadBalancerRequestModificationProtectionConfig modificationProtectionConfig;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the VPC where the NLB instance is deployed.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The mappings between zones and vSwitches. You must add at least two zones. You can add a maximum of 10 zones.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<CreateLoadBalancerRequestZoneMappings> zoneMappings;

    public static CreateLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerRequest self = new CreateLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public CreateLoadBalancerRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateLoadBalancerRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CreateLoadBalancerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLoadBalancerRequest setDeletionProtectionConfig(CreateLoadBalancerRequestDeletionProtectionConfig deletionProtectionConfig) {
        this.deletionProtectionConfig = deletionProtectionConfig;
        return this;
    }
    public CreateLoadBalancerRequestDeletionProtectionConfig getDeletionProtectionConfig() {
        return this.deletionProtectionConfig;
    }

    public CreateLoadBalancerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateLoadBalancerRequest setLoadBalancerBillingConfig(CreateLoadBalancerRequestLoadBalancerBillingConfig loadBalancerBillingConfig) {
        this.loadBalancerBillingConfig = loadBalancerBillingConfig;
        return this;
    }
    public CreateLoadBalancerRequestLoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.loadBalancerBillingConfig;
    }

    public CreateLoadBalancerRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public CreateLoadBalancerRequest setLoadBalancerType(String loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    public CreateLoadBalancerRequest setModificationProtectionConfig(CreateLoadBalancerRequestModificationProtectionConfig modificationProtectionConfig) {
        this.modificationProtectionConfig = modificationProtectionConfig;
        return this;
    }
    public CreateLoadBalancerRequestModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    public CreateLoadBalancerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLoadBalancerRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLoadBalancerRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateLoadBalancerRequest setZoneMappings(java.util.List<CreateLoadBalancerRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<CreateLoadBalancerRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class CreateLoadBalancerRequestDeletionProtectionConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable deletion protection. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false** (default): no</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The reason why the deletion protection feature is enabled or disabled. The value must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter.</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static CreateLoadBalancerRequestDeletionProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestDeletionProtectionConfig self = new CreateLoadBalancerRequestDeletionProtectionConfig();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestDeletionProtectionConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateLoadBalancerRequestDeletionProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class CreateLoadBalancerRequestLoadBalancerBillingConfig extends TeaModel {
        /**
         * <p>The billing method of the NLB instance.</p>
         * <br>
         * <p>Set the value to **PostPay**, which specifies the pay-as-you-go billing method.</p>
         */
        @NameInMap("PayType")
        public String payType;

        public static CreateLoadBalancerRequestLoadBalancerBillingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestLoadBalancerBillingConfig self = new CreateLoadBalancerRequestLoadBalancerBillingConfig();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestLoadBalancerBillingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class CreateLoadBalancerRequestModificationProtectionConfig extends TeaModel {
        /**
         * <p>The reason why the configuration read-only mode is enabled. The value must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter.</p>
         * <br>
         * <p>>  This parameter takes effect only if the **Status** parameter is set to **ConsoleProtection**.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
         * <br>
         * <p>*   **NonProtection**: does not enable the configuration read-only mode. You cannot set the **Reason** parameter. If the **Reason** parameter is set, the value is cleared.</p>
         * <p>*   **ConsoleProtection**: enables the configuration read-only mode. You can set the **Reason** parameter.</p>
         * <br>
         * <p>>  If you set this parameter to **ConsoleProtection**, you cannot use the NLB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateLoadBalancerRequestModificationProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestModificationProtectionConfig self = new CreateLoadBalancerRequestModificationProtectionConfig();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestModificationProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CreateLoadBalancerRequestModificationProtectionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateLoadBalancerRequestZoneMappings extends TeaModel {
        /**
         * <p>The ID of the elastic IP address (EIP) that is associated with the Internet-facing NLB instance. You can specify one EIP for each zone. You must add at least two zones. You can add a maximum of 10 zones.</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The private IP address. You must add at least two zones. You can add a maximum of 10 zones.</p>
         */
        @NameInMap("PrivateIPv4Address")
        public String privateIPv4Address;

        /**
         * <p>The vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an NLB instance. You must add at least two zones. You can add a maximum of 10 zones.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone of the NLB instance. You must add at least two zones. You can add a maximum of 10 zones.</p>
         * <br>
         * <p>You can call the [DescribeZones](~~443890~~) operation to query the most recent zone list.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateLoadBalancerRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestZoneMappings self = new CreateLoadBalancerRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestZoneMappings setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public CreateLoadBalancerRequestZoneMappings setPrivateIPv4Address(String privateIPv4Address) {
            this.privateIPv4Address = privateIPv4Address;
            return this;
        }
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        public CreateLoadBalancerRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateLoadBalancerRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
