// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeGpgkeyRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeGpgkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeGpgkeyRequest self = new DeleteLinkeantcodeAntcodeGpgkeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeGpgkeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public DeleteLinkeantcodeAntcodeGpgkeyRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
