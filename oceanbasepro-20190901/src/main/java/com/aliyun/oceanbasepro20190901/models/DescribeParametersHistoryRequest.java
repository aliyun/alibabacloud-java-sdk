// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersHistoryRequest extends TeaModel {
    // 参数类型。 当前支持集群（CLUSTER)和租户（TENANT）
    @NameInMap("Dimension")
    public String dimension;

    // 参数类型的资源标识。 如果为集群参数可以不填，若为租户的参数，则传入租户的TenantId。
    @NameInMap("DimensionValue")
    public String dimensionValue;

    // 参数历史查看的结束时间。
    @NameInMap("EndTime")
    public String endTime;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 分页查询的页码。 起始值：1 默认值：1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时设置的每页行数。 最大值：100 默认值：10
    @NameInMap("PageSize")
    public Integer pageSize;

    // 参数历史查看的起始时间。
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeParametersHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersHistoryRequest self = new DescribeParametersHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParametersHistoryRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DescribeParametersHistoryRequest setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
        return this;
    }
    public String getDimensionValue() {
        return this.dimensionValue;
    }

    public DescribeParametersHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeParametersHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeParametersHistoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeParametersHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeParametersHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
