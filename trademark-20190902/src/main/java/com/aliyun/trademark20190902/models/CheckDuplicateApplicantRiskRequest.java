// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckDuplicateApplicantRiskRequest extends TeaModel {
    @NameInMap("ApplicantName")
    public String applicantName;

    @NameInMap("EventSceneType")
    public Integer eventSceneType;

    public static CheckDuplicateApplicantRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDuplicateApplicantRiskRequest self = new CheckDuplicateApplicantRiskRequest();
        return TeaModel.build(map, self);
    }

    public CheckDuplicateApplicantRiskRequest setApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }
    public String getApplicantName() {
        return this.applicantName;
    }

    public CheckDuplicateApplicantRiskRequest setEventSceneType(Integer eventSceneType) {
        this.eventSceneType = eventSceneType;
        return this;
    }
    public Integer getEventSceneType() {
        return this.eventSceneType;
    }

}
