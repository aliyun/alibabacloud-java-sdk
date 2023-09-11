// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class RemoveServersFromServerGroupResponseBody extends TeaModel {
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

    public static RemoveServersFromServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveServersFromServerGroupResponseBody self = new RemoveServersFromServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveServersFromServerGroupResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public RemoveServersFromServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveServersFromServerGroupResponseBody setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

}
