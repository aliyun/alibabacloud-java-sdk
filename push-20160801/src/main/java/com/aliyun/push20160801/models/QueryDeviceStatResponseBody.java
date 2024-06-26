// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDeviceStatResponseBody extends TeaModel {
    @NameInMap("AppDeviceStats")
    public QueryDeviceStatResponseBodyAppDeviceStats appDeviceStats;

    /**
     * <strong>example:</strong>
     * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryDeviceStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatResponseBody self = new QueryDeviceStatResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatResponseBody setAppDeviceStats(QueryDeviceStatResponseBodyAppDeviceStats appDeviceStats) {
        this.appDeviceStats = appDeviceStats;
        return this;
    }
    public QueryDeviceStatResponseBodyAppDeviceStats getAppDeviceStats() {
        return this.appDeviceStats;
    }

    public QueryDeviceStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>iOS</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>2016-07-28T16:00:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat self = new QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat();
            return TeaModel.build(map, self);
        }

        public QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryDeviceStatResponseBodyAppDeviceStats extends TeaModel {
        @NameInMap("AppDeviceStat")
        public java.util.List<QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat> appDeviceStat;

        public static QueryDeviceStatResponseBodyAppDeviceStats build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceStatResponseBodyAppDeviceStats self = new QueryDeviceStatResponseBodyAppDeviceStats();
            return TeaModel.build(map, self);
        }

        public QueryDeviceStatResponseBodyAppDeviceStats setAppDeviceStat(java.util.List<QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat> appDeviceStat) {
            this.appDeviceStat = appDeviceStat;
            return this;
        }
        public java.util.List<QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat> getAppDeviceStat() {
            return this.appDeviceStat;
        }

    }

}
