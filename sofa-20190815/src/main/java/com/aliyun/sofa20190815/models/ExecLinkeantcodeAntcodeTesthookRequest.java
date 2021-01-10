// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeTesthookRequest extends TeaModel {
    @NameInMap("HookId")
    public String hookId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeTesthookRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeTesthookRequest self = new ExecLinkeantcodeAntcodeTesthookRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeTesthookRequest setHookId(String hookId) {
        this.hookId = hookId;
        return this;
    }
    public String getHookId() {
        return this.hookId;
    }

    public ExecLinkeantcodeAntcodeTesthookRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeTesthookRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
