// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantMetricsRequest extends TeaModel {
    /**
     * <p>The end time of the time range for querying monitoring data.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The monitoring metrics.   </p>
     * <p>For more information about supported metrics, see [View tenant statistics](~~212125~~).</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The number of the page to return.    </p>
     * <p>- Start value: 1 </p>
     * <p>- Default value: 1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows to return on each page.   </p>
     * <p>- Maximum value: 100   </p>
     * <p>- Default value: 10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the time range for querying monitoring data.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant.   </p>
     * <p>> <br>This parameter will be deprecated. We recommend that you use the TenantIdList parameter instead.</p>
     */
    @NameInMap("TenantId")
    @Deprecated
    public String tenantId;

    /**
     * <p>The list of tenant IDs.</p>
     */
    @NameInMap("TenantIdList")
    public String tenantIdList;

    /**
     * <p>The name of the tenant.    </p>
     * <p>It must start with a letter or an underscore (_), and contain 2 to 20 characters, which can be uppercase letters, lowercase letters, digits, and underscores (_).  It cannot be set to sys.   </p>
     * <p>> <br>This parameter will be deprecated. We recommend that you use the TenantIdList parameter instead.</p>
     */
    @NameInMap("TenantName")
    @Deprecated
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
