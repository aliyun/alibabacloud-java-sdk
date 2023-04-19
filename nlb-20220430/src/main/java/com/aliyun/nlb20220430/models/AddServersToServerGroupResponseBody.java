// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class AddServersToServerGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the server group.</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    public static AddServersToServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddServersToServerGroupResponseBody self = new AddServersToServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddServersToServerGroupResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AddServersToServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddServersToServerGroupResponseBody setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

}
