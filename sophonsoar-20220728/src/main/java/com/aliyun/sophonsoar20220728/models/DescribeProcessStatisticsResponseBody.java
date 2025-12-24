// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessStatisticsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Metrics")
    public DescribeProcessStatisticsResponseBodyMetrics metrics;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CFC0F8A-D600-5FFF-A0DF-3121C4C1B90F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProcessStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessStatisticsResponseBody self = new DescribeProcessStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessStatisticsResponseBody setMetrics(DescribeProcessStatisticsResponseBodyMetrics metrics) {
        this.metrics = metrics;
        return this;
    }
    public DescribeProcessStatisticsResponseBodyMetrics getMetrics() {
        return this.metrics;
    }

    public DescribeProcessStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProcessStatisticsResponseBodyMetrics extends TeaModel {
        /**
         * <p>The number of blocked files.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BanFileNum")
        public Integer banFileNum;

        /**
         * <p>The number of blocked IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BanIpNum")
        public Integer banIpNum;

        /**
         * <p>The number of blocked processes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BanProcessNum")
        public Integer banProcessNum;

        /**
         * <p>The number of handling tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskNum")
        public Integer taskNum;

        public static DescribeProcessStatisticsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessStatisticsResponseBodyMetrics self = new DescribeProcessStatisticsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeProcessStatisticsResponseBodyMetrics setBanFileNum(Integer banFileNum) {
            this.banFileNum = banFileNum;
            return this;
        }
        public Integer getBanFileNum() {
            return this.banFileNum;
        }

        public DescribeProcessStatisticsResponseBodyMetrics setBanIpNum(Integer banIpNum) {
            this.banIpNum = banIpNum;
            return this;
        }
        public Integer getBanIpNum() {
            return this.banIpNum;
        }

        public DescribeProcessStatisticsResponseBodyMetrics setBanProcessNum(Integer banProcessNum) {
            this.banProcessNum = banProcessNum;
            return this;
        }
        public Integer getBanProcessNum() {
            return this.banProcessNum;
        }

        public DescribeProcessStatisticsResponseBodyMetrics setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

    }

}
