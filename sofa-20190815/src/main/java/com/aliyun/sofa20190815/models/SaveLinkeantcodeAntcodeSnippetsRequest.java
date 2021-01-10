// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeantcodeAntcodeSnippetsRequest extends TeaModel {
    @NameInMap("ParamJsonStr")
    public String paramJsonStr;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static SaveLinkeantcodeAntcodeSnippetsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeantcodeAntcodeSnippetsRequest self = new SaveLinkeantcodeAntcodeSnippetsRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeantcodeAntcodeSnippetsRequest setParamJsonStr(String paramJsonStr) {
        this.paramJsonStr = paramJsonStr;
        return this;
    }
    public String getParamJsonStr() {
        return this.paramJsonStr;
    }

    public SaveLinkeantcodeAntcodeSnippetsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
