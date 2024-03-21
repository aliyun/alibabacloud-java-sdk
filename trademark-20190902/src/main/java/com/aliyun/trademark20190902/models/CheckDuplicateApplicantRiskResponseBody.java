// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckDuplicateApplicantRiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static CheckDuplicateApplicantRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDuplicateApplicantRiskResponseBody self = new CheckDuplicateApplicantRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDuplicateApplicantRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDuplicateApplicantRiskResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
