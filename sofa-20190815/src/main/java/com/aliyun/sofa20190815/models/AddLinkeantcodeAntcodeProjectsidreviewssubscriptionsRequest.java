// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("UserId")
    public String userId;

    public static AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsRequest self = new AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
