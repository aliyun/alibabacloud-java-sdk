// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nir-2ca527b8de114ba4afb9</p>
     */
    @NameInMap("InspectionReportId")
    public String inspectionReportId;

    public static DescribeNisInspectionReportStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionReportStatusRequest self = new DescribeNisInspectionReportStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionReportStatusRequest setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

}
