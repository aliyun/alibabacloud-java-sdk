// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHoneyPotSuspStatisticsRequest extends TeaModel {
    /**
     * <p>The source of the request. Set the value to <strong>honeypot</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>honeypot</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The time range of the data to query. Unit: days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("StatisticsDays")
    public Integer statisticsDays;

    /**
     * <p>The type of the asset to query. Valid values:</p>
     * <ul>
     * <li><strong>vpcInstanceId</strong>: VPC</li>
     * <li><strong>uuid</strong>: server</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcInstanceId</p>
     */
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

    public DescribeHoneyPotSuspStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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
