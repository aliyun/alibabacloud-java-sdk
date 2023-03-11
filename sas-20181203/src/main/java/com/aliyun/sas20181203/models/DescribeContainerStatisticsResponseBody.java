// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerStatisticsResponseBody extends TeaModel {
    /**
     * <p>The alert statistics of container assets.</p>
     */
    @NameInMap("Data")
    public DescribeContainerStatisticsResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerStatisticsResponseBody self = new DescribeContainerStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerStatisticsResponseBody setData(DescribeContainerStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeContainerStatisticsResponseBodyData getData() {
        return this.data;
    }

    public DescribeContainerStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>The number of alerts whose risk level is **Reminder**.</p>
         */
        @NameInMap("RemindAlarmCount")
        public Integer remindAlarmCount;

        /**
         * <p>The number of alerts whose risk level is **Urgent**.</p>
         */
        @NameInMap("SeriousAlarmCount")
        public Integer seriousAlarmCount;

        /**
         * <p>The number of alerts whose risk level is **Suspicious**.</p>
         */
        @NameInMap("SuspiciousAlarmCount")
        public Integer suspiciousAlarmCount;

        /**
         * <p>The total number of alerts that are generated in the current container cluster.</p>
         */
        @NameInMap("TotalAlarmCount")
        public Integer totalAlarmCount;

        /**
         * <p>The total number of nodes in the current container cluster.</p>
         */
        @NameInMap("TotalNode")
        public Integer totalNode;

        /**
         * <p>The number of nodes on which alerts are generated in the current container cluster.</p>
         */
        @NameInMap("hasRiskNode")
        public Integer hasRiskNode;

        public static DescribeContainerStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerStatisticsResponseBodyData self = new DescribeContainerStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContainerStatisticsResponseBodyData setRemindAlarmCount(Integer remindAlarmCount) {
            this.remindAlarmCount = remindAlarmCount;
            return this;
        }
        public Integer getRemindAlarmCount() {
            return this.remindAlarmCount;
        }

        public DescribeContainerStatisticsResponseBodyData setSeriousAlarmCount(Integer seriousAlarmCount) {
            this.seriousAlarmCount = seriousAlarmCount;
            return this;
        }
        public Integer getSeriousAlarmCount() {
            return this.seriousAlarmCount;
        }

        public DescribeContainerStatisticsResponseBodyData setSuspiciousAlarmCount(Integer suspiciousAlarmCount) {
            this.suspiciousAlarmCount = suspiciousAlarmCount;
            return this;
        }
        public Integer getSuspiciousAlarmCount() {
            return this.suspiciousAlarmCount;
        }

        public DescribeContainerStatisticsResponseBodyData setTotalAlarmCount(Integer totalAlarmCount) {
            this.totalAlarmCount = totalAlarmCount;
            return this;
        }
        public Integer getTotalAlarmCount() {
            return this.totalAlarmCount;
        }

        public DescribeContainerStatisticsResponseBodyData setTotalNode(Integer totalNode) {
            this.totalNode = totalNode;
            return this;
        }
        public Integer getTotalNode() {
            return this.totalNode;
        }

        public DescribeContainerStatisticsResponseBodyData setHasRiskNode(Integer hasRiskNode) {
            this.hasRiskNode = hasRiskNode;
            return this;
        }
        public Integer getHasRiskNode() {
            return this.hasRiskNode;
        }

    }

}
