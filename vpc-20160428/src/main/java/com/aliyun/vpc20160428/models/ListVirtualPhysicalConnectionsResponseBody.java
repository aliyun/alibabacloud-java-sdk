// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVirtualPhysicalConnectionsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is not returned, no more results are available.</p>
     * </li>
     * <li><p>If a value is returned for <strong>NextToken</strong>, use it in the next request to retrieve the subsequent page of results.</p>
     * </li>
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
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>A list of virtual physical connections.</p>
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
         * <p>The tag key, which cannot be an empty string. You can specify up to 20 tag keys.</p>
         * <p>The key can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). The key cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The value can be up to 128 characters in length. It can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The ID of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-hangzhou-finance-yh-E</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The physical location of the access device for the physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>余杭经济开发区XXX交叉口, 余杭XX机房, E***包间</p>
         */
        @NameInMap("AdLocation")
        public String adLocation;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the virtual physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>15346073170691****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The bandwidth of the physical connection. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The business status of the physical connection. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: The connection is running as expected.</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>: The connection is locked due to an overdue payment.</p>
         * </li>
         * <li><p><strong>SecurityLocked</strong>: The connection is locked for security reasons.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the physical connection.</p>
         * <p>The only valid value is <strong>Prepaid</strong>, which corresponds to the subscription billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The circuit code of the physical connection, which is provided by the carrier.</p>
         * 
         * <strong>example:</strong>
         * <p>longtel001</p>
         */
        @NameInMap("CircuitCode")
        public String circuitCode;

        /**
         * <p>The time the physical connection was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time the physical connection was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-08T10:44Z</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The expiration time of the virtual physical connection.</p>
         * <p>The time is in UTC and follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format (ISO 8601).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-08T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The expected bandwidth for the virtual physical connection. This bandwidth is applied after the payment is completed.</p>
         * <p><strong>M</strong> indicates Mbps, and <strong>G</strong> indicates Gbps.</p>
         * 
         * <strong>example:</strong>
         * <p>50M</p>
         */
        @NameInMap("ExpectSpec")
        public String expectSpec;

        /**
         * <p>The carrier that provides the physical connection. Valid values include:</p>
         * <ul>
         * <li><p><strong>CT</strong>: China Telecom.</p>
         * </li>
         * <li><p><strong>CU</strong>: China Unicom.</p>
         * </li>
         * <li><p><strong>CM</strong>: China Mobile.</p>
         * </li>
         * <li><p><strong>CO</strong>: other Chinese carriers.</p>
         * </li>
         * <li><p><strong>Equinix</strong>: Equinix.</p>
         * </li>
         * <li><p><strong>Other</strong>: other carriers outside China.</p>
         * </li>
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
         * <li><p><strong>Applying</strong>: The LOA request is being processed.</p>
         * </li>
         * <li><p><strong>Accept</strong>: The LOA application is approved.</p>
         * </li>
         * <li><p><strong>Available</strong>: The LOA is generated and ready for use.</p>
         * </li>
         * <li><p><strong>Rejected</strong>: The LOA request is rejected.</p>
         * </li>
         * <li><p><strong>Completing</strong>: The physical connection is being provisioned.</p>
         * </li>
         * <li><p><strong>Complete</strong>: Provisioning is complete.</p>
         * </li>
         * <li><p><strong>Deleted</strong>: The LOA is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("LoaStatus")
        public String loaStatus;

        /**
         * <p>The name of the physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The billing method of the virtual physical connection. Valid values:</p>
         * <ul>
         * <li><p><strong>PayByPhysicalConnectionOwner</strong>: The owner of the parent physical connection pays.</p>
         * </li>
         * <li><p><strong>PayByVirtualPhysicalConnectionOwner</strong>: The owner of the virtual physical connection pays.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByPhysicalConnectionOwner</p>
         */
        @NameInMap("OrderMode")
        public String orderMode;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the parent physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>18311773240248****</p>
         */
        @NameInMap("ParentPhysicalConnectionAliUid")
        public String parentPhysicalConnectionAliUid;

        /**
         * <p>The ID of the parent physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1ciz7ekd2grn1as****</p>
         */
        @NameInMap("ParentPhysicalConnectionId")
        public String parentPhysicalConnectionId;

        /**
         * <p>The location of the on-premises data center.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省杭州市XX区XX街道XX号</p>
         */
        @NameInMap("PeerLocation")
        public String peerLocation;

        /**
         * <p>The ID of the virtual physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1mrgfbtmc9brre7****</p>
         */
        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        /**
         * <p>The port number of the access device for the physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PortNumber")
        public String portNumber;

        /**
         * <p>The port type of the physical connection access point. Valid values:</p>
         * <ul>
         * <li><p><strong>100Base-T</strong>: 100 Mbps copper port.</p>
         * </li>
         * <li><p><strong>1000Base-T</strong>: 1 Gbps copper port.</p>
         * </li>
         * <li><p><strong>1000Base-LX</strong>: 1 Gbps single-mode optical port (10 km).</p>
         * </li>
         * <li><p><strong>10GBase-T</strong>: 10 Gbps copper port.</p>
         * </li>
         * <li><p><strong>10GBase-LR</strong>: 10 Gbps single-mode optical port (10 km).</p>
         * </li>
         * <li><p><strong>40GBase-LR</strong>: 40 Gbps single-mode optical port.</p>
         * </li>
         * <li><p><strong>100GBase-LR</strong>: 100 Gbps single-mode optical port.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10GBase-LR</p>
         */
        @NameInMap("PortType")
        public String portType;

        /**
         * <p>The type of the physical connection. Valid values:</p>
         * <ul>
         * <li><p><strong>VirtualPhysicalConnection</strong>: a virtual physical connection.</p>
         * </li>
         * <li><p><strong>PhysicalConnection</strong>: a dedicated physical connection.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VirtualPhysicalConnection</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the redundant physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-119mfjzm****</p>
         */
        @NameInMap("RedundantPhysicalConnectionId")
        public String redundantPhysicalConnectionId;

        /**
         * <p>The ID of the resource group to which the virtual physical connection belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3wmsyui****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The bandwidth of the virtual physical connection.</p>
         * <p>M indicates Mbps, and G indicates Gbps.</p>
         * 
         * <strong>example:</strong>
         * <p>50M</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the physical connection. Valid values:</p>
         * <ul>
         * <li><p><strong>Initial</strong>: The application is under review.</p>
         * </li>
         * <li><p><strong>Approved</strong>: The application is approved.</p>
         * </li>
         * <li><p><strong>Allocating</strong>: Resources are being allocated.</p>
         * </li>
         * <li><p><strong>Allocated</strong>: The connection is ready for provisioning.</p>
         * </li>
         * <li><p><strong>Confirmed</strong>: Awaiting user confirmation.</p>
         * </li>
         * <li><p><strong>Enabled</strong>: The connection is enabled.</p>
         * </li>
         * <li><p><strong>Rejected</strong>: The application is rejected.</p>
         * </li>
         * <li><p><strong>Canceled</strong>: The application is canceled.</p>
         * </li>
         * <li><p><strong>Allocation Failed</strong>: Resource allocation failed.</p>
         * </li>
         * <li><p><strong>Terminated</strong>: The connection is terminated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnectionsTags> tags;

        /**
         * <p>The type of the physical connection. The default value is <strong>VPC</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The business status of the virtual physical connection. Valid values:</p>
         * <ul>
         * <li><p><strong>Confirmed</strong>: The virtual physical connection has been accepted by the recipient.</p>
         * </li>
         * <li><p><strong>UnConfirmed</strong>: The virtual physical connection is awaiting acceptance.</p>
         * </li>
         * <li><p><strong>Deleted</strong>: The virtual physical connection is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Confirmed</p>
         */
        @NameInMap("VirtualPhysicalConnectionStatus")
        public String virtualPhysicalConnectionStatus;

        /**
         * <p>The VLAN ID of the virtual physical connection.</p>
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
