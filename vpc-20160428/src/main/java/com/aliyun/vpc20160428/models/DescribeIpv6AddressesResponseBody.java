// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6AddressesResponseBody extends TeaModel {
    /**
     * <p>The details about the IPv6 addresses.</p>
     */
    @NameInMap("Ipv6Addresses")
    public DescribeIpv6AddressesResponseBodyIpv6Addresses ipv6Addresses;

    /**
     * <p>The page number of the returned page. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of returned entries.</p>
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
        /**
         * <p>The exclusive Internet bandwidth of the IPv6 address. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The status of the Internet bandwidth of the IPv6 address. Valid values:</p>
         * <br>
         * <p>*   **Normal**</p>
         * <p>*   **FinancialLocked**</p>
         * <p>*   **SecurityLocked**</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>Indicates whether renewal data is included.</p>
         * <br>
         * <p>*   **false**</p>
         * <p>*   **true** This parameter returns **true** only if **IncludeReservationData** is set to **true** and some orders have not taken effect.</p>
         */
        @NameInMap("HasReservationData")
        public Boolean hasReservationData;

        /**
         * <p>The billing method of the Internet bandwidth of the IPv6 address.</p>
         * <br>
         * <p>Only **PostPaid** may be returned, which indicates the pay-as-you-go billing method.</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The billing method of the Internet bandwidth of the IPv6 address. Valid values:</p>
         * <br>
         * <p>*   **PayByTraffic**: pay-by-data-transfer</p>
         * <p>*   **PayByBandwidth**: pay-by-bandwidth</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The instance ID of the Internet bandwidth of the IPv6 address.</p>
         */
        @NameInMap("Ipv6InternetBandwidthId")
        public String ipv6InternetBandwidthId;

        /**
         * <p>The time when the renewal took effect. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The maximum bandwidth after the renewal takes effect. Unit: Mbit/s.</p>
         */
        @NameInMap("ReservationBandwidth")
        public Long reservationBandwidth;

        /**
         * <p>The metering method that is used after the renewal takes effect.</p>
         * <br>
         * <p>*   **PayByTraffic**: pay-by-data-transfer</p>
         * <p>*   **PayByBandwidth**: pay-by-bandwidth</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        /**
         * <p>The type of the renewal order. Only **RENEW** may be returned, which indicates that the order is placed for service renewal.</p>
         */
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

    public static class DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address extends TeaModel {
        /**
         * <p>The time when the IPv6 address was created.</p>
         */
        @NameInMap("AllocationTime")
        public String allocationTime;

        /**
         * <p>The ID of the instance that is assigned the IPv6 address.</p>
         */
        @NameInMap("AssociatedInstanceId")
        public String associatedInstanceId;

        /**
         * <p>The type of the instance that is assigned the IPv6 address.</p>
         */
        @NameInMap("AssociatedInstanceType")
        public String associatedInstanceType;

        /**
         * <p>The IPv6 address of the instance.</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        /**
         * <p>The ID of the IPv6 address.</p>
         */
        @NameInMap("Ipv6AddressId")
        public String ipv6AddressId;

        /**
         * <p>The name of the IPv6 address.</p>
         */
        @NameInMap("Ipv6AddressName")
        public String ipv6AddressName;

        /**
         * <p>The ID of the IPv6 gateway to which the IPv6 address belongs.</p>
         */
        @NameInMap("Ipv6GatewayId")
        public String ipv6GatewayId;

        /**
         * <p>The information about the Internet bandwidth of the IPv6 address.</p>
         */
        @NameInMap("Ipv6InternetBandwidth")
        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6AddressIpv6InternetBandwidth ipv6InternetBandwidth;

        /**
         * <p>The service provider of the IPv6 address. Valid values:</p>
         * <br>
         * <p>*   **BGP** (default)</p>
         * <p>*   **ChinaMobile**</p>
         * <p>*   **ChinaUnicom**</p>
         * <p>*   **ChinaTelecom**</p>
         */
        @NameInMap("Ipv6Isp")
        public String ipv6Isp;

        /**
         * <p>The type of communication supported by the IPv6 address. Valid values:</p>
         * <br>
         * <p>*   **Private**</p>
         * <p>*   **Public**</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The maximum bandwidth value of the IPv6 address.</p>
         * <br>
         * <p>*   If the IPv6 address is associated with an EIP bandwidth plan, the value of **RealBandwidth** is the maximum bandwidth value of the EIP bandwidth plan.</p>
         * <p>*   If the IPv6 address is not associated with an EIP bandwidth plan, the value of **RealBandwidth** is the maximum bandwidth value of the Internet bandwidth of the IPv6 address.</p>
         * <p>*   If the IPv6 address is not associated with an EIP bandwidth plan or an Internet bandwidth plan, the values of **RealBandwidth** and **Bandwidth** are both 0.</p>
         */
        @NameInMap("RealBandwidth")
        public Integer realBandwidth;

        /**
         * <p>The status of the IPv6 address. Valid values:</p>
         * <br>
         * <p>*   **Pending**</p>
         * <p>*   **Available**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vSwitch to which the IPv6 address belongs.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC to which the IPv6 address belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address self = new DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address();
            return TeaModel.build(map, self);
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

        public DescribeIpv6AddressesResponseBodyIpv6AddressesIpv6Address setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
