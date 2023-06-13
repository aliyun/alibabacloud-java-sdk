// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class InstallCloudAssistantResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InstallCloudAssistantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudAssistantResponseBody self = new InstallCloudAssistantResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallCloudAssistantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
