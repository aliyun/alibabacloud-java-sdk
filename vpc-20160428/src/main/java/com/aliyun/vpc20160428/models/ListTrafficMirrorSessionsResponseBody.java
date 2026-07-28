// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorSessionsResponseBody extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If <strong>NextToken</strong> has a value, the value is the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>739CA01C-92EB-4C69-BCC0-280149C6F41E</p>
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
    public String totalCount;

    /**
     * <p>The details of traffic mirror sessions.</p>
     */
    @NameInMap("TrafficMirrorSessions")
    public java.util.List<ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions> trafficMirrorSessions;

    public static ListTrafficMirrorSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMirrorSessionsResponseBody self = new ListTrafficMirrorSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrafficMirrorSessionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTrafficMirrorSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrafficMirrorSessionsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListTrafficMirrorSessionsResponseBody setTrafficMirrorSessions(java.util.List<ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions> trafficMirrorSessions) {
        this.trafficMirrorSessions = trafficMirrorSessions;
        return this;
    }
    public java.util.List<ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions> getTrafficMirrorSessions() {
        return this.trafficMirrorSessions;
    }

    public static class ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessionsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessionsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessionsTags self = new ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessionsTags();
            return TeaModel.build(map, self);
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessionsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessionsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions extends TeaModel {
        /**
         * <p>The time when the traffic mirror session was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-05T15:26Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the traffic mirror session is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong> (default): The traffic mirror session is not enabled.</p>
         * </li>
         * <li><p><strong>true</strong>: The traffic mirror session is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The length of the original packet to be mirrored (excluding the VXLAN packet length). Default value: <strong>1500</strong>. Valid values: <strong>64</strong> to <strong>8500</strong>. Unit: bytes.</p>
         * <ul>
         * <li><p>This parameter affects the packet length received by the traffic mirror destination. For more information, see the mirrored packet length and MTU limits in <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
         * </li>
         * <li><p>This parameter is available only in specific regions. For more information, see the mirrored packet length parameter description in <a href="https://help.aliyun.com/document_detail/207514.html">Create and manage traffic mirrors</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("PacketLength")
        public Integer packetLength;

        /**
         * <p>The priority of the traffic mirror session.</p>
         * <p>A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the resource group to which the traffic mirroring session belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessionsTags> tags;

        /**
         * <p>The instance ID of the traffic mirror filter.</p>
         * 
         * <strong>example:</strong>
         * <p>tmf-j6cmls82xnc86vtpe****</p>
         */
        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        /**
         * <p>The business status of the traffic mirror session. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Normal.</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>: financial lock.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("TrafficMirrorSessionBusinessStatus")
        public String trafficMirrorSessionBusinessStatus;

        /**
         * <p>The description of the traffic mirror session.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a session.</p>
         */
        @NameInMap("TrafficMirrorSessionDescription")
        public String trafficMirrorSessionDescription;

        /**
         * <p>The instance ID of the traffic mirror session.</p>
         * 
         * <strong>example:</strong>
         * <p>tms-j6cla50buc44ap8tu****</p>
         */
        @NameInMap("TrafficMirrorSessionId")
        public String trafficMirrorSessionId;

        /**
         * <p>The name of the traffic mirror session.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("TrafficMirrorSessionName")
        public String trafficMirrorSessionName;

        /**
         * <p>The status of the traffic mirror session. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: being created.</li>
         * <li><strong>Created</strong>: created.</li>
         * <li><strong>Modifying</strong>: being modified.</li>
         * <li><strong>Deleting</strong>: being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("TrafficMirrorSessionStatus")
        public String trafficMirrorSessionStatus;

        /**
         * <p>The instance IDs of the traffic mirror sources.</p>
         */
        @NameInMap("TrafficMirrorSourceIds")
        public java.util.List<String> trafficMirrorSourceIds;

        /**
         * <p>The instance ID of the traffic mirror destination.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-j6c2fp57q8rr47rp****</p>
         */
        @NameInMap("TrafficMirrorTargetId")
        public String trafficMirrorTargetId;

        /**
         * <p>The traffic mirror destination type. Valid values:</p>
         * <ul>
         * <li><p><strong>NetworkInterface</strong>: network interface controller (NIC).</p>
         * </li>
         * <li><p><strong>SLB</strong>: internal-facing SLB instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NetworkInterface</p>
         */
        @NameInMap("TrafficMirrorTargetType")
        public String trafficMirrorTargetType;

        /**
         * <p>The VNI used to distinguish different mirrored data.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("VirtualNetworkId")
        public Integer virtualNetworkId;

        public static ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions self = new ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions();
            return TeaModel.build(map, self);
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setPacketLength(Integer packetLength) {
            this.packetLength = packetLength;
            return this;
        }
        public Integer getPacketLength() {
            return this.packetLength;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setTags(java.util.List<ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessionsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessionsTags> getTags() {
            return this.tags;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setTrafficMirrorFilterId(String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }
        public String getTrafficMirrorFilterId() {
            return this.trafficMirrorFilterId;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setTrafficMirrorSessionBusinessStatus(String trafficMirrorSessionBusinessStatus) {
            this.trafficMirrorSessionBusinessStatus = trafficMirrorSessionBusinessStatus;
            return this;
        }
        public String getTrafficMirrorSessionBusinessStatus() {
            return this.trafficMirrorSessionBusinessStatus;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setTrafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
            this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
            return this;
        }
        public String getTrafficMirrorSessionDescription() {
            return this.trafficMirrorSessionDescription;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setTrafficMirrorSessionId(String trafficMirrorSessionId) {
            this.trafficMirrorSessionId = trafficMirrorSessionId;
            return this;
        }
        public String getTrafficMirrorSessionId() {
            return this.trafficMirrorSessionId;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setTrafficMirrorSessionName(String trafficMirrorSessionName) {
            this.trafficMirrorSessionName = trafficMirrorSessionName;
            return this;
        }
        public String getTrafficMirrorSessionName() {
            return this.trafficMirrorSessionName;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setTrafficMirrorSessionStatus(String trafficMirrorSessionStatus) {
            this.trafficMirrorSessionStatus = trafficMirrorSessionStatus;
            return this;
        }
        public String getTrafficMirrorSessionStatus() {
            return this.trafficMirrorSessionStatus;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setTrafficMirrorSourceIds(java.util.List<String> trafficMirrorSourceIds) {
            this.trafficMirrorSourceIds = trafficMirrorSourceIds;
            return this;
        }
        public java.util.List<String> getTrafficMirrorSourceIds() {
            return this.trafficMirrorSourceIds;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setTrafficMirrorTargetId(String trafficMirrorTargetId) {
            this.trafficMirrorTargetId = trafficMirrorTargetId;
            return this;
        }
        public String getTrafficMirrorTargetId() {
            return this.trafficMirrorTargetId;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setTrafficMirrorTargetType(String trafficMirrorTargetType) {
            this.trafficMirrorTargetType = trafficMirrorTargetType;
            return this;
        }
        public String getTrafficMirrorTargetType() {
            return this.trafficMirrorTargetType;
        }

        public ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions setVirtualNetworkId(Integer virtualNetworkId) {
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        public Integer getVirtualNetworkId() {
            return this.virtualNetworkId;
        }

    }

}
