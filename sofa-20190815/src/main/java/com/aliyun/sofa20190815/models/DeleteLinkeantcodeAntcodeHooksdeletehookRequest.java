// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeHooksdeletehookRequest extends TeaModel {
    @NameInMap("HookId")
    public String hookId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeHooksdeletehookRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeHooksdeletehookRequest self = new DeleteLinkeantcodeAntcodeHooksdeletehookRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeHooksdeletehookRequest setHookId(String hookId) {
        this.hookId = hookId;
        return this;
    }
    public String getHookId() {
        return this.hookId;
    }

    public DeleteLinkeantcodeAntcodeHooksdeletehookRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeHooksdeletehookRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
