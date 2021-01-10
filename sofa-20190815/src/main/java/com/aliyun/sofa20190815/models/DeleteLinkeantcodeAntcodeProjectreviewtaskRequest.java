// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeProjectreviewtaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ReviewId")
    public String reviewId;

    @NameInMap("ReviewTaskId")
    public String reviewTaskId;

    public static DeleteLinkeantcodeAntcodeProjectreviewtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeProjectreviewtaskRequest self = new DeleteLinkeantcodeAntcodeProjectreviewtaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskRequest setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public String getReviewId() {
        return this.reviewId;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskRequest setReviewTaskId(String reviewTaskId) {
        this.reviewTaskId = reviewTaskId;
        return this;
    }
    public String getReviewTaskId() {
        return this.reviewTaskId;
    }

}
