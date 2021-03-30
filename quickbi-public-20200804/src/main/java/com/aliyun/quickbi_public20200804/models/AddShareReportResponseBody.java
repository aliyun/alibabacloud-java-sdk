// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200804.models;

import com.aliyun.tea.*;

public class AddShareReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public Boolean result;

    public static AddShareReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddShareReportResponseBody self = new AddShareReportResponseBody();
        return TeaModel.build(map, self);
    }

    public AddShareReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddShareReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddShareReportResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
