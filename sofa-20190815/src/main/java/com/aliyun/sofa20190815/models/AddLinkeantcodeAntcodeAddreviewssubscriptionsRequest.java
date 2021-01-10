// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeAddreviewssubscriptionsRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("Id")
    public String id;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("UserId")
    public String userId;

    public static AddLinkeantcodeAntcodeAddreviewssubscriptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeAddreviewssubscriptionsRequest self = new AddLinkeantcodeAntcodeAddreviewssubscriptionsRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeAddreviewssubscriptionsRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AddLinkeantcodeAntcodeAddreviewssubscriptionsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeAddreviewssubscriptionsRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public AddLinkeantcodeAntcodeAddreviewssubscriptionsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AddLinkeantcodeAntcodeAddreviewssubscriptionsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
