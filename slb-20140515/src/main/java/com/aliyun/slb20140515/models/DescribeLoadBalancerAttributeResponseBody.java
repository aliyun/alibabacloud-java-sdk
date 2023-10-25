// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerAttributeResponseBody extends TeaModel {
    /**
     * <p>The service IP address of the CLB instance.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The version of the IP address. Valid values: **ipv4** and **ipv6**.</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The address type of the CLB instance.</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The timestamp generated when the CLB instance is released.</p>
     */
    @NameInMap("AutoReleaseTime")
    public Long autoReleaseTime;

    /**
     * <p>The backend servers of the CLB instance.</p>
     */
    @NameInMap("BackendServers")
    public DescribeLoadBalancerAttributeResponseBodyBackendServers backendServers;

    /**
     * <p>The maximum bandwidth of the Internet-facing CLB instance that is billed on a pay-by-bandwidth basis.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The time when the CLB instance was created. The time is in the `YYYY-MM-DDThh:mm:ssZ` format.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The timestamp generated when the CA certificate is uploaded.</p>
     */
    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

    /**
     * <p>Indicates whether deletion protection is enabled for the CLB instance.</p>
     * <br>
     * <p>Valid values: **on** and **off**.</p>
     */
    @NameInMap("DeleteProtection")
    public String deleteProtection;

    /**
     * <p>The time when the CLB instance expires.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The timestamp that indicates the expiration time of the CLB instance.</p>
     */
    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    /**
     * <p>The metering method of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   **PayBySpec** (default)</p>
     * <p>*   **PayByCLCU**</p>
     * <br>
     * <p>> This parameter is available only on the China site and takes effect only when **PayType** is set to **PayOnDemand**.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the Internet-facing CLB instance. Valid values:</p>
     * <br>
     * <p>*   **paybytraffic**</p>
     * <p>*   **paybybandwidth**</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The frontend port used by the CLB instance.</p>
     */
    @NameInMap("ListenerPorts")
    public DescribeLoadBalancerAttributeResponseBodyListenerPorts listenerPorts;

    /**
     * <p>The ports or protocols of the listeners.</p>
     */
    @NameInMap("ListenerPortsAndProtocal")
    public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal listenerPortsAndProtocal;

    /**
     * <p>The ports or protocols of the listeners.</p>
     */
    @NameInMap("ListenerPortsAndProtocol")
    public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol listenerPortsAndProtocol;

    /**
     * <p>The CLB instance ID.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the CLB instance.</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The specification of the CLB instance.</p>
     */
    @NameInMap("LoadBalancerSpec")
    public String loadBalancerSpec;

    /**
     * <p>The status of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   **inactive**: The CLB instance is disabled. CLB instances in the inactive state do not forward traffic.</p>
     * <p>*   **active**: The CLB instance is running as expected. Newly created CLB instances are in the **active** state by default.</p>
     * <p>*   **locked**: The CLB instance is locked. CLB instances may be locked due to overdue payments or other reasons.</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The ID of the primary zone to which the CLB instance belongs.</p>
     */
    @NameInMap("MasterZoneId")
    public String masterZoneId;

    /**
     * <p>The reason why the configuration read-only mode is enabled. The value is 1 to 80 characters in length. It starts with a letter and can contain digits, periods (.), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>>  This parameter is valid only when **ModificationProtectionStatus** is set to **ConsoleProtection**.</p>
     */
    @NameInMap("ModificationProtectionReason")
    public String modificationProtectionReason;

    /**
     * <p>Indicates whether the configuration read-only mode is enabled. Valid values:</p>
     * <br>
     * <p>*   **NonProtection**: The configuration read-only mode is disabled. After you disable the configuration read-only mode, the value of **ModificationProtectionReason** is cleared.</p>
     * <p>*   **ConsoleProtection**: The configuration read-only mode is enabled.</p>
     * <br>
     * <p>>  If this parameter is set to **ConsoleProtection**, you cannot modify instance configurations in the CLB console. However, you can modify instance configurations by calling API operations.</p>
     */
    @NameInMap("ModificationProtectionStatus")
    public String modificationProtectionStatus;

    /**
     * <p>The network type of the CLB instance.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The billing method of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   Only **PayOnDemand** may be returned, which indicates the pay-as-you-go billing method.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID of the CLB instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The alias of the region to which the CLB instance belongs.</p>
     */
    @NameInMap("RegionIdAlias")
    public String regionIdAlias;

    /**
     * <p>The auto-renewal cycle. Valid values: **Year** and **Month**. Default value: Month.</p>
     * <br>
     * <p>>  This parameter is valid only if you create a subscription CLB instance on the Alibaba Cloud China site. In this case, **PayType** must be set to **PrePay** and **RenewalStatus** must be set to **AutoRenewal**.</p>
     */
    @NameInMap("RenewalCycUnit")
    public String renewalCycUnit;

    /**
     * <p>The auto-renewal duration. This parameter is valid only if **RenewalStatus** is set to **AutoRenewal**.</p>
     * <br>
     * <p>*   Valid values when **PeriodUnit** is set to **Year**: **1**, **2**, and **3**.</p>
     * <br>
     * <p>*   Valid values when **PeriodUnit** is set to **Month**: **1**, **2**, **3**, and **6**.</p>
     * <br>
     * <p>> This parameter is valid only when you create a subscription CLB instance on the Alibaba Cloud China site. In this case, the **PayType** parameter must be set to **PrePay**.</p>
     */
    @NameInMap("RenewalDuration")
    public Integer renewalDuration;

    /**
     * <p>Indicates whether auto-renewal is enabled. Valid values:</p>
     * <br>
     * <p>*   **AutoRenewal**: Auto-renewal is enabled.</p>
     * <br>
     * <p>*   **Normal**: Auto-renewal is disabled. You must manually renew the CLB instance.</p>
     * <br>
     * <p>*   **NotRenewal**: The CLB instance will not be renewed upon expiration. If this value is returned, the system does not send notifications until three days before the expiration date.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** This parameter is valid only when you create a subscription CLB instance on the Alibaba Cloud China site. In this case, **PayType** must be set to **PrePay**.</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the secondary zone to which the CLB instance belongs.</p>
     */
    @NameInMap("SlaveZoneId")
    public String slaveZoneId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public DescribeLoadBalancerAttributeResponseBodyTags tags;

    /**
     * <p>The ID of the vSwitch to which the internal-facing CLB instance belongs.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) where the internal-facing CLB instance is deployed.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeLoadBalancerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerAttributeResponseBody self = new DescribeLoadBalancerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerAttributeResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeLoadBalancerAttributeResponseBody setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public DescribeLoadBalancerAttributeResponseBody setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public DescribeLoadBalancerAttributeResponseBody setAutoReleaseTime(Long autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public Long getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setBackendServers(DescribeLoadBalancerAttributeResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public DescribeLoadBalancerAttributeResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public DescribeLoadBalancerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public DescribeLoadBalancerAttributeResponseBody setDeleteProtection(String deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }
    public String getDeleteProtection() {
        return this.deleteProtection;
    }

    public DescribeLoadBalancerAttributeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public DescribeLoadBalancerAttributeResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeLoadBalancerAttributeResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeLoadBalancerAttributeResponseBody setListenerPorts(DescribeLoadBalancerAttributeResponseBodyListenerPorts listenerPorts) {
        this.listenerPorts = listenerPorts;
        return this;
    }
    public DescribeLoadBalancerAttributeResponseBodyListenerPorts getListenerPorts() {
        return this.listenerPorts;
    }

    public DescribeLoadBalancerAttributeResponseBody setListenerPortsAndProtocal(DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal listenerPortsAndProtocal) {
        this.listenerPortsAndProtocal = listenerPortsAndProtocal;
        return this;
    }
    public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal getListenerPortsAndProtocal() {
        return this.listenerPortsAndProtocal;
    }

    public DescribeLoadBalancerAttributeResponseBody setListenerPortsAndProtocol(DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol listenerPortsAndProtocol) {
        this.listenerPortsAndProtocol = listenerPortsAndProtocol;
        return this;
    }
    public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol getListenerPortsAndProtocol() {
        return this.listenerPortsAndProtocol;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public DescribeLoadBalancerAttributeResponseBody setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public DescribeLoadBalancerAttributeResponseBody setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    public DescribeLoadBalancerAttributeResponseBody setModificationProtectionStatus(String modificationProtectionStatus) {
        this.modificationProtectionStatus = modificationProtectionStatus;
        return this;
    }
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
    }

    public DescribeLoadBalancerAttributeResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeLoadBalancerAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeLoadBalancerAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLoadBalancerAttributeResponseBody setRegionIdAlias(String regionIdAlias) {
        this.regionIdAlias = regionIdAlias;
        return this;
    }
    public String getRegionIdAlias() {
        return this.regionIdAlias;
    }

    public DescribeLoadBalancerAttributeResponseBody setRenewalCycUnit(String renewalCycUnit) {
        this.renewalCycUnit = renewalCycUnit;
        return this;
    }
    public String getRenewalCycUnit() {
        return this.renewalCycUnit;
    }

    public DescribeLoadBalancerAttributeResponseBody setRenewalDuration(Integer renewalDuration) {
        this.renewalDuration = renewalDuration;
        return this;
    }
    public Integer getRenewalDuration() {
        return this.renewalDuration;
    }

    public DescribeLoadBalancerAttributeResponseBody setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public DescribeLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeLoadBalancerAttributeResponseBody setSlaveZoneId(String slaveZoneId) {
        this.slaveZoneId = slaveZoneId;
        return this;
    }
    public String getSlaveZoneId() {
        return this.slaveZoneId;
    }

    public DescribeLoadBalancerAttributeResponseBody setTags(DescribeLoadBalancerAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeLoadBalancerAttributeResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeLoadBalancerAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeLoadBalancerAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer extends TeaModel {
        /**
         * <p>The description of the backend server.</p>
         * <br>
         * <p>> This parameter is not returned if Description is not set.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The backend server ID.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The ID of the elastic network interface (ENI) or elastic container instance.</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the backend server.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer self = new DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer> backendServer;

        public static DescribeLoadBalancerAttributeResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyBackendServers self = new DescribeLoadBalancerAttributeResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServers setBackendServer(java.util.List<DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyListenerPorts extends TeaModel {
        @NameInMap("ListenerPort")
        public java.util.List<Integer> listenerPort;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPorts self = new DescribeLoadBalancerAttributeResponseBodyListenerPorts();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPorts setListenerPort(java.util.List<Integer> listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public java.util.List<Integer> getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal extends TeaModel {
        /**
         * <p>The frontend port that is used by the CLB instance.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The frontend protocol that is used by the CLB instance.</p>
         */
        @NameInMap("ListenerProtocal")
        public String listenerProtocal;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal self = new DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal setListenerProtocal(String listenerProtocal) {
            this.listenerProtocal = listenerProtocal;
            return this;
        }
        public String getListenerProtocal() {
            return this.listenerProtocal;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal extends TeaModel {
        @NameInMap("ListenerPortAndProtocal")
        public java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal> listenerPortAndProtocal;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal self = new DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal setListenerPortAndProtocal(java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal> listenerPortAndProtocal) {
            this.listenerPortAndProtocal = listenerPortAndProtocal;
            return this;
        }
        public java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal> getListenerPortAndProtocal() {
            return this.listenerPortAndProtocal;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol extends TeaModel {
        /**
         * <p>Indicates whether the listener is enabled.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination listening port to which requests are forwarded. The port must be open and use HTTPS.</p>
         */
        @NameInMap("ForwardPort")
        public Integer forwardPort;

        /**
         * <p>Indicates whether the listener is enabled.</p>
         */
        @NameInMap("ListenerForward")
        public String listenerForward;

        /**
         * <p>The frontend port that is used by the CLB instance.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The frontend protocol that is used by the CLB instance.</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol self = new DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol setForwardPort(Integer forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }
        public Integer getForwardPort() {
            return this.forwardPort;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol setListenerForward(String listenerForward) {
            this.listenerForward = listenerForward;
            return this;
        }
        public String getListenerForward() {
            return this.listenerForward;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol extends TeaModel {
        @NameInMap("ListenerPortAndProtocol")
        public java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol> listenerPortAndProtocol;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol self = new DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol setListenerPortAndProtocol(java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol> listenerPortAndProtocol) {
            this.listenerPortAndProtocol = listenerPortAndProtocol;
            return this;
        }
        public java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol> getListenerPortAndProtocol() {
            return this.listenerPortAndProtocol;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: **1** to **20**. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be at most 64 characters in length, and cannot contain `http://` or `https://`. It must not start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value. Valid values of N: **1** to **20**. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. The tag value cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeLoadBalancerAttributeResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyTagsTag self = new DescribeLoadBalancerAttributeResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeLoadBalancerAttributeResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeLoadBalancerAttributeResponseBodyTagsTag> tag;

        public static DescribeLoadBalancerAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyTags self = new DescribeLoadBalancerAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyTags setTag(java.util.List<DescribeLoadBalancerAttributeResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeLoadBalancerAttributeResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
