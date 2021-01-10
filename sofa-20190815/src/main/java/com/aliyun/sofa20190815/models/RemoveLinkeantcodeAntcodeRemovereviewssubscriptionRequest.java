// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeRemovereviewssubscriptionRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("SubscriptionId")
    public String subscriptionId;

    public static RemoveLinkeantcodeAntcodeRemovereviewssubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeRemovereviewssubscriptionRequest self = new RemoveLinkeantcodeAntcodeRemovereviewssubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public RemoveLinkeantcodeAntcodeRemovereviewssubscriptionRequest setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

}
