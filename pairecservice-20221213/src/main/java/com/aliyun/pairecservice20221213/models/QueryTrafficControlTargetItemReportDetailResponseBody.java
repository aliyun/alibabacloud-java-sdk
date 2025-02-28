// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryTrafficControlTargetItemReportDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficControlTargetItemReportDetail")
    public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetail trafficControlTargetItemReportDetail;

    public static QueryTrafficControlTargetItemReportDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrafficControlTargetItemReportDetailResponseBody self = new QueryTrafficControlTargetItemReportDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrafficControlTargetItemReportDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrafficControlTargetItemReportDetailResponseBody setTrafficControlTargetItemReportDetail(QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetail trafficControlTargetItemReportDetail) {
        this.trafficControlTargetItemReportDetail = trafficControlTargetItemReportDetail;
        return this;
    }
    public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetail getTrafficControlTargetItemReportDetail() {
        return this.trafficControlTargetItemReportDetail;
    }

    public static class QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails extends TeaModel {
        @NameInMap("Features")
        public java.util.Map<String, ?> features;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("TargetProgress")
        public String targetProgress;

        @NameInMap("TargetTraffic")
        public Long targetTraffic;

        public static QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails build(java.util.Map<String, ?> map) throws Exception {
            QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails self = new QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails();
            return TeaModel.build(map, self);
        }

        public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails setTargetProgress(String targetProgress) {
            this.targetProgress = targetProgress;
            return this;
        }
        public String getTargetProgress() {
            return this.targetProgress;
        }

        public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails setTargetTraffic(Long targetTraffic) {
            this.targetTraffic = targetTraffic;
            return this;
        }
        public Long getTargetTraffic() {
            return this.targetTraffic;
        }

    }

    public static class QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails extends TeaModel {
        @NameInMap("Features")
        public java.util.Map<String, ?> features;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("TargetProgress")
        public String targetProgress;

        @NameInMap("TargetTraffic")
        public Long targetTraffic;

        public static QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails build(java.util.Map<String, ?> map) throws Exception {
            QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails self = new QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails();
            return TeaModel.build(map, self);
        }

        public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails setTargetProgress(String targetProgress) {
            this.targetProgress = targetProgress;
            return this;
        }
        public String getTargetProgress() {
            return this.targetProgress;
        }

        public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails setTargetTraffic(Long targetTraffic) {
            this.targetTraffic = targetTraffic;
            return this;
        }
        public Long getTargetTraffic() {
            return this.targetTraffic;
        }

    }

    public static class QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetail extends TeaModel {
        @NameInMap("ItemControlTailReportDetails")
        public java.util.List<QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails> itemControlTailReportDetails;

        @NameInMap("ItemControlTopReportDetails")
        public java.util.List<QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails> itemControlTopReportDetails;

        public static QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetail self = new QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetail();
            return TeaModel.build(map, self);
        }

        public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetail setItemControlTailReportDetails(java.util.List<QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails> itemControlTailReportDetails) {
            this.itemControlTailReportDetails = itemControlTailReportDetails;
            return this;
        }
        public java.util.List<QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTailReportDetails> getItemControlTailReportDetails() {
            return this.itemControlTailReportDetails;
        }

        public QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetail setItemControlTopReportDetails(java.util.List<QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails> itemControlTopReportDetails) {
            this.itemControlTopReportDetails = itemControlTopReportDetails;
            return this;
        }
        public java.util.List<QueryTrafficControlTargetItemReportDetailResponseBodyTrafficControlTargetItemReportDetailItemControlTopReportDetails> getItemControlTopReportDetails() {
            return this.itemControlTopReportDetails;
        }

    }

}
