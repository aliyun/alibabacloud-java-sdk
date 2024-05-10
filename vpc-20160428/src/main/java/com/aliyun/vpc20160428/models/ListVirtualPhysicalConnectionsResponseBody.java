// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVirtualPhysicalConnectionsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned in this query.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If the value of **NextToken** is not returned, it indicates that no next query is to be sent.</p>
     * <p>*   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of hosted connections returned.</p>
     */
    @NameInMap("VirtualPhysicalConnections")
    public java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections> virtualPhysicalConnections;

    public static ListVirtualPhysicalConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualPhysicalConnectionsResponseBody self = new ListVirtualPhysicalConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualPhysicalConnectionsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListVirtualPhysicalConnectionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVirtualPhysicalConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirtualPhysicalConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVirtualPhysicalConnectionsResponseBody setVirtualPhysicalConnections(java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections> virtualPhysicalConnections) {
        this.virtualPhysicalConnections = virtualPhysicalConnections;
        return this;
    }
    public java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections> getVirtualPhysicalConnections() {
        return this.virtualPhysicalConnections;
    }

    public static class ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags extends TeaModel {
        /**
         * <p>The key of tag N that is added to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>It can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>It can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags self = new ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags();
            return TeaModel.build(map, self);
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections extends TeaModel {
        /**
         * <p>The ID of the access point that is associated with the Express Connect circuit.</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The geographical location of the access device.</p>
         */
        @NameInMap("AdLocation")
        public String adLocation;

        /**
         * <p>The Alibaba Cloud account ID of the hosted connection owner.</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The bandwidth of the Express Connect circuit. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The status of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>*   **Normal**</p>
         * <p>*   **FinancialLocked**</p>
         * <p>*   **SecurityLocked**</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the Express Connect circuit.</p>
         * <br>
         * <p>If **Prepaid** is returned, it indicates that the Express Connect circuit is billed on a subscription basis.</p>
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
         * <p>The time when the Express Connect circuit is enabled.</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The expiration date of the hosted connection.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The estimated maximum bandwidth of the shared Express Connect circuit. The estimated bandwidth takes effect after you complete the payment.</p>
         * <br>
         * <p>**M** indicates Mbit/s and **G** indicates Gbit/s.</p>
         */
        @NameInMap("ExpectSpec")
        public String expectSpec;

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
         * <p>*   **Applying**</p>
         * <p>*   **Accept**</p>
         * <p>*   **Available**</p>
         * <p>*   **Rejected**</p>
         * <p>*   **Completing**</p>
         * <p>*   **Complete**</p>
         * <p>*   **Deleted**</p>
         */
        @NameInMap("LoaStatus")
        public String loaStatus;

        /**
         * <p>The name of the Express Connect circuit.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The payer for the shared Express Connect circuit. Valid values:</p>
         * <br>
         * <p>*   **PayByPhysicalConnectionOwner**: the owner of the shared Express Connect circuit</p>
         * <p>*   **PayByVirtualPhysicalConnectionOwner**: the owner of the hosted connection</p>
         */
        @NameInMap("OrderMode")
        public String orderMode;

        /**
         * <p>The ID of the Alibaba Cloud account to which the Express Connect circuit belongs.</p>
         */
        @NameInMap("ParentPhysicalConnectionAliUid")
        public String parentPhysicalConnectionAliUid;

        /**
         * <p>The ID of the Express Connect circuit.</p>
         */
        @NameInMap("ParentPhysicalConnectionId")
        public String parentPhysicalConnectionId;

        /**
         * <p>The geographical location of the data center.</p>
         */
        @NameInMap("PeerLocation")
        public String peerLocation;

        /**
         * <p>The ID of the hosted connection.</p>
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
         */
        @NameInMap("PortType")
        public String portType;

        /**
         * <p>The type of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>*   **VirtualPhysicalConnection**: shared Express Connect circuit</p>
         * <p>*   **PhysicalConnection**: dedicated Express Connect circuit</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the redundant Express Connect circuit.</p>
         */
        @NameInMap("RedundantPhysicalConnectionId")
        public String redundantPhysicalConnectionId;

        /**
         * <p>The ID of the resource group to which the hosted connection belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The bandwidth value of the hosted connection.</p>
         * <br>
         * <p>**M** indicates Mbit/s and **G** indicates Gbit/s.</p>
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
         * <p>*   **Confirmed**: The Express Connect circuit is pending for user confirmation.</p>
         * <p>*   **Enabled**: The Express Connect circuit is enabled.</p>
         * <p>*   **Rejected**: The application is rejected.</p>
         * <p>*   **Canceled**: The application is canceled.</p>
         * <p>*   **Allocation Failed**: The system failed to allocate resources.</p>
         * <p>*   **Terminated**: The Express Connect circuit is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags> tags;

        /**
         * <p>The type of Express Connect circuit. Default value: **VPC**.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The status of the hosted connection. Valid values:</p>
         * <br>
         * <p>*   **Confirmed**</p>
         * <p>*   **UnConfirmed**</p>
         * <p>*   **Deleted**</p>
         */
        @NameInMap("VirtualPhysicalConnectionStatus")
        public String virtualPhysicalConnectionStatus;

        /**
         * <p>The VLAN ID of the hosted connection.</p>
         */
        @NameInMap("VlanId")
        public String vlanId;

        public static ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections self = new ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections();
            return TeaModel.build(map, self);
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setAdLocation(String adLocation) {
            this.adLocation = adLocation;
            return this;
        }
        public String getAdLocation() {
            return this.adLocation;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setExpectSpec(String expectSpec) {
            this.expectSpec = expectSpec;
            return this;
        }
        public String getExpectSpec() {
            return this.expectSpec;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setLoaStatus(String loaStatus) {
            this.loaStatus = loaStatus;
            return this;
        }
        public String getLoaStatus() {
            return this.loaStatus;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setOrderMode(String orderMode) {
            this.orderMode = orderMode;
            return this;
        }
        public String getOrderMode() {
            return this.orderMode;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setParentPhysicalConnectionAliUid(String parentPhysicalConnectionAliUid) {
            this.parentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
            return this;
        }
        public String getParentPhysicalConnectionAliUid() {
            return this.parentPhysicalConnectionAliUid;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setParentPhysicalConnectionId(String parentPhysicalConnectionId) {
            this.parentPhysicalConnectionId = parentPhysicalConnectionId;
            return this;
        }
        public String getParentPhysicalConnectionId() {
            return this.parentPhysicalConnectionId;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setPeerLocation(String peerLocation) {
            this.peerLocation = peerLocation;
            return this;
        }
        public String getPeerLocation() {
            return this.peerLocation;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setPortNumber(String portNumber) {
            this.portNumber = portNumber;
            return this;
        }
        public String getPortNumber() {
            return this.portNumber;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
            this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
            return this;
        }
        public String getRedundantPhysicalConnectionId() {
            return this.redundantPhysicalConnectionId;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setTags(java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags> getTags() {
            return this.tags;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setVirtualPhysicalConnectionStatus(String virtualPhysicalConnectionStatus) {
            this.virtualPhysicalConnectionStatus = virtualPhysicalConnectionStatus;
            return this;
        }
        public String getVirtualPhysicalConnectionStatus() {
            return this.virtualPhysicalConnectionStatus;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

    }

}
