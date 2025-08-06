// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRealtimeDeliveryAccResponseBody extends TeaModel {
    /**
     * <p>The information about real-time log deliveries.</p>
     */
    @NameInMap("RealTimeDeliveryAccData")
    public DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData realTimeDeliveryAccData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8AA0364-0FDB-4AD5-****-D69FAB8924ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodRealtimeDeliveryAccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRealtimeDeliveryAccResponseBody self = new DescribeVodRealtimeDeliveryAccResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodRealtimeDeliveryAccResponseBody setRealTimeDeliveryAccData(DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData realTimeDeliveryAccData) {
        this.realTimeDeliveryAccData = realTimeDeliveryAccData;
        return this;
    }
    public DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData getRealTimeDeliveryAccData() {
        return this.realTimeDeliveryAccData;
    }

    public DescribeVodRealtimeDeliveryAccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData extends TeaModel {
        /**
         * <p>The number of failed real-time log deliveries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailedNum")
        public Integer failedNum;

        /**
         * <p>The number of successful real-time log deliveries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessNum")
        public Integer successNum;

        /**
         * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-10-20T04:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData self = new DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData();
            return TeaModel.build(map, self);
        }

        public DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData setFailedNum(Integer failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Integer getFailedNum() {
            return this.failedNum;
        }

        public DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData setSuccessNum(Integer successNum) {
            this.successNum = successNum;
            return this;
        }
        public Integer getSuccessNum() {
            return this.successNum;
        }

        public DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData extends TeaModel {
        @NameInMap("AccData")
        public java.util.List<DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData> accData;

        public static DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData self = new DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData();
            return TeaModel.build(map, self);
        }

        public DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData setAccData(java.util.List<DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData> accData) {
            this.accData = accData;
            return this;
        }
        public java.util.List<DescribeVodRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData> getAccData() {
            return this.accData;
        }

    }

}
