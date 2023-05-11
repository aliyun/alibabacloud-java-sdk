// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryShareListRequest extends TeaModel {
    /**
     * <p>The type of work being shared. Valid values:</p>
     * <br>
     * <p>*   product: BI portal</p>
     * <p>*   dashboard: dashboard</p>
     * <p>*   worksheet: workbook</p>
     * <p>*   dashboardOfflineQuery: self-service data retrieval</p>
     * <p>*   Analysis: Ad hoc analysis</p>
     * <p>*   DATAFORM</p>
     * <p>*   SCREEN: Data dashboard</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    public static QueryShareListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryShareListRequest self = new QueryShareListRequest();
        return TeaModel.build(map, self);
    }

    public QueryShareListRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
