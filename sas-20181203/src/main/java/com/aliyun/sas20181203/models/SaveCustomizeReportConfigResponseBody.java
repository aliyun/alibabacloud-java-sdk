// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveCustomizeReportConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the report.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11472B29-1A1C-5D7F-944B-7CD84319****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SaveCustomizeReportConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveCustomizeReportConfigResponseBody self = new SaveCustomizeReportConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveCustomizeReportConfigResponseBody setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public SaveCustomizeReportConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
