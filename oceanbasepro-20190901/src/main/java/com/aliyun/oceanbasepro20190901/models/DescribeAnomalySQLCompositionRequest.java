// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLCompositionRequest extends TeaModel {
    // 参数历史查看的结束时间。
    @NameInMap("EndTime")
    public String endTime;

    // 分页查询的页码。 起始值：1 默认值：1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时设置的每页行数。 最大值：100 默认值：10
    @NameInMap("PageSize")
    public Integer pageSize;

    // 参数历史查看的起始时间。
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeAnomalySQLCompositionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLCompositionRequest self = new DescribeAnomalySQLCompositionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLCompositionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAnomalySQLCompositionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAnomalySQLCompositionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAnomalySQLCompositionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
