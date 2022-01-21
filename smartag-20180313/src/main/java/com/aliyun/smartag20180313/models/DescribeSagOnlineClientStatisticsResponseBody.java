// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagOnlineClientStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SagStatistics")
    public DescribeSagOnlineClientStatisticsResponseBodySagStatistics sagStatistics;

    public static DescribeSagOnlineClientStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagOnlineClientStatisticsResponseBody self = new DescribeSagOnlineClientStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagOnlineClientStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagOnlineClientStatisticsResponseBody setSagStatistics(DescribeSagOnlineClientStatisticsResponseBodySagStatistics sagStatistics) {
        this.sagStatistics = sagStatistics;
        return this;
    }
    public DescribeSagOnlineClientStatisticsResponseBodySagStatistics getSagStatistics() {
        return this.sagStatistics;
    }

    public static class DescribeSagOnlineClientStatisticsResponseBodySagStatisticsStatistics extends TeaModel {
        @NameInMap("OnlineCount")
        public String onlineCount;

        @NameInMap("SmartAGId")
        public String smartAGId;

        public static DescribeSagOnlineClientStatisticsResponseBodySagStatisticsStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagOnlineClientStatisticsResponseBodySagStatisticsStatistics self = new DescribeSagOnlineClientStatisticsResponseBodySagStatisticsStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeSagOnlineClientStatisticsResponseBodySagStatisticsStatistics setOnlineCount(String onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public String getOnlineCount() {
            return this.onlineCount;
        }

        public DescribeSagOnlineClientStatisticsResponseBodySagStatisticsStatistics setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

    }

    public static class DescribeSagOnlineClientStatisticsResponseBodySagStatistics extends TeaModel {
        @NameInMap("Statistics")
        public java.util.List<DescribeSagOnlineClientStatisticsResponseBodySagStatisticsStatistics> statistics;

        public static DescribeSagOnlineClientStatisticsResponseBodySagStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagOnlineClientStatisticsResponseBodySagStatistics self = new DescribeSagOnlineClientStatisticsResponseBodySagStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeSagOnlineClientStatisticsResponseBodySagStatistics setStatistics(java.util.List<DescribeSagOnlineClientStatisticsResponseBodySagStatisticsStatistics> statistics) {
            this.statistics = statistics;
            return this;
        }
        public java.util.List<DescribeSagOnlineClientStatisticsResponseBodySagStatisticsStatistics> getStatistics() {
            return this.statistics;
        }

    }

}
