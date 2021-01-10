// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectreviewconfigRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("RulesType")
    public String rulesType;

    @NameInMap("SubmitterCanReview")
    public String submitterCanReview;

    @NameInMap("Threshold")
    public String threshold;

    @NameInMap("ThresholdClear")
    public String thresholdClear;

    public static UpdateLinkeantcodeAntcodeProjectreviewconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectreviewconfigRequest self = new UpdateLinkeantcodeAntcodeProjectreviewconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigRequest setRulesType(String rulesType) {
        this.rulesType = rulesType;
        return this;
    }
    public String getRulesType() {
        return this.rulesType;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigRequest setSubmitterCanReview(String submitterCanReview) {
        this.submitterCanReview = submitterCanReview;
        return this;
    }
    public String getSubmitterCanReview() {
        return this.submitterCanReview;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewconfigRequest setThresholdClear(String thresholdClear) {
        this.thresholdClear = thresholdClear;
        return this;
    }
    public String getThresholdClear() {
        return this.thresholdClear;
    }

}
