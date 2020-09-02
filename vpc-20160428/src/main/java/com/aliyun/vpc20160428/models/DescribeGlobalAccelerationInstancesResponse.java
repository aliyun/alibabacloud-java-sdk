// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGlobalAccelerationInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("GlobalAccelerationInstances")
    @Validation(required = true)
    public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances globalAccelerationInstances;

    public static DescribeGlobalAccelerationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalAccelerationInstancesResponse self = new DescribeGlobalAccelerationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalAccelerationInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalAccelerationInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGlobalAccelerationInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGlobalAccelerationInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGlobalAccelerationInstancesResponse setGlobalAccelerationInstances(DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances globalAccelerationInstances) {
        this.globalAccelerationInstances = globalAccelerationInstances;
        return this;
    }
    public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances getGlobalAccelerationInstances() {
        return this.globalAccelerationInstances;
    }

    public static class DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ServerId")
        @Validation(required = true)
        public String serverId;

        @NameInMap("ServerIpAddress")
        @Validation(required = true)
        public String serverIpAddress;

        @NameInMap("ServerType")
        @Validation(required = true)
        public String serverType;

        public static DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer self = new DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setServerIpAddress(String serverIpAddress) {
            this.serverIpAddress = serverIpAddress;
            return this;
        }
        public String getServerIpAddress() {
            return this.serverIpAddress;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        @Validation(required = true)
        public java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer> backendServer;

        public static DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers self = new DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers setBackendServer(java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress extends TeaModel {
        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        public static DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress self = new DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress> publicIpAddress;

        public static DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses self = new DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses setPublicIpAddress(java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress> getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("GlobalAccelerationInstanceId")
        @Validation(required = true)
        public String globalAccelerationInstanceId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public String bandwidth;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("BandwidthType")
        @Validation(required = true)
        public String bandwidthType;

        @NameInMap("AccelerationLocation")
        @Validation(required = true)
        public String accelerationLocation;

        @NameInMap("ServiceLocation")
        @Validation(required = true)
        public String serviceLocation;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("HasReservationData")
        @Validation(required = true)
        public String hasReservationData;

        @NameInMap("ReservationBandwidth")
        @Validation(required = true)
        public String reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        @Validation(required = true)
        public String reservationInternetChargeType;

        @NameInMap("ReservationActiveTime")
        @Validation(required = true)
        public String reservationActiveTime;

        @NameInMap("ReservationOrderType")
        @Validation(required = true)
        public String reservationOrderType;

        @NameInMap("BackendServers")
        @Validation(required = true)
        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers backendServers;

        @NameInMap("PublicIpAddresses")
        @Validation(required = true)
        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses publicIpAddresses;

        public static DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance self = new DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
            return this;
        }
        public String getGlobalAccelerationInstanceId() {
            return this.globalAccelerationInstanceId;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setAccelerationLocation(String accelerationLocation) {
            this.accelerationLocation = accelerationLocation;
            return this;
        }
        public String getAccelerationLocation() {
            return this.accelerationLocation;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setServiceLocation(String serviceLocation) {
            this.serviceLocation = serviceLocation;
            return this;
        }
        public String getServiceLocation() {
            return this.serviceLocation;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setBackendServers(DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }
        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers getBackendServers() {
            return this.backendServers;
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setPublicIpAddresses(DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances extends TeaModel {
        @NameInMap("GlobalAccelerationInstance")
        @Validation(required = true)
        public java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance;

        public static DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances self = new DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances setGlobalAccelerationInstance(java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance) {
            this.globalAccelerationInstance = globalAccelerationInstance;
            return this;
        }
        public java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance> getGlobalAccelerationInstance() {
            return this.globalAccelerationInstance;
        }

    }

}
