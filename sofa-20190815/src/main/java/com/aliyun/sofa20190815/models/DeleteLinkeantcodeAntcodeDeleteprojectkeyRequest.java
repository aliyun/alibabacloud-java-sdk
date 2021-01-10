// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeleteprojectkeyRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeDeleteprojectkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeleteprojectkeyRequest self = new DeleteLinkeantcodeAntcodeDeleteprojectkeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectkeyRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
