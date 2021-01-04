// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeUserOnlineClientStatisticsResponseBody extends TeaModel {
    @NameInMap("UserStatistics")
    public DescribeUserOnlineClientStatisticsResponseBodyUserStatistics userStatistics;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserOnlineClientStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserOnlineClientStatisticsResponseBody self = new DescribeUserOnlineClientStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserOnlineClientStatisticsResponseBody setUserStatistics(DescribeUserOnlineClientStatisticsResponseBodyUserStatistics userStatistics) {
        this.userStatistics = userStatistics;
        return this;
    }
    public DescribeUserOnlineClientStatisticsResponseBodyUserStatistics getUserStatistics() {
        return this.userStatistics;
    }

    public DescribeUserOnlineClientStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserOnlineClientStatisticsResponseBodyUserStatisticsStatistics extends TeaModel {
        @NameInMap("OnlineCount")
        public String onlineCount;

        @NameInMap("UserName")
        public String userName;

        public static DescribeUserOnlineClientStatisticsResponseBodyUserStatisticsStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserOnlineClientStatisticsResponseBodyUserStatisticsStatistics self = new DescribeUserOnlineClientStatisticsResponseBodyUserStatisticsStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeUserOnlineClientStatisticsResponseBodyUserStatisticsStatistics setOnlineCount(String onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public String getOnlineCount() {
            return this.onlineCount;
        }

        public DescribeUserOnlineClientStatisticsResponseBodyUserStatisticsStatistics setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeUserOnlineClientStatisticsResponseBodyUserStatistics extends TeaModel {
        @NameInMap("Statistics")
        public java.util.List<DescribeUserOnlineClientStatisticsResponseBodyUserStatisticsStatistics> statistics;

        public static DescribeUserOnlineClientStatisticsResponseBodyUserStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserOnlineClientStatisticsResponseBodyUserStatistics self = new DescribeUserOnlineClientStatisticsResponseBodyUserStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeUserOnlineClientStatisticsResponseBodyUserStatistics setStatistics(java.util.List<DescribeUserOnlineClientStatisticsResponseBodyUserStatisticsStatistics> statistics) {
            this.statistics = statistics;
            return this;
        }
        public java.util.List<DescribeUserOnlineClientStatisticsResponseBodyUserStatisticsStatistics> getStatistics() {
            return this.statistics;
        }

    }

}
