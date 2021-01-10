// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("RulesType")
    public String rulesType;

    @NameInMap("SubmitterCanReview")
    public Boolean submitterCanReview;

    @NameInMap("Threshold")
    public Long threshold;

    @NameInMap("ThresholdClear")
    public Boolean thresholdClear;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody self = new UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setRulesType(String rulesType) {
        this.rulesType = rulesType;
        return this;
    }
    public String getRulesType() {
        return this.rulesType;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setSubmitterCanReview(Boolean submitterCanReview) {
        this.submitterCanReview = submitterCanReview;
        return this;
    }
    public Boolean getSubmitterCanReview() {
        return this.submitterCanReview;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setThresholdClear(Boolean thresholdClear) {
        this.thresholdClear = thresholdClear;
        return this;
    }
    public Boolean getThresholdClear() {
        return this.thresholdClear;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
