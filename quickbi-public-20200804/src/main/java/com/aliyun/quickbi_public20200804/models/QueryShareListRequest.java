// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200804.models;

import com.aliyun.tea.*;

public class QueryShareListRequest extends TeaModel {
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
