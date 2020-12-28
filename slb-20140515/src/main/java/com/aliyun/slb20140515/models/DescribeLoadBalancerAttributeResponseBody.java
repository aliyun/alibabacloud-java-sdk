// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerAttributeResponseBody extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ListenerPortsAndProtocal")
    public java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal> listenerPortsAndProtocal;

    @NameInMap("BackendServers")
    public java.util.List<DescribeLoadBalancerAttributeResponseBodyBackendServers> backendServers;

    @NameInMap("LoadBalancerSpec")
    public String loadBalancerSpec;

    @NameInMap("ModificationProtectionReason")
    public String modificationProtectionReason;

    @NameInMap("ListenerPorts")
    public java.util.List<Integer> listenerPorts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("DeleteProtection")
    public String deleteProtection;

    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    @NameInMap("AutoReleaseTime")
    public Long autoReleaseTime;

    @NameInMap("RenewalDuration")
    public Integer renewalDuration;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("ListenerPortsAndProtocol")
    public java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol> listenerPortsAndProtocol;

    @NameInMap("ModificationProtectionStatus")
    public String modificationProtectionStatus;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("MasterZoneId")
    public String masterZoneId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("RenewalCycUnit")
    public String renewalCycUnit;

    @NameInMap("SlaveZoneId")
    public String slaveZoneId;

    @NameInMap("RegionIdAlias")
    public String regionIdAlias;

    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

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

    public DescribeLoadBalancerAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeLoadBalancerAttributeResponseBody setListenerPortsAndProtocal(java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal> listenerPortsAndProtocal) {
        this.listenerPortsAndProtocal = listenerPortsAndProtocal;
        return this;
    }
    public java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal> getListenerPortsAndProtocal() {
        return this.listenerPortsAndProtocal;
    }

    public DescribeLoadBalancerAttributeResponseBody setBackendServers(java.util.List<DescribeLoadBalancerAttributeResponseBodyBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<DescribeLoadBalancerAttributeResponseBodyBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    public DescribeLoadBalancerAttributeResponseBody setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    public DescribeLoadBalancerAttributeResponseBody setListenerPorts(java.util.List<Integer> listenerPorts) {
        this.listenerPorts = listenerPorts;
        return this;
    }
    public java.util.List<Integer> getListenerPorts() {
        return this.listenerPorts;
    }

    public DescribeLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeLoadBalancerAttributeResponseBody setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public DescribeLoadBalancerAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeLoadBalancerAttributeResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeLoadBalancerAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeLoadBalancerAttributeResponseBody setDeleteProtection(String deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }
    public String getDeleteProtection() {
        return this.deleteProtection;
    }

    public DescribeLoadBalancerAttributeResponseBody setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public DescribeLoadBalancerAttributeResponseBody setAutoReleaseTime(Long autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public Long getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setRenewalDuration(Integer renewalDuration) {
        this.renewalDuration = renewalDuration;
        return this;
    }
    public Integer getRenewalDuration() {
        return this.renewalDuration;
    }

    public DescribeLoadBalancerAttributeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeLoadBalancerAttributeResponseBody setListenerPortsAndProtocol(java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol> listenerPortsAndProtocol) {
        this.listenerPortsAndProtocol = listenerPortsAndProtocol;
        return this;
    }
    public java.util.List<DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol> getListenerPortsAndProtocol() {
        return this.listenerPortsAndProtocol;
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

    public DescribeLoadBalancerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerAttributeResponseBody setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public DescribeLoadBalancerAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setRenewalCycUnit(String renewalCycUnit) {
        this.renewalCycUnit = renewalCycUnit;
        return this;
    }
    public String getRenewalCycUnit() {
        return this.renewalCycUnit;
    }

    public DescribeLoadBalancerAttributeResponseBody setSlaveZoneId(String slaveZoneId) {
        this.slaveZoneId = slaveZoneId;
        return this;
    }
    public String getSlaveZoneId() {
        return this.slaveZoneId;
    }

    public DescribeLoadBalancerAttributeResponseBody setRegionIdAlias(String regionIdAlias) {
        this.regionIdAlias = regionIdAlias;
        return this;
    }
    public String getRegionIdAlias() {
        return this.regionIdAlias;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public DescribeLoadBalancerAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLoadBalancerAttributeResponseBody setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public DescribeLoadBalancerAttributeResponseBody setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public static class DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal extends TeaModel {
        @NameInMap("ListenerProtocal")
        public String listenerProtocal;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal self = new DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal setListenerProtocal(String listenerProtocal) {
            this.listenerProtocal = listenerProtocal;
            return this;
        }
        public String getListenerProtocal() {
            return this.listenerProtocal;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyBackendServers extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Description")
        public String description;

        @NameInMap("ServerId")
        public String serverId;

        public static DescribeLoadBalancerAttributeResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyBackendServers self = new DescribeLoadBalancerAttributeResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol extends TeaModel {
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        @NameInMap("ListenerForward")
        public String listenerForward;

        @NameInMap("Description")
        public String description;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("ForwardPort")
        public Integer forwardPort;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol self = new DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol setListenerForward(String listenerForward) {
            this.listenerForward = listenerForward;
            return this;
        }
        public String getListenerForward() {
            return this.listenerForward;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol setForwardPort(Integer forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }
        public Integer getForwardPort() {
            return this.forwardPort;
        }

    }

}
