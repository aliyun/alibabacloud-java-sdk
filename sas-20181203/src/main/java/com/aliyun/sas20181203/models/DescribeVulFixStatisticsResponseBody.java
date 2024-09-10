// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulFixStatisticsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the statistics of vulnerability fixes by vulnerability type.</p>
     */
    @NameInMap("FixStat")
    public java.util.List<DescribeVulFixStatisticsResponseBodyFixStat> fixStat;

    /**
     * <p>The total statistics of vulnerability fixes.</p>
     */
    @NameInMap("FixTotal")
    public DescribeVulFixStatisticsResponseBodyFixTotal fixTotal;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVulFixStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulFixStatisticsResponseBody self = new DescribeVulFixStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulFixStatisticsResponseBody setFixStat(java.util.List<DescribeVulFixStatisticsResponseBodyFixStat> fixStat) {
        this.fixStat = fixStat;
        return this;
    }
    public java.util.List<DescribeVulFixStatisticsResponseBodyFixStat> getFixStat() {
        return this.fixStat;
    }

    public DescribeVulFixStatisticsResponseBody setFixTotal(DescribeVulFixStatisticsResponseBodyFixTotal fixTotal) {
        this.fixTotal = fixTotal;
        return this;
    }
    public DescribeVulFixStatisticsResponseBodyFixTotal getFixTotal() {
        return this.fixTotal;
    }

    public DescribeVulFixStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVulFixStatisticsResponseBodyFixStat extends TeaModel {
        /**
         * <p>The number of vulnerabilities that are fixed on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FixedTodayNum")
        public Integer fixedTodayNum;

        /**
         * <p>The total number of fixed vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("FixedTotalNum")
        public Integer fixedTotalNum;

        /**
         * <p>The number of vulnerabilities that are being fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("FixingNum")
        public Integer fixingNum;

        /**
         * <p>The number of unfixed vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("NeedFixNum")
        public Integer needFixNum;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>emg</strong>: urgent vulnerability</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeVulFixStatisticsResponseBodyFixStat build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulFixStatisticsResponseBodyFixStat self = new DescribeVulFixStatisticsResponseBodyFixStat();
            return TeaModel.build(map, self);
        }

        public DescribeVulFixStatisticsResponseBodyFixStat setFixedTodayNum(Integer fixedTodayNum) {
            this.fixedTodayNum = fixedTodayNum;
            return this;
        }
        public Integer getFixedTodayNum() {
            return this.fixedTodayNum;
        }

        public DescribeVulFixStatisticsResponseBodyFixStat setFixedTotalNum(Integer fixedTotalNum) {
            this.fixedTotalNum = fixedTotalNum;
            return this;
        }
        public Integer getFixedTotalNum() {
            return this.fixedTotalNum;
        }

        public DescribeVulFixStatisticsResponseBodyFixStat setFixingNum(Integer fixingNum) {
            this.fixingNum = fixingNum;
            return this;
        }
        public Integer getFixingNum() {
            return this.fixingNum;
        }

        public DescribeVulFixStatisticsResponseBodyFixStat setNeedFixNum(Integer needFixNum) {
            this.needFixNum = needFixNum;
            return this;
        }
        public Integer getNeedFixNum() {
            return this.needFixNum;
        }

        public DescribeVulFixStatisticsResponseBodyFixStat setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeVulFixStatisticsResponseBodyFixTotal extends TeaModel {
        /**
         * <p>The number of vulnerabilities that are fixed on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("FixedTodayNum")
        public Integer fixedTodayNum;

        /**
         * <p>The total number of fixed vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("FixedTotalNum")
        public Integer fixedTotalNum;

        /**
         * <p>The number of vulnerabilities that are being fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("FixingNum")
        public Integer fixingNum;

        /**
         * <p>The number of unfixed vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>62</p>
         */
        @NameInMap("NeedFixNum")
        public Integer needFixNum;

        public static DescribeVulFixStatisticsResponseBodyFixTotal build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulFixStatisticsResponseBodyFixTotal self = new DescribeVulFixStatisticsResponseBodyFixTotal();
            return TeaModel.build(map, self);
        }

        public DescribeVulFixStatisticsResponseBodyFixTotal setFixedTodayNum(Integer fixedTodayNum) {
            this.fixedTodayNum = fixedTodayNum;
            return this;
        }
        public Integer getFixedTodayNum() {
            return this.fixedTodayNum;
        }

        public DescribeVulFixStatisticsResponseBodyFixTotal setFixedTotalNum(Integer fixedTotalNum) {
            this.fixedTotalNum = fixedTotalNum;
            return this;
        }
        public Integer getFixedTotalNum() {
            return this.fixedTotalNum;
        }

        public DescribeVulFixStatisticsResponseBodyFixTotal setFixingNum(Integer fixingNum) {
            this.fixingNum = fixingNum;
            return this;
        }
        public Integer getFixingNum() {
            return this.fixingNum;
        }

        public DescribeVulFixStatisticsResponseBodyFixTotal setNeedFixNum(Integer needFixNum) {
            this.needFixNum = needFixNum;
            return this;
        }
        public Integer getNeedFixNum() {
            return this.needFixNum;
        }

    }

}
