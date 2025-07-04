// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class InstallRCCloudAssistantResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>842B73C8-5776-4BD9-9872-69C8C46DD7D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InstallRCCloudAssistantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallRCCloudAssistantResponseBody self = new InstallRCCloudAssistantResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallRCCloudAssistantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
