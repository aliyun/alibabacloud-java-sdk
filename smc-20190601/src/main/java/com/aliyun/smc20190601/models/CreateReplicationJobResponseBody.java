// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateReplicationJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the migration job.</p>
     * 
     * <strong>example:</strong>
     * <p>j-bp17bclvg344jlyt****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C8B26B44-0189-443E-9816-D951F59623A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateReplicationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReplicationJobResponseBody self = new CreateReplicationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReplicationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateReplicationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
