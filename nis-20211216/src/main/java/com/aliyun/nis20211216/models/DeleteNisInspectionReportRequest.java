// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNisInspectionReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nir-ffd1af****196d0</p>
     */
    @NameInMap("InspectionReportId")
    public String inspectionReportId;

    public static DeleteNisInspectionReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNisInspectionReportRequest self = new DeleteNisInspectionReportRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNisInspectionReportRequest setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

}
