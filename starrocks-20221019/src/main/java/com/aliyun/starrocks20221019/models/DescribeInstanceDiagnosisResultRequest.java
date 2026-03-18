// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstanceDiagnosisResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>table_analysis</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2026-03-08</p>
     */
    @NameInMap("ReportDate")
    public String reportDate;

    /**
     * <strong>example:</strong>
     * <p>healthy</p>
     */
    @NameInMap("Statuses")
    public String statuses;

    public static DescribeInstanceDiagnosisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDiagnosisResultRequest self = new DescribeInstanceDiagnosisResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDiagnosisResultRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DescribeInstanceDiagnosisResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceDiagnosisResultRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceDiagnosisResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceDiagnosisResultRequest setReportDate(String reportDate) {
        this.reportDate = reportDate;
        return this;
    }
    public String getReportDate() {
        return this.reportDate;
    }

    public DescribeInstanceDiagnosisResultRequest setStatuses(String statuses) {
        this.statuses = statuses;
        return this;
    }
    public String getStatuses() {
        return this.statuses;
    }

}
