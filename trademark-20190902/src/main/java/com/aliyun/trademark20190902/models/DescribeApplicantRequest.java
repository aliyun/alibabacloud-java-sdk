// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeApplicantRequest extends TeaModel {
    @NameInMap("ApplicantId")
    public Long applicantId;

    public static DescribeApplicantRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicantRequest self = new DescribeApplicantRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicantRequest setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public Long getApplicantId() {
        return this.applicantId;
    }

}
