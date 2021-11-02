// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLocalUninstallScriptResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Script")
    public String script;

    public static GetLocalUninstallScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLocalUninstallScriptResponseBody self = new GetLocalUninstallScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLocalUninstallScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLocalUninstallScriptResponseBody setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

}
