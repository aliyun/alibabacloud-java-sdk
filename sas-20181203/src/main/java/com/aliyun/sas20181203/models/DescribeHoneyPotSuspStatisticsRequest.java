// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHoneyPotSuspStatisticsRequest extends TeaModel {
    // The source of the request. Set the value to **honeypot**.
    @NameInMap("From")
    public String from;

    // The time range of the data to query. Unit: days.
    @NameInMap("StatisticsDays")
    public Integer statisticsDays;

    // The type of the asset to query. Valid values:
    // 
    // *   **vpcInstanceId**: VPC
    // *   **uuid**: server
    @NameInMap("StatisticsKeyType")
    public String statisticsKeyType;

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

    public DescribeHoneyPotSuspStatisticsRequest setStatisticsDays(Integer statisticsDays) {
        this.statisticsDays = statisticsDays;
        return this;
    }
    public Integer getStatisticsDays() {
        return this.statisticsDays;
    }

    public DescribeHoneyPotSuspStatisticsRequest setStatisticsKeyType(String statisticsKeyType) {
        this.statisticsKeyType = statisticsKeyType;
        return this;
    }
    public String getStatisticsKeyType() {
        return this.statisticsKeyType;
    }

}
