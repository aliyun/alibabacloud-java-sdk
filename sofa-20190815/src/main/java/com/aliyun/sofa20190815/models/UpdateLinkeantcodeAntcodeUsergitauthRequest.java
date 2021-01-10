// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUsergitauthRequest extends TeaModel {
    @NameInMap("ParamJsonStr")
    public String paramJsonStr;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static UpdateLinkeantcodeAntcodeUsergitauthRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUsergitauthRequest self = new UpdateLinkeantcodeAntcodeUsergitauthRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUsergitauthRequest setParamJsonStr(String paramJsonStr) {
        this.paramJsonStr = paramJsonStr;
        return this;
    }
    public String getParamJsonStr() {
        return this.paramJsonStr;
    }

    public UpdateLinkeantcodeAntcodeUsergitauthRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
