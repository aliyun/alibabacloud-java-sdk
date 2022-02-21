// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingDevicesResponseBody extends TeaModel {
    @NameInMap("Devices")
    public java.util.List<DescribeRenderingDevicesResponseBodyDevices> devices;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeRenderingDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingDevicesResponseBody self = new DescribeRenderingDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingDevicesResponseBody setDevices(java.util.List<DescribeRenderingDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<DescribeRenderingDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public DescribeRenderingDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRenderingDevicesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeRenderingDevicesResponseBodyDevicesIpInfos extends TeaModel {
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

        public static DescribeRenderingDevicesResponseBodyDevicesIpInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingDevicesResponseBodyDevicesIpInfos self = new DescribeRenderingDevicesResponseBodyDevicesIpInfos();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingDevicesResponseBodyDevicesIpInfos setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public DescribeRenderingDevicesResponseBodyDevicesIpInfos setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeRenderingDevicesResponseBodyDevicesIpInfos setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeRenderingDevicesResponseBodyDevicesIpInfos setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public DescribeRenderingDevicesResponseBodyDevicesIpInfos setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public DescribeRenderingDevicesResponseBodyDevicesIpInfos setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeRenderingDevicesResponseBodyDevicesIpInfos setNatType(String natType) {
            this.natType = natType;
            return this;
        }
        public String getNatType() {
            return this.natType;
        }

    }

    public static class DescribeRenderingDevicesResponseBodyDevicesPodInfosNetwork extends TeaModel {
        @NameInMap("ContainerPorts")
        public String containerPorts;

        @NameInMap("ExternalIp")
        public String externalIp;

        @NameInMap("ExternalPorts")
        public String externalPorts;

        public static DescribeRenderingDevicesResponseBodyDevicesPodInfosNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingDevicesResponseBodyDevicesPodInfosNetwork self = new DescribeRenderingDevicesResponseBodyDevicesPodInfosNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingDevicesResponseBodyDevicesPodInfosNetwork setContainerPorts(String containerPorts) {
            this.containerPorts = containerPorts;
            return this;
        }
        public String getContainerPorts() {
            return this.containerPorts;
        }

        public DescribeRenderingDevicesResponseBodyDevicesPodInfosNetwork setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public DescribeRenderingDevicesResponseBodyDevicesPodInfosNetwork setExternalPorts(String externalPorts) {
            this.externalPorts = externalPorts;
            return this;
        }
        public String getExternalPorts() {
            return this.externalPorts;
        }

    }

    public static class DescribeRenderingDevicesResponseBodyDevicesPodInfos extends TeaModel {
        @NameInMap("Network")
        public java.util.List<DescribeRenderingDevicesResponseBodyDevicesPodInfosNetwork> network;

        @NameInMap("PodId")
        public String podId;

        @NameInMap("Status")
        public String status;

        public static DescribeRenderingDevicesResponseBodyDevicesPodInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingDevicesResponseBodyDevicesPodInfos self = new DescribeRenderingDevicesResponseBodyDevicesPodInfos();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingDevicesResponseBodyDevicesPodInfos setNetwork(java.util.List<DescribeRenderingDevicesResponseBodyDevicesPodInfosNetwork> network) {
            this.network = network;
            return this;
        }
        public java.util.List<DescribeRenderingDevicesResponseBodyDevicesPodInfosNetwork> getNetwork() {
            return this.network;
        }

        public DescribeRenderingDevicesResponseBodyDevicesPodInfos setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
        }

        public DescribeRenderingDevicesResponseBodyDevicesPodInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeRenderingDevicesResponseBodyDevices extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("AutoRenewPeriod")
        public Integer autoRenewPeriod;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Description")
        public String description;

        @NameInMap("EdgeNodeName")
        public String edgeNodeName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IpInfos")
        public java.util.List<DescribeRenderingDevicesResponseBodyDevicesIpInfos> ipInfos;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("PlatformType")
        public String platformType;

        @NameInMap("PodInfos")
        public java.util.List<DescribeRenderingDevicesResponseBodyDevicesPodInfos> podInfos;

        @NameInMap("ServerName")
        public String serverName;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Status")
        public String status;

        public static DescribeRenderingDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingDevicesResponseBodyDevices self = new DescribeRenderingDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingDevicesResponseBodyDevices setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeRenderingDevicesResponseBodyDevices setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeRenderingDevicesResponseBodyDevices setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeRenderingDevicesResponseBodyDevices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRenderingDevicesResponseBodyDevices setEdgeNodeName(String edgeNodeName) {
            this.edgeNodeName = edgeNodeName;
            return this;
        }
        public String getEdgeNodeName() {
            return this.edgeNodeName;
        }

        public DescribeRenderingDevicesResponseBodyDevices setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeRenderingDevicesResponseBodyDevices setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeRenderingDevicesResponseBodyDevices setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRenderingDevicesResponseBodyDevices setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRenderingDevicesResponseBodyDevices setIpInfos(java.util.List<DescribeRenderingDevicesResponseBodyDevicesIpInfos> ipInfos) {
            this.ipInfos = ipInfos;
            return this;
        }
        public java.util.List<DescribeRenderingDevicesResponseBodyDevicesIpInfos> getIpInfos() {
            return this.ipInfos;
        }

        public DescribeRenderingDevicesResponseBodyDevices setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeRenderingDevicesResponseBodyDevices setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeRenderingDevicesResponseBodyDevices setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeRenderingDevicesResponseBodyDevices setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public DescribeRenderingDevicesResponseBodyDevices setPodInfos(java.util.List<DescribeRenderingDevicesResponseBodyDevicesPodInfos> podInfos) {
            this.podInfos = podInfos;
            return this;
        }
        public java.util.List<DescribeRenderingDevicesResponseBodyDevicesPodInfos> getPodInfos() {
            return this.podInfos;
        }

        public DescribeRenderingDevicesResponseBodyDevices setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

        public DescribeRenderingDevicesResponseBodyDevices setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeRenderingDevicesResponseBodyDevices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
