// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationCustomizeReportChartResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>432B2D4E-C8D3-52E4-9F68-35E0C05F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperationCustomizeReportChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperationCustomizeReportChartResponseBody self = new OperationCustomizeReportChartResponseBody();
        return TeaModel.build(map, self);
    }

    public OperationCustomizeReportChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
