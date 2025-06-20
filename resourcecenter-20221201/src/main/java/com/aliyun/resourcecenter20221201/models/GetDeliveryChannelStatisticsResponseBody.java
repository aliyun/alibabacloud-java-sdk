// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetDeliveryChannelStatisticsResponseBody extends TeaModel {
    @NameInMap("DeliveryChannelStatistics")
    public GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics deliveryChannelStatistics;

    /**
     * <strong>example:</strong>
     * <p>80DF0610-504C-56D7-BDCF-7C92FD687***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeliveryChannelStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryChannelStatisticsResponseBody self = new GetDeliveryChannelStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeliveryChannelStatisticsResponseBody setDeliveryChannelStatistics(GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics deliveryChannelStatistics) {
        this.deliveryChannelStatistics = deliveryChannelStatistics;
        return this;
    }
    public GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics getDeliveryChannelStatistics() {
        return this.deliveryChannelStatistics;
    }

    public GetDeliveryChannelStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dc-6q79dm4o9***</p>
         */
        @NameInMap("DeliveryChannelId")
        public String deliveryChannelId;

        /**
         * <strong>example:</strong>
         * <p>test-delivery-channel</p>
         */
        @NameInMap("DeliveryChannelName")
        public String deliveryChannelName;

        /**
         * <strong>example:</strong>
         * <p>2025-06-03T16:05:15Z</p>
         */
        @NameInMap("LatestChangeDeliveryTime")
        public String latestChangeDeliveryTime;

        /**
         * <strong>example:</strong>
         * <p>2025-06-03T16:00:00Z</p>
         */
        @NameInMap("LatestSnapshotDeliveryTime")
        public String latestSnapshotDeliveryTime;

        public static GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics self = new GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics();
            return TeaModel.build(map, self);
        }

        public GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics setDeliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        public GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics setDeliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        public GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics setLatestChangeDeliveryTime(String latestChangeDeliveryTime) {
            this.latestChangeDeliveryTime = latestChangeDeliveryTime;
            return this;
        }
        public String getLatestChangeDeliveryTime() {
            return this.latestChangeDeliveryTime;
        }

        public GetDeliveryChannelStatisticsResponseBodyDeliveryChannelStatistics setLatestSnapshotDeliveryTime(String latestSnapshotDeliveryTime) {
            this.latestSnapshotDeliveryTime = latestSnapshotDeliveryTime;
            return this;
        }
        public String getLatestSnapshotDeliveryTime() {
            return this.latestSnapshotDeliveryTime;
        }

    }

}
