// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200804.models;

import com.aliyun.tea.*;

public class CancelReportShareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public Boolean result;

    public static CancelReportShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelReportShareResponseBody self = new CancelReportShareResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelReportShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelReportShareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CancelReportShareResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
