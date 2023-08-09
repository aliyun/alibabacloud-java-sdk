// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Default value: **10**. Valid values: **1** to **50**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of Express Connect circuits.</p>
     */
    @NameInMap("PhysicalConnectionSet")
    public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet physicalConnectionSet;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePhysicalConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsResponseBody self = new DescribePhysicalConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePhysicalConnectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePhysicalConnectionsResponseBody setPhysicalConnectionSet(DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet physicalConnectionSet) {
        this.physicalConnectionSet = physicalConnectionSet;
        return this;
    }
    public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet getPhysicalConnectionSet() {
        return this.physicalConnectionSet;
    }

    public DescribePhysicalConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePhysicalConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTagsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTagsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTagsTags self = new DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTagsTags();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTagsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTagsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTags extends TeaModel {
        @NameInMap("tags")
        public java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTagsTags> tags;

        public static DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTags self = new DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTags();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTags setTags(java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTagsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTagsTags> getTags() {
            return this.tags;
        }

    }

    public static class DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType extends TeaModel {
        /**
         * <p>The ID of the access point.</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The type of the access point.</p>
         */
        @NameInMap("AccessPointType")
        public String accessPointType;

        @NameInMap("AdDetailLocation")
        public String adDetailLocation;

        /**
         * <p>The geographical location of the access device.</p>
         */
        @NameInMap("AdLocation")
        public String adLocation;

        /**
         * <p>The maximum bandwidth of the Express Connect circuit.</p>
         * <br>
         * <p>Unit: Gbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The status of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>*   **Normal**: enabled</p>
         * <p>*   **FinancialLocked**: locked due to overdue payments</p>
         * <p>*   **SecurityLocked**: locked for security reasons</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the Express Connect circuit.</p>
         * <br>
         * <p>If the value is set to **Prepaid**, it indicates that the Express Connect circuit is billed on a subscription basis.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
         */
        @NameInMap("CircuitCode")
        public String circuitCode;

        /**
         * <p>The time when the Express Connect circuit was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the Express Connect circuit.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the Express Connect circuit was enabled.</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The time when the Express Connect circuit expires.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The estimated bandwidth value of the hosted connection. The estimated bandwidth takes effect after you complete the payment.</p>
         * <br>
         * <p>**M** indicates Mbit/s and **G** indicates Gbit/s.</p>
         */
        @NameInMap("ExpectSpec")
        public String expectSpec;

        /**
         * <p>Indicates whether the data about pending orders is returned. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("HasReservationData")
        public String hasReservationData;

        /**
         * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>*   **CT**: China Telecom.</p>
         * <p>*   **CU**: China Unicom.</p>
         * <p>*   **CM**: China Mobile.</p>
         * <p>*   **CO**: other connectivity providers in the Chinese mainland.</p>
         * <p>*   **Equinix**: Equinix.</p>
         * <p>*   **Other**: other connectivity providers outside the Chinese mainland.</p>
         */
        @NameInMap("LineOperator")
        public String lineOperator;

        /**
         * <p>The status of the letter of authorization (LOA). Valid values:</p>
         * <br>
         * <p>*   **Applying**: The LOA is pending approval.</p>
         * <p>*   **Accept**: The LOA is approved.</p>
         * <p>*   **Available**: The LOA is available.</p>
         * <p>*   **Rejected**: The LOA is rejected.</p>
         * <p>*   **Completing**: The Express Connect circuit is under construction.</p>
         * <p>*   **Complete**: The Express Connect circuit is installed.</p>
         * <p>*   **Deleted**: The LOA is deleted.</p>
         */
        @NameInMap("LoaStatus")
        public String loaStatus;

        /**
         * <p>The name of the Express Connect circuit.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The payer for the hosted connection. Valid values:</p>
         * <br>
         * <p>*   **PayByPhysicalConnectionOwner**: The partner pays for the hosted connection.</p>
         * <p>*   **PayByVirtualPhysicalConnectionOwner**: The tenant pays for the hosted connection.</p>
         */
        @NameInMap("OrderMode")
        public String orderMode;

        /**
         * <p>The Alibaba Cloud account ID of the Express Connect circuit that is used to create the hosted connection.</p>
         */
        @NameInMap("ParentPhysicalConnectionAliUid")
        public Long parentPhysicalConnectionAliUid;

        /**
         * <p>The ID of the Express Connect circuit that is used to create the hosted connection.</p>
         */
        @NameInMap("ParentPhysicalConnectionId")
        public String parentPhysicalConnectionId;

        /**
         * <p>The geographical location of the data center.</p>
         */
        @NameInMap("PeerLocation")
        public String peerLocation;

        /**
         * <p>The ID of the Express Connect circuit.</p>
         */
        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        /**
         * <p>The ID of the port on the access device.</p>
         */
        @NameInMap("PortNumber")
        public String portNumber;

        /**
         * <p>The port type. Valid values:</p>
         * <br>
         * <p>*   **100Base-T**: 100 Mbit/s copper Ethernet port</p>
         * <p>*   **1000Base-T**: 1,000 Mbit/s copper Ethernet port</p>
         * <p>*   **1000Base-LX**: 1,000 Mbit/s single-mode optical port (10 km)</p>
         * <p>*   **10GBase-T**: 10,000 Mbit/s copper Ethernet port</p>
         * <p>*   **10GBase-LR**: 10,000 Mbit/s single-mode optical port (10 km)</p>
         * <p>*   **40GBase-LR**: 40,000 Mbit/s single-mode optical port</p>
         * <p>*   **100GBase-LR**: 100,000 Mbit/s single-mode optical port</p>
         * <br>
         * <p>>  Whether 40GBase-LR and 100GBase-LR ports can be created is based on resource supplies. For more information, contact your business manager.</p>
         */
        @NameInMap("PortType")
        public String portType;

        /**
         * <p>The type of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>*   **VirtualPhysicalConnection**: a shared Express Connect circuit</p>
         * <p>*   **PhysicalConnection**: a dedicated Express Connect circuit</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the redundant Express Connect circuit.</p>
         */
        @NameInMap("RedundantPhysicalConnectionId")
        public String redundantPhysicalConnectionId;

        /**
         * <p>The time when the pending order takes effect.</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The billing method of the pending order.</p>
         * <br>
         * <p>The value is set to **PayByBandwidth**, which indicates the pay-by-bandwidth metering method.</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        /**
         * <p>The type of the pending order.</p>
         * <br>
         * <p>If the value is set to **RENEW**, it indicates that the order is placed for service renewal.</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The specification of the Express Connect circuit.</p>
         * <br>
         * <p>Unit: **G** (Gbit/s).</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>*   **Initial**: The application is under review.</p>
         * <p>*   **Approved**: The application is approved.</p>
         * <p>*   **Allocating**: The system is allocating resources.</p>
         * <p>*   **Allocated**: The Express Connect circuit is under construction.</p>
         * <p>*   **Confirmed**: The Express Connect circuit is pending user confirmation.</p>
         * <p>*   **Enabled**: The Express Connect circuit is enabled.</p>
         * <p>*   **Rejected**: The application is rejected.</p>
         * <p>*   **Canceled**: The application is canceled.</p>
         * <p>*   **Allocation Failed**: The system failed to allocate resources.</p>
         * <p>*   **Terminating**: The Express Connect circuit is being disabled.</p>
         * <p>*   **Terminated**: The Express Connect circuit is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTags tags;

        /**
         * <p>The type of the Express Connect circuit. The value is set to **VPC**.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The number of hosted connections that are established over the Express Connect circuit.</p>
         */
        @NameInMap("VirtualPhysicalConnectionCount")
        public Integer virtualPhysicalConnectionCount;

        /**
         * <p>The VLAN ID of the hosted connection.</p>
         */
        @NameInMap("VlanId")
        public String vlanId;

        /**
         * <p>The status of the hosted connection. Valid values:</p>
         * <br>
         * <p>*   **Confirmed**: accepted</p>
         * <p>*   **UnConfirmed**: pending acceptance</p>
         * <p>*   **Deleted**: deleted</p>
         */
        @NameInMap("VpconnStatus")
        public String vpconnStatus;

        public static DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType self = new DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setAccessPointType(String accessPointType) {
            this.accessPointType = accessPointType;
            return this;
        }
        public String getAccessPointType() {
            return this.accessPointType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setAdDetailLocation(String adDetailLocation) {
            this.adDetailLocation = adDetailLocation;
            return this;
        }
        public String getAdDetailLocation() {
            return this.adDetailLocation;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setAdLocation(String adLocation) {
            this.adLocation = adLocation;
            return this;
        }
        public String getAdLocation() {
            return this.adLocation;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setExpectSpec(String expectSpec) {
            this.expectSpec = expectSpec;
            return this;
        }
        public String getExpectSpec() {
            return this.expectSpec;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setLoaStatus(String loaStatus) {
            this.loaStatus = loaStatus;
            return this;
        }
        public String getLoaStatus() {
            return this.loaStatus;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setOrderMode(String orderMode) {
            this.orderMode = orderMode;
            return this;
        }
        public String getOrderMode() {
            return this.orderMode;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setParentPhysicalConnectionAliUid(Long parentPhysicalConnectionAliUid) {
            this.parentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
            return this;
        }
        public Long getParentPhysicalConnectionAliUid() {
            return this.parentPhysicalConnectionAliUid;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setParentPhysicalConnectionId(String parentPhysicalConnectionId) {
            this.parentPhysicalConnectionId = parentPhysicalConnectionId;
            return this;
        }
        public String getParentPhysicalConnectionId() {
            return this.parentPhysicalConnectionId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPeerLocation(String peerLocation) {
            this.peerLocation = peerLocation;
            return this;
        }
        public String getPeerLocation() {
            return this.peerLocation;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPortNumber(String portNumber) {
            this.portNumber = portNumber;
            return this;
        }
        public String getPortNumber() {
            return this.portNumber;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
            this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
            return this;
        }
        public String getRedundantPhysicalConnectionId() {
            return this.redundantPhysicalConnectionId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setTags(DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTags getTags() {
            return this.tags;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setVirtualPhysicalConnectionCount(Integer virtualPhysicalConnectionCount) {
            this.virtualPhysicalConnectionCount = virtualPhysicalConnectionCount;
            return this;
        }
        public Integer getVirtualPhysicalConnectionCount() {
            return this.virtualPhysicalConnectionCount;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setVpconnStatus(String vpconnStatus) {
            this.vpconnStatus = vpconnStatus;
            return this;
        }
        public String getVpconnStatus() {
            return this.vpconnStatus;
        }

    }

    public static class DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet extends TeaModel {
        @NameInMap("PhysicalConnectionType")
        public java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType> physicalConnectionType;

        public static DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet self = new DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setPhysicalConnectionType(java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType> physicalConnectionType) {
            this.physicalConnectionType = physicalConnectionType;
            return this;
        }
        public java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType> getPhysicalConnectionType() {
            return this.physicalConnectionType;
        }

    }

}
