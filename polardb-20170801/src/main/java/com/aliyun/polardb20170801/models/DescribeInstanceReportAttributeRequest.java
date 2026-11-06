// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeInstanceReportAttributeRequest extends TeaModel {
    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the instance inspection report to query.</p>
     * 
     * <strong>example:</strong>
     * <p>report-001</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    public static DescribeInstanceReportAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceReportAttributeRequest self = new DescribeInstanceReportAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceReportAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceReportAttributeRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
