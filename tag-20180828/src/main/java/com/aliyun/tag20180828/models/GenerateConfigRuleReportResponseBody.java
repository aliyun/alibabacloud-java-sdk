// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GenerateConfigRuleReportResponseBody extends TeaModel {
    /**
     * <p>The ID of the resource non-compliance report.</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateConfigRuleReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateConfigRuleReportResponseBody self = new GenerateConfigRuleReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateConfigRuleReportResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GenerateConfigRuleReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
