// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsDetailRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StatisticsType")
    public String statisticsType;

    @NameInMap("StatisticsTypeGatewayType")
    public String statisticsTypeGatewayType;

    @NameInMap("StatisticsTypeInstanceValue")
    public String statisticsTypeInstanceValue;

    public static DescribeExposedStatisticsDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedStatisticsDetailRequest self = new DescribeExposedStatisticsDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedStatisticsDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeExposedStatisticsDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExposedStatisticsDetailRequest setStatisticsType(String statisticsType) {
        this.statisticsType = statisticsType;
        return this;
    }
    public String getStatisticsType() {
        return this.statisticsType;
    }

    public DescribeExposedStatisticsDetailRequest setStatisticsTypeGatewayType(String statisticsTypeGatewayType) {
        this.statisticsTypeGatewayType = statisticsTypeGatewayType;
        return this;
    }
    public String getStatisticsTypeGatewayType() {
        return this.statisticsTypeGatewayType;
    }

    public DescribeExposedStatisticsDetailRequest setStatisticsTypeInstanceValue(String statisticsTypeInstanceValue) {
        this.statisticsTypeInstanceValue = statisticsTypeInstanceValue;
        return this;
    }
    public String getStatisticsTypeInstanceValue() {
        return this.statisticsTypeInstanceValue;
    }

}
