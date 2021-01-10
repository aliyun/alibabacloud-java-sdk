// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeGpgkeyRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeGpgkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeGpgkeyRequest self = new CreateLinkeantcodeAntcodeGpgkeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeGpgkeyRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateLinkeantcodeAntcodeGpgkeyRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
