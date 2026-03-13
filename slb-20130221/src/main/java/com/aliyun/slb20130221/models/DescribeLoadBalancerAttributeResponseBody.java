// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20130221.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerAttributeResponseBody extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("AutoReleaseTime")
    public Long autoReleaseTime;

    @NameInMap("BackendServers")
    public DescribeLoadBalancerAttributeResponseBodyBackendServers backendServers;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimeStamp")
    public Long createTimeStamp;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("IsPublicAddress")
    public String isPublicAddress;

    @NameInMap("ListenerPorts")
    public DescribeLoadBalancerAttributeResponseBodyListenerPorts listenerPorts;

    @NameInMap("ListenerPortsAndProtocal")
    public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocal listenerPortsAndProtocal;

    @NameInMap("ListenerPortsAndProtocol")
    public DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocol listenerPortsAndProtocol;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    @NameInMap("LoadBalancerSpec")
    public String loadBalancerSpec;

    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    @NameInMap("MasterZoneId")
    public String masterZoneId;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegionIdAlias")
    public String regionIdAlias;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlaveZoneId")
    public String slaveZoneId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

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

    public DescribeLoadBalancerAttributeResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeLoadBalancerAttributeResponseBody setIsPublicAddress(String isPublicAddress) {
        this.isPublicAddress = isPublicAddress;
        return this;
    }
    public String getIsPublicAddress() {
        return this.isPublicAddress;
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

    public DescribeLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerAttributeResponseBody setSlaveZoneId(String slaveZoneId) {
        this.slaveZoneId = slaveZoneId;
        return this;
    }
    public String getSlaveZoneId() {
        return this.slaveZoneId;
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
        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer self = new DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
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
        public java.util.List<String> listenerPort;

        public static DescribeLoadBalancerAttributeResponseBodyListenerPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerAttributeResponseBodyListenerPorts self = new DescribeLoadBalancerAttributeResponseBodyListenerPorts();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerAttributeResponseBodyListenerPorts setListenerPort(java.util.List<String> listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public java.util.List<String> getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class DescribeLoadBalancerAttributeResponseBodyListenerPortsAndProtocalListenerPortAndProtocal extends TeaModel {
        @NameInMap("ListenerPort")
        public Integer listenerPort;

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
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

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

}
