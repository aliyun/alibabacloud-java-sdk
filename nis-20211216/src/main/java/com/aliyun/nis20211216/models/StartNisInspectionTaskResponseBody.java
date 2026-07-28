// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class StartNisInspectionTaskResponseBody extends TeaModel {
    /**
     * <p>The inspection report ID.</p>
     * 
     * <strong>example:</strong>
     * <p>nir-9923e262c106461d****</p>
     */
    @NameInMap("InspectionReportId")
    public String inspectionReportId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartNisInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartNisInspectionTaskResponseBody self = new StartNisInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartNisInspectionTaskResponseBody setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    public StartNisInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
