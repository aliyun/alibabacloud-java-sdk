// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetJobStatusRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among all requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** of each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the asynchronous task.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusRequest self = new GetJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetJobStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetJobStatusRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
