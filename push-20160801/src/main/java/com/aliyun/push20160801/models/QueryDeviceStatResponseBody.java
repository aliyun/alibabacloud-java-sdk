// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDeviceStatResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppDeviceStats")
    public QueryDeviceStatResponseBodyAppDeviceStats appDeviceStats;

    public static QueryDeviceStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatResponseBody self = new QueryDeviceStatResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceStatResponseBody setAppDeviceStats(QueryDeviceStatResponseBodyAppDeviceStats appDeviceStats) {
        this.appDeviceStats = appDeviceStats;
        return this;
    }
    public QueryDeviceStatResponseBodyAppDeviceStats getAppDeviceStats() {
        return this.appDeviceStats;
    }

    public static class QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("Count")
        public Long count;

        public static QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat self = new QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat();
            return TeaModel.build(map, self);
        }

        public QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public QueryDeviceStatResponseBodyAppDeviceStatsAppDeviceStat setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
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
