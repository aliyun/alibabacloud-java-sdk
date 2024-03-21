// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class RemoveApplicantRequest extends TeaModel {
    @NameInMap("ApplicantId")
    public Long applicantId;

    public static RemoveApplicantRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicantRequest self = new RemoveApplicantRequest();
        return TeaModel.build(map, self);
    }

    public RemoveApplicantRequest setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public Long getApplicantId() {
        return this.applicantId;
    }

}
