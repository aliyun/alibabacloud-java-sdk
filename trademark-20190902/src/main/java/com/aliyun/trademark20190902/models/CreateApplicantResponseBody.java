// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CreateApplicantResponseBody extends TeaModel {
    @NameInMap("ApplicantId")
    public String applicantId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicantResponseBody self = new CreateApplicantResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicantResponseBody setApplicantId(String applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public String getApplicantId() {
        return this.applicantId;
    }

    public CreateApplicantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
