// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsDetailRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
    // 
    // >  We recommend that you do not leave this parameter empty.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The type of the exposed asset. Valid values:
    // 
    // *   **exposureType**: gateway assets
    // *   **exposurePort**: ports
    // *   **exposureComponent**: system components
    // *   **exposureIp**: IP addresses
    @NameInMap("StatisticsType")
    public String statisticsType;

    // The type of the gateway asset. This parameter is required when the **StatisticsType** parameter is set to **exposureType**. Valid values:
    // 
    // *   **SLB**: the public IP address of a Server Load Balancer (SLB) instance
    // *   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature
    @NameInMap("StatisticsTypeGatewayType")
    public String statisticsTypeGatewayType;

    // The ID of the gateway asset. This parameter is required when the **StatisticsType** parameter is set to **exposureType**.
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
