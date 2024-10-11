// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class SubmitSparkSQLResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>j202104261729hangzhou224ee5230000930</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>B570310A-8A49-461B-B81D-AE0B58D63DA4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSparkSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkSQLResponseBody self = new SubmitSparkSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSparkSQLResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitSparkSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
