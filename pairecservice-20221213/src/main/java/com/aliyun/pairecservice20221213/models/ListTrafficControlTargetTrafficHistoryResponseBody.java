// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTrafficControlTargetTrafficHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("TrafficControlTaskTrafficHistories")
    public java.util.List<ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories> trafficControlTaskTrafficHistories;

    public static ListTrafficControlTargetTrafficHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficControlTargetTrafficHistoryResponseBody self = new ListTrafficControlTargetTrafficHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrafficControlTargetTrafficHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrafficControlTargetTrafficHistoryResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListTrafficControlTargetTrafficHistoryResponseBody setTrafficControlTaskTrafficHistories(java.util.List<ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories> trafficControlTaskTrafficHistories) {
        this.trafficControlTaskTrafficHistories = trafficControlTaskTrafficHistories;
        return this;
    }
    public java.util.List<ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories> getTrafficControlTaskTrafficHistories() {
        return this.trafficControlTaskTrafficHistories;
    }

    public static class ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories extends TeaModel {
        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("RecordTime")
        public String recordTime;

        @NameInMap("TrafficControlTargetAimTraffic")
        public String trafficControlTargetAimTraffic;

        @NameInMap("TrafficControlTargetTraffic")
        public String trafficControlTargetTraffic;

        @NameInMap("TrafficControlTaskTraffic")
        public String trafficControlTaskTraffic;

        public static ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories self = new ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories();
            return TeaModel.build(map, self);
        }

        public ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories setRecordTime(String recordTime) {
            this.recordTime = recordTime;
            return this;
        }
        public String getRecordTime() {
            return this.recordTime;
        }

        public ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories setTrafficControlTargetAimTraffic(String trafficControlTargetAimTraffic) {
            this.trafficControlTargetAimTraffic = trafficControlTargetAimTraffic;
            return this;
        }
        public String getTrafficControlTargetAimTraffic() {
            return this.trafficControlTargetAimTraffic;
        }

        public ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories setTrafficControlTargetTraffic(String trafficControlTargetTraffic) {
            this.trafficControlTargetTraffic = trafficControlTargetTraffic;
            return this;
        }
        public String getTrafficControlTargetTraffic() {
            return this.trafficControlTargetTraffic;
        }

        public ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories setTrafficControlTaskTraffic(String trafficControlTaskTraffic) {
            this.trafficControlTaskTraffic = trafficControlTaskTraffic;
            return this;
        }
        public String getTrafficControlTaskTraffic() {
            return this.trafficControlTaskTraffic;
        }

    }

}
