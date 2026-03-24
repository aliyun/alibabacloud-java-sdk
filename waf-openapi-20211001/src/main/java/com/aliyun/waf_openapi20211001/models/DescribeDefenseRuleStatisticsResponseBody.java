// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseRuleStatisticsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rule statistics that are grouped by the specified conditions.</p>
     */
    @NameInMap("StatisticsInfos")
    public java.util.List<DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos> statisticsInfos;

    public static DescribeDefenseRuleStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRuleStatisticsResponseBody self = new DescribeDefenseRuleStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRuleStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseRuleStatisticsResponseBody setStatisticsInfos(java.util.List<DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos> statisticsInfos) {
        this.statisticsInfos = statisticsInfos;
        return this;
    }
    public java.util.List<DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos> getStatisticsInfos() {
        return this.statisticsInfos;
    }

    public static class DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos extends TeaModel {
        /**
         * <p>The number of rules that match the specified grouping conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The value of the quaternary grouping condition.</p>
         * 
         * <strong>example:</strong>
         * <p>action</p>
         */
        @NameInMap("FourthValue")
        public String fourthValue;

        /**
         * <p>The value of the primary grouping condition.</p>
         * 
         * <strong>example:</strong>
         * <p>sytem</p>
         */
        @NameInMap("PrimaryValue")
        public String primaryValue;

        /**
         * <p>The value of the secondary grouping condition.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("SecondaryValue")
        public String secondaryValue;

        /**
         * <p>The value of the tertiary grouping condition.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ThirdValue")
        public String thirdValue;

        public static DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos self = new DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos setFourthValue(String fourthValue) {
            this.fourthValue = fourthValue;
            return this;
        }
        public String getFourthValue() {
            return this.fourthValue;
        }

        public DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos setPrimaryValue(String primaryValue) {
            this.primaryValue = primaryValue;
            return this;
        }
        public String getPrimaryValue() {
            return this.primaryValue;
        }

        public DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos setSecondaryValue(String secondaryValue) {
            this.secondaryValue = secondaryValue;
            return this;
        }
        public String getSecondaryValue() {
            return this.secondaryValue;
        }

        public DescribeDefenseRuleStatisticsResponseBodyStatisticsInfos setThirdValue(String thirdValue) {
            this.thirdValue = thirdValue;
            return this;
        }
        public String getThirdValue() {
            return this.thirdValue;
        }

    }

}
