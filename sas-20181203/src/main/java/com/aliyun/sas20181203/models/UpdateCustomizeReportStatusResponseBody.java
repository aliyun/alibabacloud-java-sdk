// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCustomizeReportStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64C76BEE-6A47-54D9-BD91-BD3E8A1B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomizeReportStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomizeReportStatusResponseBody self = new UpdateCustomizeReportStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomizeReportStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
