// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of Express Connect circuits.</p>
     */
    @NameInMap("PhysicalConnectionSet")
    public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet physicalConnectionSet;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0E6D0EC4-7C91-53E2-9F65-64BF713114B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
        /**
         * <p>The key of tag N added to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>It can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>It can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>ap-cn-hangzhou-finance-yh-E</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The type of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("AccessPointType")
        public String accessPointType;

        /**
         * <p>The information about the data center and rack.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省杭州市XX区XX镇XX路10号, XX机房, ET135ET135-XX-2包间, JXX机柜,  position30</p>
         */
        @NameInMap("AdDetailLocation")
        public String adDetailLocation;

        /**
         * <p>The location of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>Number 10, XX Road, XX Town, XX District, Hangzhou City, Zhejiang Province.</p>
         */
        @NameInMap("AdLocation")
        public String adLocation;

        /**
         * <p>The maximum bandwidth of the Express Connect circuit.</p>
         * <p>Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The status of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>FinancialLocked</strong></li>
         * <li><strong>SecurityLocked</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the Express Connect circuit.</p>
         * <p>If <strong>Prepaid</strong> is returned, it indicates that the Express Connect circuit is billed on a subscription basis.</p>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>longtel001</p>
         */
        @NameInMap("CircuitCode")
        public String circuitCode;

        /**
         * <p>The time when the Express Connect circuit was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-24T07:30:58Z</p>
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
         * <p>The time when the Express Connect circuit is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-24T07:33:18Z</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The time when the Express Connect circuit expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-24T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The estimated maximum bandwidth of the shared Express Connect circuit. The estimated bandwidth takes effect after you complete the payment.</p>
         * <p><strong>M</strong> indicates Mbit/s and <strong>G</strong> indicates Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50M</p>
         */
        @NameInMap("ExpectSpec")
        public String expectSpec;

        /**
         * <p>Indicates whether the data about pending orders is returned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasReservationData")
        public String hasReservationData;

        /**
         * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>CT</strong>: China Telecom.</li>
         * <li><strong>CU</strong>: China Unicom.</li>
         * <li><strong>CM</strong>: China Mobile.</li>
         * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland.</li>
         * <li><strong>Equinix</strong>: Equinix.</li>
         * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CT</p>
         */
        @NameInMap("LineOperator")
        public String lineOperator;

        /**
         * <p>The status of the letter of authorization (LOA). Valid values:</p>
         * <ul>
         * <li><strong>Applying</strong></li>
         * <li><strong>Accept</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Rejected</strong></li>
         * <li><strong>Completing</strong></li>
         * <li><strong>Complete</strong></li>
         * <li><strong>Deleted</strong></li>
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
         * <p>The payer for the shared Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>PayByPhysicalConnectionOwner</strong>: The partner pays for the shared Express Connect circuit.</li>
         * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: The tenant pays for the shared Express Connect circuit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByPhysicalConnectionOwner</p>
         */
        @NameInMap("OrderMode")
        public String orderMode;

        /**
         * <p>The ID of the Alibaba Cloud account to which the shared Express Connect circuit belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>283117732402483989</p>
         */
        @NameInMap("ParentPhysicalConnectionAliUid")
        public Long parentPhysicalConnectionAliUid;

        /**
         * <p>The ID of the Express Connect circuit that is used to create the hosted connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1ciz7ekd2grn1as****</p>
         */
        @NameInMap("ParentPhysicalConnectionId")
        public String parentPhysicalConnectionId;

        /**
         * <p>The geographical location of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>XX Number, XX Road, XX Town, XX District, Hangzhou City, Zhejiang Province.</p>
         */
        @NameInMap("PeerLocation")
        public String peerLocation;

        /**
         * <p>The ID of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1ciz7ekd2grn1as****</p>
         */
        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        /**
         * <p>The ID of the port on the access device.</p>
         * 
         * <strong>example:</strong>
         * <p>1/1/1</p>
         */
        @NameInMap("PortNumber")
        public String portNumber;

        /**
         * <p>The port type. Valid values:</p>
         * <ul>
         * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-T</strong>: 1,000 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 km)</li>
         * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
         * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 km)</li>
         * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
         * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
         * </ul>
         * <blockquote>
         * <p> To create ports of 40GBase-LR and 100GBase-LR, you must first contact your account manager.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10GBase-LR</p>
         */
        @NameInMap("PortType")
        public String portType;

        /**
         * <p>The type of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>VirtualPhysicalConnection</strong>: shared Express Connect circuit</li>
         * <li><strong>PhysicalConnection</strong>: dedicated Express Connect circuit</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PhysicalConnection</p>
         */
        @NameInMap("ProductType")
        public String productType;

        @NameInMap("QosId")
        public String qosId;

        /**
         * <p>The ID of the redundant Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-119mfjzm****</p>
         */
        @NameInMap("RedundantPhysicalConnectionId")
        public String redundantPhysicalConnectionId;

        /**
         * <p>The time when the pending order takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-25T11:01:04Z</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The billing method of the pending order.</p>
         * <p>If <strong>PayByBandwidth</strong> is returned, it indicates that the Express Connect circuit is billed on a pay-by-bandwidth basis.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        /**
         * <p>The type of the pending order.</p>
         * <p>If the value is set to <strong>RENEW</strong>, it indicates that the order is placed for service renewal.</p>
         * 
         * <strong>example:</strong>
         * <p>RENEW</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>The ID of the resource group to which the ACL belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwu3k52prgdi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The specification of the Express Connect circuit.</p>
         * <p>Unit: <strong>G</strong> (Gbit/s).</p>
         * 
         * <strong>example:</strong>
         * <p>10G</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>Initial</strong>: The application is under review.</li>
         * <li><strong>Approved</strong>: The application is approved.</li>
         * <li><strong>Allocating</strong>: The system is allocating resources.</li>
         * <li><strong>Allocated</strong>: The Express Connect circuit is under construction.</li>
         * <li><strong>Confirmed</strong>: The Express Connect circuit is pending for user confirmation.</li>
         * <li><strong>Enabled</strong>: The Express Connect circuit is enabled.</li>
         * <li><strong>Rejected</strong>: The application is rejected.</li>
         * <li><strong>Canceled</strong>: The application is canceled.</li>
         * <li><strong>Allocation Failed</strong>: The system failed to allocate resources.</li>
         * <li><strong>Terminating</strong>: The Express Connect circuit is being disabled.</li>
         * <li><strong>Terminated</strong>: The Express Connect circuit is disabled.</li>
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
        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionTypeTags tags;

        /**
         * <p>The type of resource to which the Express Connect circuit is connected. Only <strong>VPC</strong> may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The number of hosted connections that are established over the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VirtualPhysicalConnectionCount")
        public Integer virtualPhysicalConnectionCount;

        /**
         * <p>The VLAN ID of the shared Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("VlanId")
        public String vlanId;

        /**
         * <p>The status of the hosted connection. Valid values:</p>
         * <ul>
         * <li><strong>Confirmed</strong></li>
         * <li><strong>UnConfirmed</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Confirmed</p>
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

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setQosId(String qosId) {
            this.qosId = qosId;
            return this;
        }
        public String getQosId() {
            return this.qosId;
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
