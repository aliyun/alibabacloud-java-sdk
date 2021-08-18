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
        // 事件名称。
        @NameInMap("EventName")
        public String eventName;

        // 事件类型，取值：USER：用户事件。SYSTEM：系统事件。
        @NameInMap("EventType")
        public String eventType;

        // 事件发生的时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("Ts")
        public Long ts;

        public static DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList self = new DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList();
            return TeaModel.build(map, self);
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

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

    }

    public static class DescribeEndPointEventListResponseBodyNodesEventDataItems extends TeaModel {
        // 第一个事件发生的时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("Ts")
        public Long ts;

        // 事件列表。
        @NameInMap("EventList")
        public java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList> eventList;

        public static DescribeEndPointEventListResponseBodyNodesEventDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointEventListResponseBodyNodesEventDataItems self = new DescribeEndPointEventListResponseBodyNodesEventDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItems setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

        public DescribeEndPointEventListResponseBodyNodesEventDataItems setEventList(java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList> eventList) {
            this.eventList = eventList;
            return this;
        }
        public java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList> getEventList() {
            return this.eventList;
        }

    }

    public static class DescribeEndPointEventListResponseBodyNodes extends TeaModel {
        // 用户ID
        @NameInMap("UserId")
        public String userId;

        // 事件数据列表
        @NameInMap("EventDataItems")
        public java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItems> eventDataItems;

        public static DescribeEndPointEventListResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointEventListResponseBodyNodes self = new DescribeEndPointEventListResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeEndPointEventListResponseBodyNodes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeEndPointEventListResponseBodyNodes setEventDataItems(java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItems> eventDataItems) {
            this.eventDataItems = eventDataItems;
            return this;
        }
        public java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItems> getEventDataItems() {
            return this.eventDataItems;
        }

    }

}
