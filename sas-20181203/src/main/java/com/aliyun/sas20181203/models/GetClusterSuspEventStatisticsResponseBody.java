// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterSuspEventStatisticsResponseBody extends TeaModel {
    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>ACF97412-FD09-4D1F-994F-34DF12BR****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of alerts by severity level.</p>
     */
    @NameInMap("SuspStatistics")
    public GetClusterSuspEventStatisticsResponseBodySuspStatistics suspStatistics;

    public static GetClusterSuspEventStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterSuspEventStatisticsResponseBody self = new GetClusterSuspEventStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterSuspEventStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterSuspEventStatisticsResponseBody setSuspStatistics(GetClusterSuspEventStatisticsResponseBodySuspStatistics suspStatistics) {
        this.suspStatistics = suspStatistics;
        return this;
    }
    public GetClusterSuspEventStatisticsResponseBodySuspStatistics getSuspStatistics() {
        return this.suspStatistics;
    }

    public static class GetClusterSuspEventStatisticsResponseBodySuspStatistics extends TeaModel {
        /**
         * <p>The number of alerts with the reminder severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Remind")
        public Integer remind;

        /**
         * <p>The number of alerts with the urgent severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Serious")
        public Integer serious;

        /**
         * <p>The number of alerts with the suspicious severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Suspicious")
        public Integer suspicious;

        public static GetClusterSuspEventStatisticsResponseBodySuspStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetClusterSuspEventStatisticsResponseBodySuspStatistics self = new GetClusterSuspEventStatisticsResponseBodySuspStatistics();
            return TeaModel.build(map, self);
        }

        public GetClusterSuspEventStatisticsResponseBodySuspStatistics setRemind(Integer remind) {
            this.remind = remind;
            return this;
        }
        public Integer getRemind() {
            return this.remind;
        }

        public GetClusterSuspEventStatisticsResponseBodySuspStatistics setSerious(Integer serious) {
            this.serious = serious;
            return this;
        }
        public Integer getSerious() {
            return this.serious;
        }

        public GetClusterSuspEventStatisticsResponseBodySuspStatistics setSuspicious(Integer suspicious) {
            this.suspicious = suspicious;
            return this;
        }
        public Integer getSuspicious() {
            return this.suspicious;
        }

    }

}
