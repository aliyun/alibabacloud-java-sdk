// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeUsergpgkeyRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Revoke")
    public String revoke;

    public static RemoveLinkeantcodeAntcodeUsergpgkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeUsergpgkeyRequest self = new RemoveLinkeantcodeAntcodeUsergpgkeyRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyRequest setRevoke(String revoke) {
        this.revoke = revoke;
        return this;
    }
    public String getRevoke() {
        return this.revoke;
    }

}
