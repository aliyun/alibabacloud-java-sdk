// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallPmAgentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InstallPmAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallPmAgentResponseBody self = new InstallPmAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallPmAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
