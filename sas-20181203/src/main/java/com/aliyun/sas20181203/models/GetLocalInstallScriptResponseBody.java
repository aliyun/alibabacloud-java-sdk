// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLocalInstallScriptResponseBody extends TeaModel {
    @NameInMap("Script")
    public String script;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLocalInstallScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLocalInstallScriptResponseBody self = new GetLocalInstallScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLocalInstallScriptResponseBody setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public GetLocalInstallScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
