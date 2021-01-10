// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeProjectmemeberRequest extends TeaModel {
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

    @NameInMap("Token")
    public String token;

    @NameInMap("UserId")
    public String userId;

    public static AddLinkeantcodeAntcodeProjectmemeberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeProjectmemeberRequest self = new AddLinkeantcodeAntcodeProjectmemeberRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeProjectmemeberRequest setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public String getAccessLevel() {
        return this.accessLevel;
    }

    public AddLinkeantcodeAntcodeProjectmemeberRequest setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public AddLinkeantcodeAntcodeProjectmemeberRequest setExternUid(String externUid) {
        this.externUid = externUid;
        return this;
    }
    public String getExternUid() {
        return this.externUid;
    }

    public AddLinkeantcodeAntcodeProjectmemeberRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeProjectmemeberRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AddLinkeantcodeAntcodeProjectmemeberRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public AddLinkeantcodeAntcodeProjectmemeberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
