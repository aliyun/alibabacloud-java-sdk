// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeNamespacememberRequest extends TeaModel {
    @NameInMap("AccessLevel")
    public String accessLevel;

    @NameInMap("ExpiresAt")
    public String expiresAt;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("UserId")
    public String userId;

    public static UpdateLinkeantcodeAntcodeNamespacememberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeNamespacememberRequest self = new UpdateLinkeantcodeAntcodeNamespacememberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeNamespacememberRequest setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public String getAccessLevel() {
        return this.accessLevel;
    }

    public UpdateLinkeantcodeAntcodeNamespacememberRequest setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public UpdateLinkeantcodeAntcodeNamespacememberRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeNamespacememberRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeNamespacememberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
