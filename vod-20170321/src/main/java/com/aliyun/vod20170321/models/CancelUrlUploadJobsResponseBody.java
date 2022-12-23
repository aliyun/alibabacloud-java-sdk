// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelUrlUploadJobsResponseBody extends TeaModel {
    // The IDs of canceled jobs.
    @NameInMap("CanceledJobs")
    public java.util.List<String> canceledJobs;

    // The job IDs or upload URLs that do not exist.
    // 
    // If you set the request parameter JobIds, the job IDs that do not exist are returned. If you set the request parameter UploadUrls, the upload URLs that do not exist are returned.
    @NameInMap("NonExists")
    public java.util.List<String> nonExists;

    // The ID of the request.
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
