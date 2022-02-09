// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRegionInfoResponseBody extends TeaModel {
    @NameInMap("RegionInfo")
    public DescribeRegionInfoResponseBodyRegionInfo regionInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRegionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionInfoResponseBody self = new DescribeRegionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionInfoResponseBody setRegionInfo(DescribeRegionInfoResponseBodyRegionInfo regionInfo) {
        this.regionInfo = regionInfo;
        return this;
    }
    public DescribeRegionInfoResponseBodyRegionInfo getRegionInfo() {
        return this.regionInfo;
    }

    public DescribeRegionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRegionInfoResponseBodyRegionInfo extends TeaModel {
        @NameInMap("Environment")
        public String environment;

        @NameInMap("FinanceTag")
        public String financeTag;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRegionInfoResponseBodyRegionInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionInfoResponseBodyRegionInfo self = new DescribeRegionInfoResponseBodyRegionInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRegionInfoResponseBodyRegionInfo setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public DescribeRegionInfoResponseBodyRegionInfo setFinanceTag(String financeTag) {
            this.financeTag = financeTag;
            return this;
        }
        public String getFinanceTag() {
            return this.financeTag;
        }

        public DescribeRegionInfoResponseBodyRegionInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
