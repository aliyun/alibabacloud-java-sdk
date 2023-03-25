// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterVulStatisticsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics of the vulnerabilities.</p>
     */
    @NameInMap("VulStat")
    public DescribeClusterVulStatisticsResponseBodyVulStat vulStat;

    public static DescribeClusterVulStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterVulStatisticsResponseBody self = new DescribeClusterVulStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterVulStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterVulStatisticsResponseBody setVulStat(DescribeClusterVulStatisticsResponseBodyVulStat vulStat) {
        this.vulStat = vulStat;
        return this;
    }
    public DescribeClusterVulStatisticsResponseBodyVulStat getVulStat() {
        return this.vulStat;
    }

    public static class DescribeClusterVulStatisticsResponseBodyVulStat extends TeaModel {
        /**
         * <p>The number of high-risk vulnerabilities.</p>
         */
        @NameInMap("AsapCount")
        public String asapCount;

        /**
         * <p>The number of medium-risk vulnerabilities.</p>
         */
        @NameInMap("LaterCount")
        public String laterCount;

        /**
         * <p>The number of low-risk vulnerabilities.</p>
         */
        @NameInMap("NntfCount")
        public String nntfCount;

        public static DescribeClusterVulStatisticsResponseBodyVulStat build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterVulStatisticsResponseBodyVulStat self = new DescribeClusterVulStatisticsResponseBodyVulStat();
            return TeaModel.build(map, self);
        }

        public DescribeClusterVulStatisticsResponseBodyVulStat setAsapCount(String asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public String getAsapCount() {
            return this.asapCount;
        }

        public DescribeClusterVulStatisticsResponseBodyVulStat setLaterCount(String laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public String getLaterCount() {
            return this.laterCount;
        }

        public DescribeClusterVulStatisticsResponseBodyVulStat setNntfCount(String nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public String getNntfCount() {
            return this.nntfCount;
        }

    }

}
