// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeCurrenttenantRequest extends TeaModel {
    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("WhiteListIp")
    public String whiteListIp;

    public static UpdateLinkeantcodeAntcodeCurrenttenantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeCurrenttenantRequest self = new UpdateLinkeantcodeAntcodeCurrenttenantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantRequest setWhiteListIp(String whiteListIp) {
        this.whiteListIp = whiteListIp;
        return this;
    }
    public String getWhiteListIp() {
        return this.whiteListIp;
    }

}
