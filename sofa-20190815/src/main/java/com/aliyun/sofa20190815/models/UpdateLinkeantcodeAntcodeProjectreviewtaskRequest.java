// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectreviewtaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ReviewId")
    public String reviewId;

    @NameInMap("ReviewTaskId")
    public String reviewTaskId;

    public static UpdateLinkeantcodeAntcodeProjectreviewtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectreviewtaskRequest self = new UpdateLinkeantcodeAntcodeProjectreviewtaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskRequest setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public String getReviewId() {
        return this.reviewId;
    }

    public UpdateLinkeantcodeAntcodeProjectreviewtaskRequest setReviewTaskId(String reviewTaskId) {
        this.reviewTaskId = reviewTaskId;
        return this;
    }
    public String getReviewTaskId() {
        return this.reviewTaskId;
    }

}
