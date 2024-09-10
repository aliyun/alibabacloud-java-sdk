// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCustomizeReportResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90593A3B-85CE-5D87-A430-726D0B87****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomizeReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizeReportResponseBody self = new DeleteCustomizeReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizeReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
