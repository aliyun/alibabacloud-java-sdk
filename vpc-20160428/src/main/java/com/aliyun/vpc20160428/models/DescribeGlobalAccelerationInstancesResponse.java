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

    }

    public static class DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        @Validation(required = true)
        public java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer> backendServer;

        public static DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers self = new DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress> publicIpAddress;

        public static DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses self = new DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances extends TeaModel {
        @NameInMap("GlobalAccelerationInstance")
        @Validation(required = true)
        public java.util.List<DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance;

        public static DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances self = new DescribeGlobalAccelerationInstancesResponseGlobalAccelerationInstances();
            return TeaModel.build(map, self);
        }

    }

}
