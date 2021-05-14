// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsDetailRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("StatisticsType")
    public String statisticsType;

    @NameInMap("StatisticsTypeInstanceValue")
    public String statisticsTypeInstanceValue;

    @NameInMap("StatisticsTypeGatewayType")
    public String statisticsTypeGatewayType;

    public static DescribeExposedStatisticsDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedStatisticsDetailRequest self = new DescribeExposedStatisticsDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedStatisticsDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExposedStatisticsDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeExposedStatisticsDetailRequest setStatisticsType(String statisticsType) {
        this.statisticsType = statisticsType;
        return this;
    }
    public String getStatisticsType() {
        return this.statisticsType;
    }

    public DescribeExposedStatisticsDetailRequest setStatisticsTypeInstanceValue(String statisticsTypeInstanceValue) {
        this.statisticsTypeInstanceValue = statisticsTypeInstanceValue;
        return this;
    }
    public String getStatisticsTypeInstanceValue() {
        return this.statisticsTypeInstanceValue;
    }

    public DescribeExposedStatisticsDetailRequest setStatisticsTypeGatewayType(String statisticsTypeGatewayType) {
        this.statisticsTypeGatewayType = statisticsTypeGatewayType;
        return this;
    }
    public String getStatisticsTypeGatewayType() {
        return this.statisticsTypeGatewayType;
    }

}
