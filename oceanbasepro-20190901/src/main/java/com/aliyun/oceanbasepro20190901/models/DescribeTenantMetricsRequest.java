// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantMetricsRequest extends TeaModel {
    // 参数历史查看的结束时间。
    @NameInMap("EndTime")
    public String endTime;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 监控指标
    @NameInMap("Metrics")
    public String metrics;

    // 分页查询的页码。 起始值：1 默认值：1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时设置的每页行数。 最大值：100 默认值：10
    @NameInMap("PageSize")
    public Integer pageSize;

    // 参数历史查看的起始时间。
    @NameInMap("StartTime")
    public String startTime;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    // 租户ID列表
    @NameInMap("TenantIdList")
    public String tenantIdList;

    // 租户名称。 长度为2~20 个字符，支持英文字母、数字和下划线，区分大小写，必须以字母或下划线开头。 不可设置为 sys。
    @NameInMap("TenantName")
    public String tenantName;

    public static DescribeTenantMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantMetricsRequest self = new DescribeTenantMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTenantMetricsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTenantMetricsRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public DescribeTenantMetricsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTenantMetricsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTenantMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTenantMetricsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeTenantMetricsRequest setTenantIdList(String tenantIdList) {
        this.tenantIdList = tenantIdList;
        return this;
    }
    public String getTenantIdList() {
        return this.tenantIdList;
    }

    public DescribeTenantMetricsRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
