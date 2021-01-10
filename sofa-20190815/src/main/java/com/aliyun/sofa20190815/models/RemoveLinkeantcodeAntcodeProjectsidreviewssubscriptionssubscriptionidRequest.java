// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("SubscriptionId")
    public String subscriptionId;

    public static RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidRequest self = new RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidRequest setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

}
