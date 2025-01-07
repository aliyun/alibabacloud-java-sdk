// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceVulStatisticsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1EE7B150-D67E-53FD-A52D-3E8E669A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics of the vulnerabilities.</p>
     */
    @NameInMap("VulStat")
    public DescribeInstanceVulStatisticsResponseBodyVulStat vulStat;

    public static DescribeInstanceVulStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVulStatisticsResponseBody self = new DescribeInstanceVulStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceVulStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceVulStatisticsResponseBody setVulStat(DescribeInstanceVulStatisticsResponseBodyVulStat vulStat) {
        this.vulStat = vulStat;
        return this;
    }
    public DescribeInstanceVulStatisticsResponseBodyVulStat getVulStat() {
        return this.vulStat;
    }

    public static class DescribeInstanceVulStatisticsResponseBodyVulStat extends TeaModel {
        /**
         * <p>The number of high-risk vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AsapCount")
        public String asapCount;

        /**
         * <p>The number of medium-risk vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LaterCount")
        public String laterCount;

        /**
         * <p>The number of low-risk vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NntfCount")
        public String nntfCount;

        public static DescribeInstanceVulStatisticsResponseBodyVulStat build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceVulStatisticsResponseBodyVulStat self = new DescribeInstanceVulStatisticsResponseBodyVulStat();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceVulStatisticsResponseBodyVulStat setAsapCount(String asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public String getAsapCount() {
            return this.asapCount;
        }

        public DescribeInstanceVulStatisticsResponseBodyVulStat setLaterCount(String laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public String getLaterCount() {
            return this.laterCount;
        }

        public DescribeInstanceVulStatisticsResponseBodyVulStat setNntfCount(String nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public String getNntfCount() {
            return this.nntfCount;
        }

    }

}
