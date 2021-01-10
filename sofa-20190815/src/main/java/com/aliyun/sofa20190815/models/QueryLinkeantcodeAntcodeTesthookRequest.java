// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeTesthookRequest extends TeaModel {
    @NameInMap("HookId")
    public String hookId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeTesthookRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeTesthookRequest self = new QueryLinkeantcodeAntcodeTesthookRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeTesthookRequest setHookId(String hookId) {
        this.hookId = hookId;
        return this;
    }
    public String getHookId() {
        return this.hookId;
    }

    public QueryLinkeantcodeAntcodeTesthookRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeTesthookRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
