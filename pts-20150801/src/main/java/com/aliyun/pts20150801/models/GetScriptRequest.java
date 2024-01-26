// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class GetScriptRequest extends TeaModel {
    @NameInMap("ScriptId")
    public Integer scriptId;

    @NameInMap("Tfsname")
    public String tfsname;

    public static GetScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScriptRequest self = new GetScriptRequest();
        return TeaModel.build(map, self);
    }

    public GetScriptRequest setScriptId(Integer scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public Integer getScriptId() {
        return this.scriptId;
    }

    public GetScriptRequest setTfsname(String tfsname) {
        this.tfsname = tfsname;
        return this;
    }
    public String getTfsname() {
        return this.tfsname;
    }

}
