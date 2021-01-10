// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeUserkeysRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeUserkeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeUserkeysRequest self = new DeleteLinkeantcodeAntcodeUserkeysRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeUserkeysRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public DeleteLinkeantcodeAntcodeUserkeysRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
