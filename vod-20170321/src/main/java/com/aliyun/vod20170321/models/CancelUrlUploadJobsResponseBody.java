// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelUrlUploadJobsResponseBody extends TeaModel {
    /**
     * <p>The IDs of canceled jobs.</p>
     */
    @NameInMap("CanceledJobs")
    public java.util.List<String> canceledJobs;

    /**
     * <p>The jobs that do not exist.</p>
     */
    @NameInMap("NonExists")
    public java.util.List<String> nonExists;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelUrlUploadJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelUrlUploadJobsResponseBody self = new CancelUrlUploadJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelUrlUploadJobsResponseBody setCanceledJobs(java.util.List<String> canceledJobs) {
        this.canceledJobs = canceledJobs;
        return this;
    }
    public java.util.List<String> getCanceledJobs() {
        return this.canceledJobs;
    }

    public CancelUrlUploadJobsResponseBody setNonExists(java.util.List<String> nonExists) {
        this.nonExists = nonExists;
        return this;
    }
    public java.util.List<String> getNonExists() {
        return this.nonExists;
    }

    public CancelUrlUploadJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
