// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryShareListRequest extends TeaModel {
    /**
     * <p>The ID of the work. The works include data portal, dashboard, spreadsheet, self-service data retrieval, ad-hoc analysis, data entry, and data screen.</p>
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
