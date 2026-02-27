// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6AddressesResponseBody extends TeaModel {
    @NameInMap("Ipv6Addresses")
    public DescribeIpv6AddressesResponseBodyIpv6Addresses ipv6Addresses;

    /**
     * <p>The page number of the returned page. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
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
     * <p>AA4486A8-B6AE-469E-AB09-820EF8ECFA2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeIpv6AddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6AddressesResponseBody self = new DescribeIpv6AddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6AddressesResponseBody setIpv6Addresses(DescribeIpv6AddressesResponseBodyIpv6Addresses ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }
    public DescribeIpv6AddressesResponseBodyIpv6Addresses getIpv6Addresses() {
        return this.ipv6Addresses;
    }

    public DescribeIpv6AddressesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpv6AddressesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpv6AddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpv6AddressesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("HasReservationData")
        public Boolean hasReservationData;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("Ipv6InternetBandwidthId")
        public String ipv6InternetBandwidthId;

        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        @NameInMap("ReservationBandwidth")
        public Long reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        public static DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth self = new DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth setHasReservationData(Boolean hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public Boolean getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth setIpv6InternetBandwidthId(String ipv6InternetBandwidthId) {
            this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
            return this;
        }
        public String getIpv6InternetBandwidthId() {
            return this.ipv6InternetBandwidthId;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth setReservationBandwidth(Long reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public Long getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

    }

    public static class DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTagsTag self = new DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTagsTag> tag;

        public static DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTags self = new DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTags();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTags setTag(java.util.List<DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address extends TeaModel {
        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("AllocationTime")
        public String allocationTime;

        @NameInMap("AssociatedInstanceId")
        public String associatedInstanceId;

        @NameInMap("AssociatedInstanceType")
        public String associatedInstanceType;

        @NameInMap("Ipv6Address")
        public String ipv6Address;

        @NameInMap("Ipv6AddressDescription")
        public String ipv6AddressDescription;

        @NameInMap("Ipv6AddressId")
        public String ipv6AddressId;

        @NameInMap("Ipv6AddressName")
        public String ipv6AddressName;

        @NameInMap("Ipv6GatewayId")
        public String ipv6GatewayId;

        @NameInMap("Ipv6InternetBandwidth")
        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth ipv6InternetBandwidth;

        @NameInMap("Ipv6Isp")
        public String ipv6Isp;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RealBandwidth")
        public Integer realBandwidth;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServiceManaged")
        public Integer serviceManaged;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTags tags;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address self = new DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setAllocationTime(String allocationTime) {
            this.allocationTime = allocationTime;
            return this;
        }
        public String getAllocationTime() {
            return this.allocationTime;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setAssociatedInstanceId(String associatedInstanceId) {
            this.associatedInstanceId = associatedInstanceId;
            return this;
        }
        public String getAssociatedInstanceId() {
            return this.associatedInstanceId;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setAssociatedInstanceType(String associatedInstanceType) {
            this.associatedInstanceType = associatedInstanceType;
            return this;
        }
        public String getAssociatedInstanceType() {
            return this.associatedInstanceType;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setIpv6AddressDescription(String ipv6AddressDescription) {
            this.ipv6AddressDescription = ipv6AddressDescription;
            return this;
        }
        public String getIpv6AddressDescription() {
            return this.ipv6AddressDescription;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setIpv6AddressId(String ipv6AddressId) {
            this.ipv6AddressId = ipv6AddressId;
            return this;
        }
        public String getIpv6AddressId() {
            return this.ipv6AddressId;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setIpv6AddressName(String ipv6AddressName) {
            this.ipv6AddressName = ipv6AddressName;
            return this;
        }
        public String getIpv6AddressName() {
            return this.ipv6AddressName;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setIpv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }
        public String getIpv6GatewayId() {
            return this.ipv6GatewayId;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setIpv6InternetBandwidth(DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth ipv6InternetBandwidth) {
            this.ipv6InternetBandwidth = ipv6InternetBandwidth;
            return this;
        }
        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth getIpv6InternetBandwidth() {
            return this.ipv6InternetBandwidth;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setIpv6Isp(String ipv6Isp) {
            this.ipv6Isp = ipv6Isp;
            return this;
        }
        public String getIpv6Isp() {
            return this.ipv6Isp;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setRealBandwidth(Integer realBandwidth) {
            this.realBandwidth = realBandwidth;
            return this;
        }
        public Integer getRealBandwidth() {
            return this.realBandwidth;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setServiceManaged(Integer serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Integer getServiceManaged() {
            return this.serviceManaged;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setTags(DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressTags getTags() {
            return this.tags;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeIpv6AddressesResponseBodyIpv6Addresses extends TeaModel {
        @NameInMap("Ipv6Address")
        public java.util.List<DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address> ipv6Address;

        public static DescribeIpv6AddressesResponseBodyIpv6Addresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseBodyIpv6Addresses self = new DescribeIpv6AddressesResponseBodyIpv6Addresses();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6AddressesResponseBodyIpv6Addresses setIpv6Address(java.util.List<DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public java.util.List<DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address> getIpv6Address() {
            return this.ipv6Address;
        }

    }

}
