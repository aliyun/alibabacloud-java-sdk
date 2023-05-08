// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulFixStatisticsResponseBody extends TeaModel {
    @NameInMap("FixStat")
    public java.util.List<DescribeVulFixStatisticsResponseBodyFixStat> fixStat;

    @NameInMap("FixTotal")
    public DescribeVulFixStatisticsResponseBodyFixTotal fixTotal;

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
        @NameInMap("FixedTodayNum")
        public Integer fixedTodayNum;

        @NameInMap("FixedTotalNum")
        public Integer fixedTotalNum;

        @NameInMap("FixingNum")
        public Integer fixingNum;

        @NameInMap("NeedFixNum")
        public Integer needFixNum;

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
        @NameInMap("FixedTodayNum")
        public Integer fixedTodayNum;

        @NameInMap("FixedTotalNum")
        public Integer fixedTotalNum;

        @NameInMap("FixingNum")
        public Integer fixingNum;

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
