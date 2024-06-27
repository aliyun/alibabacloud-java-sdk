// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryShareListRequest extends TeaModel {
    /**
     * <p>The type of work being shared. Valid values:</p>
     * <ul>
     * <li>product: BI portal</li>
     * <li>dashboard: dashboard</li>
     * <li>worksheet: workbook</li>
     * <li>dashboardOfflineQuery: self-service data retrieval</li>
     * <li>Analysis: Ad hoc analysis</li>
     * <li>DATAFORM</li>
     * <li>SCREEN: Data dashboard</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6b407e50-e774-406b-9956-da2425c2****</p>
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
