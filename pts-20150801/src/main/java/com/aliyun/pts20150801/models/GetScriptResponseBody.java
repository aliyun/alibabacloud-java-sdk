// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class GetScriptResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Script")
    public String script;

    public static GetScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScriptResponseBody self = new GetScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScriptResponseBody setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

}
