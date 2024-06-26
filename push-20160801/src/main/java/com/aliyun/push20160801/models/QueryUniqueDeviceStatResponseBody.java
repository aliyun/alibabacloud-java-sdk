// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryUniqueDeviceStatResponseBody extends TeaModel {
    @NameInMap("AppDeviceStats")
    public QueryUniqueDeviceStatResponseBodyAppDeviceStats appDeviceStats;

    /**
     * <strong>example:</strong>
     * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryUniqueDeviceStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUniqueDeviceStatResponseBody self = new QueryUniqueDeviceStatResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUniqueDeviceStatResponseBody setAppDeviceStats(QueryUniqueDeviceStatResponseBodyAppDeviceStats appDeviceStats) {
        this.appDeviceStats = appDeviceStats;
        return this;
    }
    public QueryUniqueDeviceStatResponseBodyAppDeviceStats getAppDeviceStats() {
        return this.appDeviceStats;
    }

    public QueryUniqueDeviceStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryUniqueDeviceStatResponseBodyAppDeviceStatsAppDeviceStat extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>2016-07-25T00:00:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryUniqueDeviceStatResponseBodyAppDeviceStatsAppDeviceStat build(java.util.Map<String, ?> map) throws Exception {
            QueryUniqueDeviceStatResponseBodyAppDeviceStatsAppDeviceStat self = new QueryUniqueDeviceStatResponseBodyAppDeviceStatsAppDeviceStat();
            return TeaModel.build(map, self);
        }

        public QueryUniqueDeviceStatResponseBodyAppDeviceStatsAppDeviceStat setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryUniqueDeviceStatResponseBodyAppDeviceStatsAppDeviceStat setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryUniqueDeviceStatResponseBodyAppDeviceStats extends TeaModel {
        @NameInMap("AppDeviceStat")
        public java.util.List<QueryUniqueDeviceStatResponseBodyAppDeviceStatsAppDeviceStat> appDeviceStat;

        public static QueryUniqueDeviceStatResponseBodyAppDeviceStats build(java.util.Map<String, ?> map) throws Exception {
            QueryUniqueDeviceStatResponseBodyAppDeviceStats self = new QueryUniqueDeviceStatResponseBodyAppDeviceStats();
            return TeaModel.build(map, self);
        }

        public QueryUniqueDeviceStatResponseBodyAppDeviceStats setAppDeviceStat(java.util.List<QueryUniqueDeviceStatResponseBodyAppDeviceStatsAppDeviceStat> appDeviceStat) {
            this.appDeviceStat = appDeviceStat;
            return this;
        }
        public java.util.List<QueryUniqueDeviceStatResponseBodyAppDeviceStatsAppDeviceStat> getAppDeviceStat() {
            return this.appDeviceStat;
        }

    }

}
