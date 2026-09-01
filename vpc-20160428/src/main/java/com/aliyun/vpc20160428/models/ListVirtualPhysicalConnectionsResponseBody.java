// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVirtualPhysicalConnectionsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned in the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>Indicates whether a next query token exists. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If <strong>NextToken</strong> has a return value, the value is the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dd20****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A55F69E-EE3D-5CBE-8805-734F7D5B46B9</p>
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

    /**
     * <p>The list of shared Express Connect circuits.</p>
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
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
         * <p>The access point ID of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-hangzhou-finance-yh-E</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The physical location of the access device for the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>Yuhang Economic Development Zone, XX Intersection, Yuhang XX Data Center, Room E***</p>
         */
        @NameInMap("AdLocation")
        public String adLocation;

        /**
         * <p>The Alibaba Cloud account ID of the shared Express Connect circuits owner.</p>
         * 
         * <strong>example:</strong>
         * <p>15346073170691****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The bandwidth of the Express Connect circuit. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The business status of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Enabled.</li>
         * <li><strong>FinancialLocked</strong>: Locked due to overdue payment.</li>
         * <li><strong>SecurityLocked</strong>: Locked for security reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the Express Connect circuit.</p>
         * <p>Valid values: <strong>Prepaid</strong>, which indicates subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The circuit code provided by the carrier for the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>longtel001</p>
         */
        @NameInMap("CircuitCode")
        public String circuitCode;

        /**
         * <p>The time when the Express Connect circuit was created. The time is displayed in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the Express Connect circuit was enabled. The time is displayed in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-08T10:44:00Z</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The expiration time of the shared Express Connect circuits.</p>
         * <p>The time is displayed in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-08T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The expected bandwidth value of the shared Express Connect circuits. The expected bandwidth value takes effect only after payment is completed.</p>
         * <p>Unit: <strong>M</strong> indicates Mbit/s, and <strong>G</strong> indicates Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50M</p>
         */
        @NameInMap("ExpectSpec")
        public String expectSpec;

        /**
         * <p>The carrier that provides the physical line for access. Valid values:</p>
         * <ul>
         * <li><strong>CT</strong>: China Telecom.</li>
         * <li><strong>CU</strong>: China Unicom.</li>
         * <li><strong>CM</strong>: China Mobile.</li>
         * <li><strong>CO</strong>: Other carriers in the Chinese mainland.</li>
         * <li><strong>Equinix</strong>: Equinix.</li>
         * <li><strong>Other</strong>: Other carriers outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CU</p>
         */
        @NameInMap("LineOperator")
        public String lineOperator;

        /**
         * <p>The status of the Letter of Authorization (LOA). Valid values:</p>
         * <ul>
         * <li><strong>Applying</strong>: The LOA application is being processed.</li>
         * <li><strong>Accept</strong>: The LOA application is approved.</li>
         * <li><strong>Available</strong>: The LOA is available.</li>
         * <li><strong>Rejected</strong>: The LOA application is rejected.</li>
         * <li><strong>Completing</strong>: The Express Connect circuit is under construction.</li>
         * <li><strong>Complete</strong>: The Express Connect circuit construction is complete.</li>
         * <li><strong>Deleted</strong>: The LOA is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("LoaStatus")
        public String loaStatus;

        /**
         * <p>The name of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The payer of the shared Express Connect circuits. Valid values:</p>
         * <ul>
         * <li><strong>PayByPhysicalConnectionOwner</strong>: The owner of the Express Connect circuit associated with the shared Express Connect circuits is the payer.</li>
         * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: The owner of the shared Express Connect circuits is the payer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByPhysicalConnectionOwner</p>
         */
        @NameInMap("OrderMode")
        public String orderMode;

        /**
         * <p>The Alibaba Cloud account ID that owns the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>18311773240248****</p>
         */
        @NameInMap("ParentPhysicalConnectionAliUid")
        public String parentPhysicalConnectionAliUid;

        /**
         * <p>The instance ID of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1ciz7ekd2grn1as****</p>
         */
        @NameInMap("ParentPhysicalConnectionId")
        public String parentPhysicalConnectionId;

        /**
         * <p>The geographic location of the on-premises data center.</p>
         * 
         * <strong>example:</strong>
         * <p>No. XX, XX Street, XX District, Hangzhou, Zhejiang Province</p>
         */
        @NameInMap("PeerLocation")
        public String peerLocation;

        /**
         * <p>The instance ID of the shared Express Connect circuits.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1mrgfbtmc9brre7****</p>
         */
        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        /**
         * <p>The port number of the access device for the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PortNumber")
        public String portNumber;

        /**
         * <p>The port type of the access device for the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>100Base-T</strong>: 100M Ethernet port.</li>
         * <li><strong>1000Base-T</strong>: GE electrical port.</li>
         * <li><strong>1000Base-LX</strong>: GE single-mode optical port (10 km).</li>
         * <li><strong>10GBase-T</strong>: 10 GE electrical port.</li>
         * <li><strong>10GBase-LR</strong>: 10 GE single-mode optical port (10 km).</li>
         * <li><strong>40GBase-LR</strong>: 40 GE single-mode optical port.</li>
         * <li><strong>100GBase-LR</strong>: 100 GE single-mode optical port.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10GBase-LR</p>
         */
        @NameInMap("PortType")
        public String portType;

        /**
         * <p>The type of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>VirtualPhysicalConnection</strong>: Shared Express Connect circuits.</li>
         * <li><strong>PhysicalConnection</strong>: Dedicated Express Connect circuit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VirtualPhysicalConnection</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the redundant Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-119mfjzm****</p>
         */
        @NameInMap("RedundantPhysicalConnectionId")
        public String redundantPhysicalConnectionId;

        /**
         * <p>The ID of the resource group to which the shared Express Connect circuits belong.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3wmsyui****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The bandwidth value of the shared Express Connect circuits.</p>
         * <p>Unit: <strong>M</strong> indicates Mbit/s, and <strong>G</strong> indicates Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50M</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>Initial</strong>: The application is under review.</li>
         * <li><strong>Approved</strong>: The application is approved.</li>
         * <li><strong>Allocating</strong>: Resources are being allocated.</li>
         * <li><strong>Allocated</strong>: Under construction.</li>
         * <li><strong>Confirmed</strong>: Waiting for user confirmation.</li>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Rejected</strong>: The application is rejected.</li>
         * <li><strong>Canceled</strong>: Canceled.</li>
         * <li><strong>Allocation Failed</strong>: Resource allocation failed.</li>
         * <li><strong>Terminated</strong>: Terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags> tags;

        /**
         * <p>The type of the Express Connect circuit. Default value: <strong>VPC</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The business status of the shared Express Connect circuits. Valid values:</p>
         * <ul>
         * <li><strong>Confirmed</strong>: The shared Express Connect circuits have been accepted.</li>
         * <li><strong>UnConfirmed</strong>: The shared Express Connect circuits have not been accepted.</li>
         * <li><strong>Deleted</strong>: The shared Express Connect circuits have been deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Confirmed</p>
         */
        @NameInMap("VirtualPhysicalConnectionStatus")
        public String virtualPhysicalConnectionStatus;

        /**
         * <p>The VLAN ID of the shared Express Connect circuits.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
