// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeAcceptprojectreviewRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ReviewId")
    public String reviewId;

    public static ExecLinkeantcodeAntcodeAcceptprojectreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeAcceptprojectreviewRequest self = new ExecLinkeantcodeAntcodeAcceptprojectreviewRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeAcceptprojectreviewRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeAcceptprojectreviewRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public ExecLinkeantcodeAntcodeAcceptprojectreviewRequest setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public String getReviewId() {
        return this.reviewId;
    }

}
