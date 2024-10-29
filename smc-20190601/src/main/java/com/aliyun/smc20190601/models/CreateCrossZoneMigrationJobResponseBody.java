// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateCrossZoneMigrationJobResponseBody extends TeaModel {
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
     * <p>A9DBD2F8-DE5A-5844-BA6F-957A996CBD78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCrossZoneMigrationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCrossZoneMigrationJobResponseBody self = new CreateCrossZoneMigrationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCrossZoneMigrationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateCrossZoneMigrationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
