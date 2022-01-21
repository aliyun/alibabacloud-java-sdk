// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeUserFlowStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SagStatistics")
    public DescribeUserFlowStatisticsResponseBodySagStatistics sagStatistics;

    public static DescribeUserFlowStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserFlowStatisticsResponseBody self = new DescribeUserFlowStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserFlowStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserFlowStatisticsResponseBody setSagStatistics(DescribeUserFlowStatisticsResponseBodySagStatistics sagStatistics) {
        this.sagStatistics = sagStatistics;
        return this;
    }
    public DescribeUserFlowStatisticsResponseBodySagStatistics getSagStatistics() {
        return this.sagStatistics;
    }

    public static class DescribeUserFlowStatisticsResponseBodySagStatisticsStatistics extends TeaModel {
        @NameInMap("TotalBytes")
        public String totalBytes;

        @NameInMap("UserName")
        public String userName;

        public static DescribeUserFlowStatisticsResponseBodySagStatisticsStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserFlowStatisticsResponseBodySagStatisticsStatistics self = new DescribeUserFlowStatisticsResponseBodySagStatisticsStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeUserFlowStatisticsResponseBodySagStatisticsStatistics setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeUserFlowStatisticsResponseBodySagStatisticsStatistics setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeUserFlowStatisticsResponseBodySagStatistics extends TeaModel {
        @NameInMap("Statistics")
        public java.util.List<DescribeUserFlowStatisticsResponseBodySagStatisticsStatistics> statistics;

        public static DescribeUserFlowStatisticsResponseBodySagStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserFlowStatisticsResponseBodySagStatistics self = new DescribeUserFlowStatisticsResponseBodySagStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeUserFlowStatisticsResponseBodySagStatistics setStatistics(java.util.List<DescribeUserFlowStatisticsResponseBodySagStatisticsStatistics> statistics) {
            this.statistics = statistics;
            return this;
        }
        public java.util.List<DescribeUserFlowStatisticsResponseBodySagStatisticsStatistics> getStatistics() {
            return this.statistics;
        }

    }

}
