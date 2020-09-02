// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6AddressesResponse extends TeaModel {
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

    @NameInMap("Ipv6Addresses")
    @Validation(required = true)
    public DescribeIpv6AddressesResponseIpv6Addresses ipv6Addresses;

    public static DescribeIpv6AddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6AddressesResponse self = new DescribeIpv6AddressesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6AddressesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpv6AddressesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeIpv6AddressesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpv6AddressesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpv6AddressesResponse setIpv6Addresses(DescribeIpv6AddressesResponseIpv6Addresses ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }
    public DescribeIpv6AddressesResponseIpv6Addresses getIpv6Addresses() {
        return this.ipv6Addresses;
    }

    public static class DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth extends TeaModel {
        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Integer bandwidth;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("Ipv6InternetBandwidthId")
        @Validation(required = true)
        public String ipv6InternetBandwidthId;

        public static DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth self = new DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth setIpv6InternetBandwidthId(String ipv6InternetBandwidthId) {
            this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
            return this;
        }
        public String getIpv6InternetBandwidthId() {
            return this.ipv6InternetBandwidthId;
        }

    }

    public static class DescribeIpv6AddressesResponseIpv6AddressesIpv6Address extends TeaModel {
        @NameInMap("Ipv6AddressId")
        @Validation(required = true)
        public String ipv6AddressId;

        @NameInMap("Ipv6AddressName")
        @Validation(required = true)
        public String ipv6AddressName;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Ipv6GatewayId")
        @Validation(required = true)
        public String ipv6GatewayId;

        @NameInMap("Ipv6Address")
        @Validation(required = true)
        public String ipv6Address;

        @NameInMap("AssociatedInstanceId")
        @Validation(required = true)
        public String associatedInstanceId;

        @NameInMap("AssociatedInstanceType")
        @Validation(required = true)
        public String associatedInstanceType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("RealBandwidth")
        @Validation(required = true)
        public Integer realBandwidth;

        @NameInMap("AllocationTime")
        @Validation(required = true)
        public String allocationTime;

        @NameInMap("Ipv6InternetBandwidth")
        @Validation(required = true)
        public DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth ipv6InternetBandwidth;

        public static DescribeIpv6AddressesResponseIpv6AddressesIpv6Address build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseIpv6AddressesIpv6Address self = new DescribeIpv6AddressesResponseIpv6AddressesIpv6Address();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setIpv6AddressId(String ipv6AddressId) {
            this.ipv6AddressId = ipv6AddressId;
            return this;
        }
        public String getIpv6AddressId() {
            return this.ipv6AddressId;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setIpv6AddressName(String ipv6AddressName) {
            this.ipv6AddressName = ipv6AddressName;
            return this;
        }
        public String getIpv6AddressName() {
            return this.ipv6AddressName;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setIpv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }
        public String getIpv6GatewayId() {
            return this.ipv6GatewayId;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setAssociatedInstanceId(String associatedInstanceId) {
            this.associatedInstanceId = associatedInstanceId;
            return this;
        }
        public String getAssociatedInstanceId() {
            return this.associatedInstanceId;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setAssociatedInstanceType(String associatedInstanceType) {
            this.associatedInstanceType = associatedInstanceType;
            return this;
        }
        public String getAssociatedInstanceType() {
            return this.associatedInstanceType;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setRealBandwidth(Integer realBandwidth) {
            this.realBandwidth = realBandwidth;
            return this;
        }
        public Integer getRealBandwidth() {
            return this.realBandwidth;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setAllocationTime(String allocationTime) {
            this.allocationTime = allocationTime;
            return this;
        }
        public String getAllocationTime() {
            return this.allocationTime;
        }

        public DescribeIpv6AddressesResponseIpv6AddressesIpv6Address setIpv6InternetBandwidth(DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth ipv6InternetBandwidth) {
            this.ipv6InternetBandwidth = ipv6InternetBandwidth;
            return this;
        }
        public DescribeIpv6AddressesResponseIpv6AddressesIpv6AddressIpv6InternetBandwidth getIpv6InternetBandwidth() {
            return this.ipv6InternetBandwidth;
        }

    }

    public static class DescribeIpv6AddressesResponseIpv6Addresses extends TeaModel {
        @NameInMap("Ipv6Address")
        @Validation(required = true)
        public java.util.List<DescribeIpv6AddressesResponseIpv6AddressesIpv6Address> ipv6Address;

        public static DescribeIpv6AddressesResponseIpv6Addresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseIpv6Addresses self = new DescribeIpv6AddressesResponseIpv6Addresses();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6AddressesResponseIpv6Addresses setIpv6Address(java.util.List<DescribeIpv6AddressesResponseIpv6AddressesIpv6Address> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public java.util.List<DescribeIpv6AddressesResponseIpv6AddressesIpv6Address> getIpv6Address() {
            return this.ipv6Address;
        }

    }

}
