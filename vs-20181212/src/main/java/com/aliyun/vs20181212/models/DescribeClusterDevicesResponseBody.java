// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeClusterDevicesResponseBody extends TeaModel {
    @NameInMap("Devices")
    public java.util.List<DescribeClusterDevicesResponseBodyDevices> devices;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeClusterDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDevicesResponseBody self = new DescribeClusterDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDevicesResponseBody setDevices(java.util.List<DescribeClusterDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<DescribeClusterDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public DescribeClusterDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterDevicesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeClusterDevicesResponseBodyDevicesIpInfos extends TeaModel {
        @NameInMap("ExternalIp")
        public String externalIp;

        @NameInMap("ExternalPort")
        public String externalPort;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("InternalIp")
        public String internalIp;

        @NameInMap("InternalPort")
        public String internalPort;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("NatType")
        public String natType;

        public static DescribeClusterDevicesResponseBodyDevicesIpInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDevicesResponseBodyDevicesIpInfos self = new DescribeClusterDevicesResponseBodyDevicesIpInfos();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDevicesResponseBodyDevicesIpInfos setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public DescribeClusterDevicesResponseBodyDevicesIpInfos setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeClusterDevicesResponseBodyDevicesIpInfos setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeClusterDevicesResponseBodyDevicesIpInfos setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public DescribeClusterDevicesResponseBodyDevicesIpInfos setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public DescribeClusterDevicesResponseBodyDevicesIpInfos setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeClusterDevicesResponseBodyDevicesIpInfos setNatType(String natType) {
            this.natType = natType;
            return this;
        }
        public String getNatType() {
            return this.natType;
        }

    }

    public static class DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork extends TeaModel {
        @NameInMap("ContainerPorts")
        public String containerPorts;

        @NameInMap("ExternalIp")
        public String externalIp;

        @NameInMap("ExternalIsp")
        public String externalIsp;

        @NameInMap("ExternalPorts")
        public String externalPorts;

        @NameInMap("OutgoingIp")
        public String outgoingIp;

        @NameInMap("OutgoingIsp")
        public String outgoingIsp;

        public static DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork self = new DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork setContainerPorts(String containerPorts) {
            this.containerPorts = containerPorts;
            return this;
        }
        public String getContainerPorts() {
            return this.containerPorts;
        }

        public DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork setExternalIsp(String externalIsp) {
            this.externalIsp = externalIsp;
            return this;
        }
        public String getExternalIsp() {
            return this.externalIsp;
        }

        public DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork setExternalPorts(String externalPorts) {
            this.externalPorts = externalPorts;
            return this;
        }
        public String getExternalPorts() {
            return this.externalPorts;
        }

        public DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork setOutgoingIp(String outgoingIp) {
            this.outgoingIp = outgoingIp;
            return this;
        }
        public String getOutgoingIp() {
            return this.outgoingIp;
        }

        public DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork setOutgoingIsp(String outgoingIsp) {
            this.outgoingIsp = outgoingIsp;
            return this;
        }
        public String getOutgoingIsp() {
            return this.outgoingIsp;
        }

    }

    public static class DescribeClusterDevicesResponseBodyDevicesPodInfos extends TeaModel {
        @NameInMap("Network")
        public java.util.List<DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork> network;

        @NameInMap("PodId")
        public String podId;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("Status")
        public String status;

        public static DescribeClusterDevicesResponseBodyDevicesPodInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDevicesResponseBodyDevicesPodInfos self = new DescribeClusterDevicesResponseBodyDevicesPodInfos();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDevicesResponseBodyDevicesPodInfos setNetwork(java.util.List<DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork> network) {
            this.network = network;
            return this;
        }
        public java.util.List<DescribeClusterDevicesResponseBodyDevicesPodInfosNetwork> getNetwork() {
            return this.network;
        }

        public DescribeClusterDevicesResponseBodyDevicesPodInfos setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
        }

        public DescribeClusterDevicesResponseBodyDevicesPodInfos setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public DescribeClusterDevicesResponseBodyDevicesPodInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeClusterDevicesResponseBodyDevices extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("AutoRenewPeriod")
        public Integer autoRenewPeriod;

        @NameInMap("Description")
        public String description;

        @NameInMap("EdgeNodeName")
        public String edgeNodeName;

        @NameInMap("HostRom")
        public String hostRom;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IpInfos")
        public java.util.List<DescribeClusterDevicesResponseBodyDevicesIpInfos> ipInfos;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("PlatformType")
        public String platformType;

        @NameInMap("PodInfos")
        public java.util.List<DescribeClusterDevicesResponseBodyDevicesPodInfos> podInfos;

        @NameInMap("Server")
        public String server;

        @NameInMap("Status")
        public String status;

        public static DescribeClusterDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDevicesResponseBodyDevices self = new DescribeClusterDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDevicesResponseBodyDevices setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeClusterDevicesResponseBodyDevices setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeClusterDevicesResponseBodyDevices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeClusterDevicesResponseBodyDevices setEdgeNodeName(String edgeNodeName) {
            this.edgeNodeName = edgeNodeName;
            return this;
        }
        public String getEdgeNodeName() {
            return this.edgeNodeName;
        }

        public DescribeClusterDevicesResponseBodyDevices setHostRom(String hostRom) {
            this.hostRom = hostRom;
            return this;
        }
        public String getHostRom() {
            return this.hostRom;
        }

        public DescribeClusterDevicesResponseBodyDevices setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterDevicesResponseBodyDevices setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeClusterDevicesResponseBodyDevices setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClusterDevicesResponseBodyDevices setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeClusterDevicesResponseBodyDevices setIpInfos(java.util.List<DescribeClusterDevicesResponseBodyDevicesIpInfos> ipInfos) {
            this.ipInfos = ipInfos;
            return this;
        }
        public java.util.List<DescribeClusterDevicesResponseBodyDevicesIpInfos> getIpInfos() {
            return this.ipInfos;
        }

        public DescribeClusterDevicesResponseBodyDevices setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeClusterDevicesResponseBodyDevices setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeClusterDevicesResponseBodyDevices setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeClusterDevicesResponseBodyDevices setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public DescribeClusterDevicesResponseBodyDevices setPodInfos(java.util.List<DescribeClusterDevicesResponseBodyDevicesPodInfos> podInfos) {
            this.podInfos = podInfos;
            return this;
        }
        public java.util.List<DescribeClusterDevicesResponseBodyDevicesPodInfos> getPodInfos() {
            return this.podInfos;
        }

        public DescribeClusterDevicesResponseBodyDevices setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeClusterDevicesResponseBodyDevices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
