// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeEndPointEventListResponseBody extends TeaModel {
    // 用户基本信息列表。
    @NameInMap("Nodes")
    public java.util.List<DescribeEndPointEventListResponseBodyNodes> nodes;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEndPointEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndPointEventListResponseBody self = new DescribeEndPointEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndPointEventListResponseBody setNodes(java.util.List<DescribeEndPointEventListResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeEndPointEventListResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeEndPointEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList extends TeaModel {
        @NameInMap("Acs")
        public String acs;

        @NameInMap("EventCode")
        public String eventCode;

        // 事件名称。
        @NameInMap("EventName")
        public String eventName;

        // 事件类型，取值：USER：用户事件。SYSTEM：系统事件。
        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Os")
        public String os;

        @NameInMap("Sdk")
        public String sdk;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("StreamType")
        public String streamType;

        @NameInMap("TrackCode")
        public String trackCode;

        @NameInMap("TrackName")
        public String trackName;

        // 事件发生的时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("Ts")
        public Long ts;

        @NameInMap("UserId")
        public String userId;

        public static DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList self = new DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList();
            return TeaModel.build(map, self);
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setAcs(String acs) {
            this.acs = acs;
            return this;
        }
        public String getAcs() {
            return this.acs;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setSdk(String sdk) {
            this.sdk = sdk;
            return this;
        }
        public String getSdk() {
            return this.sdk;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setTrackCode(String trackCode) {
            this.trackCode = trackCode;
            return this;
        }
        public String getTrackCode() {
            return this.trackCode;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setTrackName(String trackName) {
            this.trackName = trackName;
            return this;
        }
        public String getTrackName() {
            return this.trackName;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeEndPointEventListResponseBodyNodesEventDataItems extends TeaModel {
        // 事件列表。
        @NameInMap("EventList")
        public java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList> eventList;

        // 第一个事件发生的时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("Ts")
        public Long ts;

        public static DescribeEndPointEventListResponseBodyNodesEventDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointEventListResponseBodyNodesEventDataItems self = new DescribeEndPointEventListResponseBodyNodesEventDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItems setEventList(java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList> eventList) {
            this.eventList = eventList;
            return this;
        }
        public java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList> getEventList() {
            return this.eventList;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItems setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

    }

    public static class DescribeEndPointEventListResponseBodyNodes extends TeaModel {
        // 事件数据列表
        @NameInMap("EventDataItems")
        public java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItems> eventDataItems;

        // 用户ID
        @NameInMap("UserId")
        public String userId;

        public static DescribeEndPointEventListResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointEventListResponseBodyNodes self = new DescribeEndPointEventListResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeEndPointEventListResponseBodyNodes setEventDataItems(java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItems> eventDataItems) {
            this.eventDataItems = eventDataItems;
            return this;
        }
        public java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItems> getEventDataItems() {
            return this.eventDataItems;
        }

        public DescribeEndPointEventListResponseBodyNodes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
