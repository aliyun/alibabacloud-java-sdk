// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeUsergitoperateauthRequest extends TeaModel {
    @NameInMap("ExternalUserId")
    public String externalUserId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Token")
    public String token;

    public static CreateLinkeantcodeAntcodeUsergitoperateauthRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeUsergitoperateauthRequest self = new CreateLinkeantcodeAntcodeUsergitoperateauthRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeUsergitoperateauthRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public CreateLinkeantcodeAntcodeUsergitoperateauthRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeUsergitoperateauthRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
