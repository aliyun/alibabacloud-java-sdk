// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorSessionsResponseBody extends TeaModel {
    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next queries are sent.</p>
     * <p>*   If a value of **NextToken** is returned, the value is the token that is used for the subsequent query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The details about the traffic mirror session.</p>
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
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
         * <p>Indicates whether the traffic mirror session was enabled.</p>
         * <br>
         * <p>*   **false**: the traffic mirror session was disabled. This is the default value.</p>
         * <p>*   **true**: the traffic mirror session was enabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum transmission unit (MTU).</p>
         */
        @NameInMap("PacketLength")
        public Integer packetLength;

        /**
         * <p>The priority of the traffic mirror session.</p>
         * <br>
         * <p>A smaller value indicates a higher priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the resource group to which the mirrored traffic belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessionsTags> tags;

        /**
         * <p>The ID of the traffic mirror filter.</p>
         */
        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        /**
         * <p>The status of the traffic mirror session.</p>
         * <br>
         * <p>*   **Normal**: active</p>
         * <p>*   **FinancialLocked**: locked due to overdue payments</p>
         */
        @NameInMap("TrafficMirrorSessionBusinessStatus")
        public String trafficMirrorSessionBusinessStatus;

        /**
         * <p>The description of the traffic mirror session.</p>
         */
        @NameInMap("TrafficMirrorSessionDescription")
        public String trafficMirrorSessionDescription;

        /**
         * <p>The ID of the traffic mirror session.</p>
         */
        @NameInMap("TrafficMirrorSessionId")
        public String trafficMirrorSessionId;

        /**
         * <p>The name of the traffic mirror session.</p>
         */
        @NameInMap("TrafficMirrorSessionName")
        public String trafficMirrorSessionName;

        /**
         * <p>The status of the traffic mirror session. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Created**</p>
         * <p>*   **Modifying**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("TrafficMirrorSessionStatus")
        public String trafficMirrorSessionStatus;

        /**
         * <p>The ID of the mirror source.</p>
         */
        @NameInMap("TrafficMirrorSourceIds")
        public java.util.List<String> trafficMirrorSourceIds;

        /**
         * <p>The ID of the mirror destination.</p>
         */
        @NameInMap("TrafficMirrorTargetId")
        public String trafficMirrorTargetId;

        /**
         * <p>The type of the traffic mirror destination. Valid values:</p>
         * <br>
         * <p>*   **NetworkInterface**: an ENI</p>
         * <p>*   **SLB**: an internal-facing SLB instance</p>
         */
        @NameInMap("TrafficMirrorTargetType")
        public String trafficMirrorTargetType;

        /**
         * <p>You can specify VNIs to distinguish different mirrored traffic.</p>
         */
        @NameInMap("VirtualNetworkId")
        public Integer virtualNetworkId;

        public static ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions self = new ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions();
            return TeaModel.build(map, self);
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
