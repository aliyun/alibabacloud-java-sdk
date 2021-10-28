// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class VerifyIvTokenRequest extends TeaModel {
    @NameInMap("Ip")
    public String ip;

    @NameInMap("IvToken")
    public String ivToken;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("SessionId")
    public String sessionId;

    public static VerifyIvTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyIvTokenRequest self = new VerifyIvTokenRequest();
        return TeaModel.build(map, self);
    }

    public VerifyIvTokenRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public VerifyIvTokenRequest setIvToken(String ivToken) {
        this.ivToken = ivToken;
        return this;
    }
    public String getIvToken() {
        return this.ivToken;
    }

    public VerifyIvTokenRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public VerifyIvTokenRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public VerifyIvTokenRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
