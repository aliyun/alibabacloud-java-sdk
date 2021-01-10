// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeApiaddnamespacememberRequest extends TeaModel {
    @NameInMap("AccessLevel")
    public String accessLevel;

    @NameInMap("ExpiresAt")
    public String expiresAt;

    @NameInMap("ExternUid")
    public String externUid;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("UserId")
    public String userId;

    public static AddLinkeantcodeAntcodeApiaddnamespacememberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeApiaddnamespacememberRequest self = new AddLinkeantcodeAntcodeApiaddnamespacememberRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeApiaddnamespacememberRequest setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public String getAccessLevel() {
        return this.accessLevel;
    }

    public AddLinkeantcodeAntcodeApiaddnamespacememberRequest setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public AddLinkeantcodeAntcodeApiaddnamespacememberRequest setExternUid(String externUid) {
        this.externUid = externUid;
        return this;
    }
    public String getExternUid() {
        return this.externUid;
    }

    public AddLinkeantcodeAntcodeApiaddnamespacememberRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeApiaddnamespacememberRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AddLinkeantcodeAntcodeApiaddnamespacememberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
