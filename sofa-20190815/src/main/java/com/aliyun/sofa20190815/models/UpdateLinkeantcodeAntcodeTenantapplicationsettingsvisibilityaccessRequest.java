// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessRequest extends TeaModel {
    @NameInMap("ParamJsonStr")
    public String paramJsonStr;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessRequest self = new UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessRequest setParamJsonStr(String paramJsonStr) {
        this.paramJsonStr = paramJsonStr;
        return this;
    }
    public String getParamJsonStr() {
        return this.paramJsonStr;
    }

    public UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
