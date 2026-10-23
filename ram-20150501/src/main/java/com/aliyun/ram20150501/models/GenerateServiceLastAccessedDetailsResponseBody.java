// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GenerateServiceLastAccessedDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ba536aab-84c6-43af-8bcb-aa2cae2a34e4</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>EEE5D280-31A0-1638-91CD-37EBDD282E7A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateServiceLastAccessedDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateServiceLastAccessedDetailsResponseBody self = new GenerateServiceLastAccessedDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateServiceLastAccessedDetailsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GenerateServiceLastAccessedDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
