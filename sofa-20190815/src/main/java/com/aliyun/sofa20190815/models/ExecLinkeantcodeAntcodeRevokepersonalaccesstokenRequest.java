// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeRevokepersonalaccesstokenRequest extends TeaModel {
    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Token")
    public String token;

    public static ExecLinkeantcodeAntcodeRevokepersonalaccesstokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeRevokepersonalaccesstokenRequest self = new ExecLinkeantcodeAntcodeRevokepersonalaccesstokenRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeRevokepersonalaccesstokenRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public ExecLinkeantcodeAntcodeRevokepersonalaccesstokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
