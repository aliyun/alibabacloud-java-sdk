// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeEndPointEventListResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<DescribeEndPointEventListResponseBodyNodes> nodes;

    /**
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>开始发布</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("Ts")
        public Long ts;

        /**
         * <strong>example:</strong>
         * <p>1614936817123</p>
         */
        @NameInMap("TsInMs")
        public String tsInMs;

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

        public DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList setTsInMs(String tsInMs) {
            this.tsInMs = tsInMs;
            return this;
        }
        public String getTsInMs() {
            return this.tsInMs;
        }

    }

    public static class DescribeEndPointEventListResponseBodyNodesEventDataItems extends TeaModel {
        @NameInMap("EventList")
        public java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItemsEventList> eventList;

        /**
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
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
        @NameInMap("EventDataItems")
        public java.util.List<DescribeEndPointEventListResponseBodyNodesEventDataItems> eventDataItems;

        /**
         * <strong>example:</strong>
         * <p>testuserid</p>
         */
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
