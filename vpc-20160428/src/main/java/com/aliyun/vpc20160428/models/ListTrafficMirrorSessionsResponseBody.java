// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorSessionsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

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

    public static class ListTrafficMirrorSessionsResponseBodyTrafficMirrorSessions extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("PacketLength")
        public Integer packetLength;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("TrafficMirrorFilterId")
        public String trafficMirrorFilterId;

        @NameInMap("TrafficMirrorSessionBusinessStatus")
        public String trafficMirrorSessionBusinessStatus;

        @NameInMap("TrafficMirrorSessionDescription")
        public String trafficMirrorSessionDescription;

        @NameInMap("TrafficMirrorSessionId")
        public String trafficMirrorSessionId;

        @NameInMap("TrafficMirrorSessionName")
        public String trafficMirrorSessionName;

        @NameInMap("TrafficMirrorSessionStatus")
        public String trafficMirrorSessionStatus;

        @NameInMap("TrafficMirrorSourceIds")
        public java.util.List<String> trafficMirrorSourceIds;

        @NameInMap("TrafficMirrorTargetId")
        public String trafficMirrorTargetId;

        @NameInMap("TrafficMirrorTargetType")
        public String trafficMirrorTargetType;

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
