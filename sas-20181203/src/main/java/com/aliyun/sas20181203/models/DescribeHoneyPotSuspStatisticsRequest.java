// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHoneyPotSuspStatisticsRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("StatisticsKeyType")
    public String statisticsKeyType;

    @NameInMap("StatisticsDays")
    public Integer statisticsDays;

    public static DescribeHoneyPotSuspStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHoneyPotSuspStatisticsRequest self = new DescribeHoneyPotSuspStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHoneyPotSuspStatisticsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeHoneyPotSuspStatisticsRequest setStatisticsKeyType(String statisticsKeyType) {
        this.statisticsKeyType = statisticsKeyType;
        return this;
    }
    public String getStatisticsKeyType() {
        return this.statisticsKeyType;
    }

    public DescribeHoneyPotSuspStatisticsRequest setStatisticsDays(Integer statisticsDays) {
        this.statisticsDays = statisticsDays;
        return this;
    }
    public Integer getStatisticsDays() {
        return this.statisticsDays;
    }

}
