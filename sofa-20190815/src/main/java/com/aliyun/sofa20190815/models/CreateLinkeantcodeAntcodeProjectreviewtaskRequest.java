// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjectreviewtaskRequest extends TeaModel {
    @NameInMap("GlobPattern")
    public String globPattern;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ReviewId")
    public String reviewId;

    @NameInMap("UserId")
    public String userId;

    public static CreateLinkeantcodeAntcodeProjectreviewtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjectreviewtaskRequest self = new CreateLinkeantcodeAntcodeProjectreviewtaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjectreviewtaskRequest setGlobPattern(String globPattern) {
        this.globPattern = globPattern;
        return this;
    }
    public String getGlobPattern() {
        return this.globPattern;
    }

    public CreateLinkeantcodeAntcodeProjectreviewtaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeProjectreviewtaskRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeProjectreviewtaskRequest setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public String getReviewId() {
        return this.reviewId;
    }

    public CreateLinkeantcodeAntcodeProjectreviewtaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
