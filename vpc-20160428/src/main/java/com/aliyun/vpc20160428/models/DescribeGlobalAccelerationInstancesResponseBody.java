// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGlobalAccelerationInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the GA instances.</p>
     */
    @NameInMap("GlobalAccelerationInstances")
    public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances globalAccelerationInstances;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6B4EE38D-C75B-4E1F-844E-863A94430676</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGlobalAccelerationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalAccelerationInstancesResponseBody self = new DescribeGlobalAccelerationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalAccelerationInstancesResponseBody setGlobalAccelerationInstances(DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances globalAccelerationInstances) {
        this.globalAccelerationInstances = globalAccelerationInstances;
        return this;
    }
    public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances getGlobalAccelerationInstances() {
        return this.globalAccelerationInstances;
    }

    public DescribeGlobalAccelerationInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGlobalAccelerationInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGlobalAccelerationInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalAccelerationInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer extends TeaModel {
        /**
         * <p>The region where the backend servers are deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zeg83zvn5d4ed4y****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.xx.xx.109</p>
         */
        @NameInMap("ServerIpAddress")
        public String serverIpAddress;

        /**
         * <p>The type of the backend server.</p>
         * <ul>
         * <li><strong>EcsInstance</strong>: Elastic Compute Service (ECS) instance</li>
         * <li><strong>SlbInstance</strong>: Server Load Balancer (SLB) instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EcsInstance</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setServerIpAddress(String serverIpAddress) {
            this.serverIpAddress = serverIpAddress;
            return this;
        }
        public String getServerIpAddress() {
            return this.serverIpAddress;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer> backendServer;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers setBackendServer(java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress extends TeaModel {
        /**
         * <p>The ID of the public IP address of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp19yqraac4w3y0jd****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The public IP address of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>12.xx.xx.78</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddress")
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress> publicIpAddress;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses setPublicIpAddress(java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress> getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance extends TeaModel {
        /**
         * <p>The acceleration area of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>china-mainland</p>
         */
        @NameInMap("AccelerationLocation")
        public String accelerationLocation;

        /**
         * <p>The details about the backend servers of the GA instance.</p>
         */
        @NameInMap("BackendServers")
        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers backendServers;

        /**
         * <p>The maximum bandwidth of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The bandwidth type of the GA instance.</p>
         * <ul>
         * <li><strong>Sharing</strong></li>
         * <li><strong>Exclusive</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exclusive</p>
         */
        @NameInMap("BandwidthType")
        public String bandwidthType;

        /**
         * <p>The billing method of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the GA instance was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-05T03:39:31Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>apiDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-05T16:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1x99kj7kl1ziw5x****</p>
         */
        @NameInMap("GlobalAccelerationInstanceId")
        public String globalAccelerationInstanceId;

        /**
         * <p>The billing method of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The public IP address of the dedicated GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>47.xx.xx.99</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The name of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The public IP address.</p>
         */
        @NameInMap("PublicIpAddresses")
        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses publicIpAddresses;

        /**
         * <p>The region ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The service area of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>china-mainland</p>
         */
        @NameInMap("ServiceLocation")
        public String serviceLocation;

        /**
         * <p>The status of the GA instance.</p>
         * <ul>
         * <li><strong>Available</strong></li>
         * <li><strong>Inuse</strong></li>
         * <li><strong>Associating</strong></li>
         * <li><strong>Unassociating</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InUse</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setAccelerationLocation(String accelerationLocation) {
            this.accelerationLocation = accelerationLocation;
            return this;
        }
        public String getAccelerationLocation() {
            return this.accelerationLocation;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setBackendServers(DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }
        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers getBackendServers() {
            return this.backendServers;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
            return this;
        }
        public String getGlobalAccelerationInstanceId() {
            return this.globalAccelerationInstanceId;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setPublicIpAddresses(DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setServiceLocation(String serviceLocation) {
            this.serviceLocation = serviceLocation;
            return this;
        }
        public String getServiceLocation() {
            return this.serviceLocation;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances extends TeaModel {
        @NameInMap("GlobalAccelerationInstance")
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances setGlobalAccelerationInstance(java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance) {
            this.globalAccelerationInstance = globalAccelerationInstance;
            return this;
        }
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance> getGlobalAccelerationInstance() {
            return this.globalAccelerationInstance;
        }

    }

}
