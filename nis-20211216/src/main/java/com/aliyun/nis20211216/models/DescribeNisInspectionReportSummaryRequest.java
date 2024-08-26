// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportSummaryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nir-38abb318b27b49cc9a01</p>
     */
    @NameInMap("InspectionReportId")
    public String inspectionReportId;

    public static DescribeNisInspectionReportSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionReportSummaryRequest self = new DescribeNisInspectionReportSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionReportSummaryRequest setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

}
