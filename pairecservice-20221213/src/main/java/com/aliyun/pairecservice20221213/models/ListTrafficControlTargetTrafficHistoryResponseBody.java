// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTrafficControlTargetTrafficHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>E1</p>
         */
        @NameInMap("ExperimentId")
        public String experimentId;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        /**
         * <strong>example:</strong>
         * <p>2023-10-10 10:10:58</p>
         */
        @NameInMap("RecordTime")
        public String recordTime;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TrafficControlTargetAimTraffic")
        public Double trafficControlTargetAimTraffic;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TrafficControlTargetTraffic")
        public Double trafficControlTargetTraffic;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TrafficControlTaskTraffic")
        public Double trafficControlTaskTraffic;

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

        public ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories setTrafficControlTargetAimTraffic(Double trafficControlTargetAimTraffic) {
            this.trafficControlTargetAimTraffic = trafficControlTargetAimTraffic;
            return this;
        }
        public Double getTrafficControlTargetAimTraffic() {
            return this.trafficControlTargetAimTraffic;
        }

        public ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories setTrafficControlTargetTraffic(Double trafficControlTargetTraffic) {
            this.trafficControlTargetTraffic = trafficControlTargetTraffic;
            return this;
        }
        public Double getTrafficControlTargetTraffic() {
            return this.trafficControlTargetTraffic;
        }

        public ListTrafficControlTargetTrafficHistoryResponseBodyTrafficControlTaskTrafficHistories setTrafficControlTaskTraffic(Double trafficControlTaskTraffic) {
            this.trafficControlTaskTraffic = trafficControlTaskTraffic;
            return this;
        }
        public Double getTrafficControlTaskTraffic() {
            return this.trafficControlTaskTraffic;
        }

    }

}
