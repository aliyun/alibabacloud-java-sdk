// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerAttributeResponseBody extends TeaModel {
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("RenewalCycUnit")
    public String renewalCycUnit;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    @NameInMap("Address")
    public String address;

    @NameInMap("SlaveZoneId")
    public String slaveZoneId;

    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    @NameInMap("MasterZoneId")
    public String masterZoneId;

    @NameInMap("LoadBalancerSpec")
    public String loadBalancerSpec;

    @NameInMap("AutoReleaseTime")
    public Long autoReleaseTime;

    @NameInMap("ModificationProtectionReason")
    public String modificationProtectionReason;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ModificationProtectionStatus")
    public String modificationProtectionStatus;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("DeleteProtection")
    public String deleteProtection;

    @NameInMap("RegionIdAlias")
    public String regionIdAlias;

    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("RenewalDuration")
    public Integer renewalDuration;

    @NameInMap("ListenerPorts")
    public DescribeLoadBalancerAttributeResponseBodyListenerPorts listenerPorts;

    @NameInMap("ListenerPortsAndProtocal")
    public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal listenerPortsAndProtocal;

    @NameInMap("ListenerPortsAndProtocol")
    public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol listenerPortsAndProtocol;

    @NameInMap("BackendServers")
    public DescribeLoadBalancerAttributeResponseBodyBackendServers backendServers;

    public static DescribeLoadBalancerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerAttributeResponseBody self = new DescribeLoadBalancerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeLoadBalancerAttributeResponseBody setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public DescribeLoadBalancerAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeLoadBalancerAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeLoadBalancerAttributeResponseBody setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public DescribeLoadBalancerAttributeResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeLoadBalancerAttributeResponseBody setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public DescribeLoadBalancerAttributeResponseBody setRenewalCycUnit(String renewalCycUnit) {
        this.renewalCycUnit = renewalCycUnit;
        return this;
    }
    public String getRenewalCycUnit() {
        return this.renewalCycUnit;
    }

    public DescribeLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public DescribeLoadBalancerAttributeResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeLoadBalancerAttributeResponseBody setSlaveZoneId(String slaveZoneId) {
        this.slaveZoneId = slaveZoneId;
        return this;
    }
    public String getSlaveZoneId() {
        return this.slaveZoneId;
    }

    public DescribeLoadBalancerAttributeResponseBody setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public DescribeLoadBalancerAttributeResponseBody setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    public DescribeLoadBalancerAttributeResponseBody setAutoReleaseTime(Long autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public Long getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    public DescribeLoadBalancerAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLoadBalancerAttributeResponseBody setModificationProtectionStatus(String modificationProtectionStatus) {
        this.modificationProtectionStatus = modificationProtectionStatus;
        return this;
    }
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
    }

    public DescribeLoadBalancerAttributeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLoadBalancerAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeLoadBalancerAttributeResponseBody setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public DescribeLoadBalancerAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeLoadBalancerAttributeResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeLoadBalancerAttributeResponseBody setDeleteProtection(String deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }
    public String getDeleteProtection() {
        return this.deleteProtection;
    }

    public DescribeLoadBalancerAttributeResponseBody setRegionIdAlias(String regionIdAlias) {
        this.regionIdAlias = regionIdAlias;
        return this;
    }
    public String getRegionIdAlias() {
        return this.regionIdAlias;
    }

    public DescribeLoadBalancerAttributeResponseBody setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public DescribeLoadBalancerAttributeResponseBody setRenewalDuration(Integer renewalDuration) {
        this.renewalDuration = renewalDuration;
        return this;
    }
    public Integer getRenewalDuration() {
        return this.renewalDuration;
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

    public DescribeLoadBalancerAttributeResponseBody setBackendServers(DescribeLoadBalancerAttributeResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public DescribeLoadBalancerAttributeResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
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
        @NameInMap("ListenerProtocal")
        public String listenerProtocal;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal self = new DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal setListenerProtocal(String listenerProtocal) {
            this.listenerProtocal = listenerProtocal;
            return this;
        }
        public String getListenerProtocal() {
            return this.listenerProtocal;
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
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
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        @NameInMap("ListenerForward")
        public String listenerForward;

        @NameInMap("Description")
        public String description;

        @NameInMap("ForwardPort")
        public Integer forwardPort;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol self = new DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol();
            return TeaModel.build(map, self);
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

        public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocolListenerPortAndProtocol setListenerForward(String listenerForward) {
            this.listenerForward = listenerForward;
            return this;
        }
        public String getListenerForward() {
            return this.listenerForward;
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

    public static class DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Description")
        public String description;

        @NameInMap("ServerId")
        public String serverId;

        public static DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer self = new DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
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

}
