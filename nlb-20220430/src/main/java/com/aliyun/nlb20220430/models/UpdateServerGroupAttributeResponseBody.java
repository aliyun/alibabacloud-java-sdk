// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateServerGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The server group ID.</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    public static UpdateServerGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerGroupAttributeResponseBody self = new UpdateServerGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServerGroupAttributeResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateServerGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateServerGroupAttributeResponseBody setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

}
