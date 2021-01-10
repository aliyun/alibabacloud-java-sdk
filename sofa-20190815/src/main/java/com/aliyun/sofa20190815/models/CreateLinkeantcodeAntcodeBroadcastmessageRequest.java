// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeBroadcastmessageRequest extends TeaModel {
    @NameInMap("ParamJsonStr")
    public String paramJsonStr;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeBroadcastmessageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeBroadcastmessageRequest self = new CreateLinkeantcodeAntcodeBroadcastmessageRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageRequest setParamJsonStr(String paramJsonStr) {
        this.paramJsonStr = paramJsonStr;
        return this;
    }
    public String getParamJsonStr() {
        return this.paramJsonStr;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
